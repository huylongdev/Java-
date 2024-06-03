package Model;

import java.util.Scanner;

public class Fruit {
    private int fruitID;
    private String fruitName;
    private int Price;
    private int Quantity;
    private String Origin;
    public Fruit(int fruitID, String fruitName, int price, int quantity, String origin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.Price = price;
        this.Quantity = quantity;
        this.Origin = origin;
    }
    public Fruit() {}
    public Fruit(Fruit f) {

    }
    public int getFruitID() {
        return fruitID;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
    public String toString() {
        return "ID: " + fruitID + ", Name: " + fruitName + ", Price: " + Price + ", Quantity: " + Quantity + ", Origin: " + Origin;
    }

}
