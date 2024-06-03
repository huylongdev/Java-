package Model;

import java.util.Scanner;

public class BitzStudent extends Student{
    double acc;
    double mkt;

    public BitzStudent(String id, String fullName, Address address, double acc, double mkt) {
        super(id, fullName, address);
        this.acc = acc;
        this.mkt = mkt;
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    public double getMkt() {
        return mkt;
    }

    public void setMkt(double mkt) {
        this.mkt = mkt;
    }

    @Override
    public String toString() {
        return "BitzStudent " +
                "id=" + getId() +
                ", fullName=" + getFullName() +
                ", address=" + getAddress().toString() +
                ", acc=" + acc +
                ", mkt=" + mkt ;

    }

    public Student addNewOne(){
        super.addNewOne();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acc: ");
        this.acc = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter mkt: ");
        this.mkt = sc.nextDouble();
        sc.nextLine();
        return this;
    }
    public double calculateAverageScore() {
        return (2 * this.acc + this.mkt) / 3.0;
    }
}
