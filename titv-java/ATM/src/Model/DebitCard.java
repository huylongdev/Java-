package Model;

import java.util.Date;
import java.util.Scanner;

public class DebitCard extends Card {
    protected Date dateValid;
    protected double amountRemain;


    public DebitCard(String cardID, String cardNumber, Date dateRelease, int cardType, Date dateValid, double amountRemain) {
        super(cardID, cardNumber, dateRelease, cardType);
        this.dateValid = dateValid;
        this.amountRemain = amountRemain;
    }

    public Date getDateValid() {
        return dateValid;
    }

    public void setDateValid(Date dateValid) {
        this.dateValid = dateValid;
    }

    public double getAmountRemain() {
        return amountRemain;
    }

    public void setAmountRemain(double amountRemain) {
        this.amountRemain = amountRemain;
    }

    @Override
    public String toString() {
        return "DebitCard: " + super.toString()+
                "dateValid= " + dateValid +
                ", amountRemain= " + amountRemain ;

    }

    public Card createNewCard() {
        super.createNewCard();
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter amountRemain");
            this.amountRemain = sc.nextDouble();
            sc.nextLine();
        return this;
    }

    public DebitCard() {
    }
}
