package Model;

import java.util.Scanner;

public class ITStudent extends  Student{
    double java;
    double css;

    public ITStudent(String id, String fullName, Address address, double java, double css) {
        super(id, fullName, address);
        this.java = java;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public String toString() {
        return "ITStudent " +
                "id=" + getId() +
                ", fullName=" + getFullName() +
                ", address=" + getAddress().toString() +
                ", java=" + java +
                ", css=" + css ;

    }

    @Override

    public Student addNewOne(){
        super.addNewOne();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter java: ");
        this.java = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter css: ");
        this.css = sc.nextDouble();
        sc.nextLine();
        return this;
    }
    public double calculateAverageScore() {
        return (3 * this.java + this.css) / 4.0;
    }

    public ITStudent() {
    }
}
