package Model;

import java.util.Date;
import java.util.Scanner;

public class ATMCard extends Card {
    protected double amount;

    public ATMCard(String cardID, String cardNumber, Date dateRelease, int cardType, double amount) {
        super(cardID, cardNumber, dateRelease, cardType);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ATMCard: " + super.toString()+
                ", amount= " + amount;

    }
    public Card createNewCard() {
        super.createNewCard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        this.amount = sc.nextDouble();
        return this;
    }

    public ATMCard() {
    }
}
