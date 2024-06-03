package model;

public class Contract {
    private String contractID;
    private String bookingID;
    private double prePayment;
    private double totalAmount;

    public Contract(String contractID, String bookingID, double prePayment, double totalAmount) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.prePayment = prePayment;
        this.totalAmount = totalAmount;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public double getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(double prePayment) {
        this.prePayment = prePayment;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    @Override
    public String toString() {
        return String.format("| %-12s | %-12s | %-15s | %-15s |", contractID, bookingID, prePayment, totalAmount);
    }
}
