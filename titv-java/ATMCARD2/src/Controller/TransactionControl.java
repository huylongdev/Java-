package Controller;

import Model.*;
import View.Validation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static Controller.CardControl.cardList;

public class TransactionControl {
    ArrayList<Transaction> transactions = new ArrayList<>();
    Validation val;

    public TransactionControl(ArrayList<Transaction> transactions, Validation val) {
        this.transactions = transactions;
        this.val = val;
    }

    public TransactionControl() {
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Validation getVal() {
        return val;
    }

    public void setVal(Validation val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TransactionControl{" +
                "transactions=" + transactions +
                ", val=" + val +
                '}';
    }

    private boolean transactionLoaded = false;

    public void viewCard() throws CardException, TransactionDateException {
        if (!transactionLoaded) {
            loadTransactionFile();
            transactionLoaded = true;
        }
        for (Transaction card : transactions) {
            System.out.println(card);
        }
    }

    private void loadTransactionFile() throws CardException, TransactionDateException {
        String url = "D:\\Workspace\\titv-java\\ATMCARD2\\file.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(url);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(fileInputStream);
        while (sc.hasNextLine()) {
            String[] listCard = sc.nextLine().split(",");
            if (listCard.length >= 3) {
                String dateString = listCard[2];
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date dateRelease = null;
                try {
                    dateRelease = dateFormat.parse(dateString);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                listCard[3] = listCard[3].substring(0, listCard[3].length());
                Transaction newTransaction = new Transaction(listCard[0], listCard[1], dateRelease, Double.parseDouble(listCard[3]), listCard[4]);
                if (validateCardTransaction(newTransaction) && validateTransactionDate(dateRelease, listCard[1])) {
                    transactions.add(newTransaction);
                    update(newTransaction);
                } else {
                    System.out.println("Invalid data format in the file.");
                }


            } else {
                System.out.println("Invalid data format in the file.");
            }
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void addNew() throws CardException {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap TransactionID: ");
        String transactionID = sc.nextLine();
        System.out.println("Nhap CardID: ");
        String cardID = sc.nextLine();
        System.out.println("Nhap so tien: ");
        double money = sc.nextDouble();
        sc.nextLine();
        System.out.println("Description:");
        String description = sc.nextLine();
        System.out.println("Nhap TransactionDate (YYYY-MM-DD):");
        String dateString = sc.nextLine();
        Date transactionDate = parseDate(dateString);
        try {
            Transaction newTransaction = new Transaction(transactionID, cardID, transactionDate, money, description);
            if (validateCardTransaction(newTransaction) && validateTransactionDate(transactionDate, cardID)) {
                transactions.add(newTransaction);
                update(newTransaction);
                System.out.println("Giao dich duoc them vao thanh cong!");
            } else {
                System.out.println("Invalid data format .");
            }
        } catch (TransactionDateException e) {
            System.out.println(e.getMessage());
        }
    }

    private Date parseDate(String dateString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateString);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean validateTransactionDate(Date transactionDate, String cardID) throws TransactionDateException {
        if (transactionDate == null) {
            throw new TransactionDateException("Invalid date format. Please use YYYY-MM-DD.");
        }

        Card card = findCardByID(cardID);

        if (card == null) {
            throw new TransactionDateException("Khong tim thay Card");
        }
        if (transactionDate.before(card.getDateRelease())) {
            throw new TransactionDateException("Transaction date must be after the release date of the card.");
        }

        Date minimumDate = new Date(0);
        if (transactionDate.before(minimumDate)) {
            throw new TransactionDateException("Transaction date must be greater than or equal to 01/01/1900.");
        }
        return true;
    }

    private Card findCardByID(String cardID) {
        for (Card card : cardList) {
            if (card.getCardID().equals(cardID)) {
                return card;
            }
        }
        return null;
    }

    public class CardException extends Exception {
        public CardException(String message) {
            super(message);
        }
    }

    public class TransactionDateException extends Exception {
        public TransactionDateException(String message) {
            super(message);
        }
    }

    public boolean validateCardTransaction(Transaction transaction) throws CardException {
        for (Card card : cardList) {
            if (card.getCardID().equals(transaction.getCardID())) {
                if (card instanceof CreditCard) {
                    CreditCard creditCard = (CreditCard) card;
                    if (creditCard.getAmountDue() + transaction.getMoney() > creditCard.getAmountMax()) {
                        System.out.println("Fail transaction for: " + creditCard + " dont have enough money");
                        return false;
                    }
                } else if (card instanceof DebitCard) {
                    DebitCard debitCard = (DebitCard) card;
                    if (debitCard.getAmountRemain() < transaction.getMoney()) {
                        System.out.println("Fail transaction for:" + debitCard + " dont have enough money");
                        return false;
                    }
                } else if (card instanceof ATMCard) {
                    ATMCard atmCard = (ATMCard) card;
                    if (atmCard.getAmount() < transaction.getMoney()) {
                        System.out.println("Fail transaction for:" + atmCard + " dont have enough money");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean update(Transaction transaction) throws CardException {
        for (Card card : cardList) {
            if (card.getCardID().equals(transaction.getCardID())) {
                if (card instanceof CreditCard) {
                    CreditCard creditCard = (CreditCard) card;
                    creditCard.setAmountDue(creditCard.getAmountDue() + transaction.getMoney());
                } else if (card instanceof DebitCard) {
                    DebitCard debitCard = (DebitCard) card;
                    debitCard.setAmountRemain(debitCard.getAmountRemain() - transaction.getMoney());
                } else if (card instanceof ATMCard) {
                    ATMCard atmCard = (ATMCard) card;
                    atmCard.setAmount(atmCard.getAmount() - transaction.getMoney());
                }
            }
        }
        return true;
    }

    public void payment() throws TransactionDateException, CardException {
        double sum = 0;
        Set<String> countedCardIDs = new HashSet<>();
        for (int i = 0; i < transactions.size() - 1; i++) {
            for (int j = i + 1; j < transactions.size(); j++) {
                if (transactions.get(i).getCardID().equals(transactions.get(j).getCardID()) && !countedCardIDs.contains(transactions.get(i).getCardID())) {
                    sum=transactions.get(i).getMoney()+transactions.get(j).getMoney();
                    countedCardIDs.add(transactions.get(i).getCardID());
                    System.out.println(transactions.get(i).getCardID() +",total payment: "+ sum);
                    System.out.println("-----------------------");
                    break;
                }
            }
        }
    }
    public void result(){

    }
    }







