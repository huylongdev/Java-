package Model;

import java.util.Scanner;

public class BitzStudent extends Student{
    double accScore;
    double mktScore;

    public BitzStudent(String id, String fullName, Address address, double accScore, double mktScore) {
        super(id, fullName, address);
        this.accScore = accScore;
        this.mktScore = mktScore;
    }

    public double getAcc() {
        return accScore;
    }

    public void setAcc(double acc) {
        this.accScore = accScore;
    }

    public double getMkt() {
        return mktScore;
    }

    public void setMkt(double mktScore) {
        this.mktScore = mktScore;
    }

    @Override
    public String toString() {
        return "BitzStudent " +
                "id=" + getId() +
                ", fullName=" + getFullName() +
                ", address=" + getAddress().toString() +
                ", accountant score=" + accScore +
                ", marketing=" + mktScore ;

    }

    public Student addNewOne(){
        super.addNewOne();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter accountant score: ");
        this.accScore = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter marketing score: ");
        this.mktScore = sc.nextDouble();
        sc.nextLine();
        return this;
    }
    public double calculateAverageScore() {
        return (2 * this.accScore + this.mktScore) / 3.0;
    }
    public BitzStudent() {
    }
}
