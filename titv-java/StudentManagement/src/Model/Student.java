package Model;

import java.util.List;
import java.util.Scanner;

public class Student {
  private  String id;
  private String fullName;

  Address address;

    public Student(String id, String fullName, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Student addNewOne(){
        Address a = new Address();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id = sc.nextLine();
        System.out.println("Enter fullName: ");
        this.fullName = sc.nextLine();
        a.addNewOne();
        this.address = a;
        return this;
    }
    @Override
    public String toString() {
        return  "id= " + id  +
                ", fullName= " + fullName  +
                ", address= " + address ;
    }

}
