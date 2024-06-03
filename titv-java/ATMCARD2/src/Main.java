import Controller.CardControl;
import Controller.TransactionControl;
import Model.Card;
import Model.Transaction;
import View.Validation;

public class Main {
    public static void main(String[] args) throws Controller.TransactionControl.CardException, TransactionControl.TransactionDateException {
        CardControl cardControl = new CardControl();
        TransactionControl transactionControl = new TransactionControl();
        Validation validation = new Validation();

        while (true) {
            System.out.println("1. Add card");
            System.out.println("2. View card");
            System.out.println("3. View transaction");
            System.out.println("4. Create new transaction");
            System.out.println("5. Check payment");
            System.out.println("6. Exit");

            int choice = validation.inputInt("Enter choice:", 1, 6);

            switch (choice) {
                case 1:
                    cardControl.addNew();
                    break;
                case 2:
                    cardControl.show();
                    break;
                case 3:
                    transactionControl.viewCard();
                    break;
                case 4:
                   transactionControl.addNew();
                    break;
                case 5:
                 transactionControl.payment();
                    break;
                case 6:
                    return;
            }
        }
    }
}