package Model;

import java.util.Date;
import java.util.Scanner;

public class CreditCard extends Card {
    protected Date dateValid;
    protected double amountDue;
    protected double amountMax;

    public CreditCard(String cardID, String cardNumber, Date dateRelease, int cardType, Date dateValid, double amountDue, double amountMax) {
        super(cardID, cardNumber, dateRelease, cardType);
        this.dateValid = dateValid;
        this.amountDue = amountDue;
        this.amountMax = amountMax;
    }

    public Date getDateValid() {
        return dateValid;
    }

    public void setDateValid(Date dateValid) {
        this.dateValid = dateValid;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(double amountMax) {
        this.amountMax = amountMax;
    }

    @Override
    public String toString() {
        return "CreditCard: " + super.toString()+
                "dateValid=" + dateValid +
                ", amountDue=" + amountDue +
                ", amountMax=" + amountMax;
    }

    public Card createNewCard() {
        super.createNewCard();
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter amountDue");
            this.amountDue = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter amountMax");
            this.amountMax = sc.nextDouble();
            sc.nextLine();
        return this;
    }

    public CreditCard() {
    }
}
