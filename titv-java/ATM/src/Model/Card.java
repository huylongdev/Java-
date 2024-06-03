package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Card {
    protected String cardID;
    protected String cardNumber;
    protected Date dateRelease;
    protected int cardType;


    public Card(String cardID, String cardNumber, Date dateRelease, int cardType) {
        this.cardID = cardID;
        this.cardNumber = cardNumber;
        this.dateRelease = dateRelease;
        this.cardType = cardType;
    }

    public Card() {
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return  "CardID= " + cardID  +
                ", CardNumber= " + cardNumber  +
                ", DateRelease=" + dateRelease +
                ", CardType= " + cardType;

    }

    public Card createNewCard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CardID");
        this.cardID = sc.nextLine();
        System.out.println("Enter CardNumber");
        this.cardNumber = sc.nextLine();
        System.out.println("Enter dateRelease");
        String dateString = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(dateString);
            this.dateRelease = date;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }
        System.out.println("Enter CardType");
        this.cardType = sc.nextInt();
        return this;
    }


}
