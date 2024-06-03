package Model;

import java.util.Scanner;

public class Address {
    String country;
    String city;
    String district;
    String street;

    public Address(String country, String city, String district, String street) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void addNewOne(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country: ");
        this.country =sc.nextLine();
        System.out.println("Enter city: ");
        this.city = sc.nextLine();
        System.out.println("Enter district: ");
        this.district = sc.nextLine();
        System.out.println("Enter street: ");
        this.street = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Address :" +
                "country= " + country  +
                ", city= " + city  +
                ", district= " + district  +
                ", street= " + street;
    }

    public Address() {
    }
}
