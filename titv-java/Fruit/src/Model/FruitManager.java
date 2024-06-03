package Model;

import View.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitManager extends Fruit {
    private List<Fruit> listOfFruit = new ArrayList<>();
    private Validation val;

    	
    public FruitManager(int fruitID, String fruitName, int price, int quantity, String origin, List<Fruit> listOfFruit, Validation val) {
        super(fruitID, fruitName, price, quantity, origin);
        this.listOfFruit = listOfFruit;
        this.val = val;
    }
    
    
    public FruitManager() {
    listOfFruit.add(new Fruit(1,"Apple",10,20,"VietNam"));
    listOfFruit.add(new Fruit(2,"Lemon",10,20,"VietNam"));
    listOfFruit.add(new Fruit(3,"Banana",10,20,"VietNam"));
    }

    public boolean isEmptyProduct() {
        return !super.getFruitName().isEmpty();
    }

    public void addFruit() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Add a New Fruit ===");
        System.out.print("ID: ");
        int fruitID = val.checkInputInteger();

        System.out.print("Name: ");
        String fruitName = val.checkInputString();

        System.out.print("Price: ");
        int price = val.checkInputInteger();

        System.out.print("Quantity: ");
        int quantity = val.checkInputInteger();

        System.out.print("Origin: ");
        String origin = val.checkInputString();

        Fruit fruit = new Fruit(fruitID, fruitName, price, quantity, origin);
        listOfFruit.add(fruit);
        System.out.println("New Fruit has been added successfully.");
    }

    public void showFruit() {
        System.out.println("\n=== List of Fruits ===");
        for (Fruit fruit : listOfFruit) {
            System.out.println(fruit);
        }
    }

    public void updateQuantity(Fruit fruit, int quantity) {
        fruit.setQuantity(quantity);
        System.out.println("Quantity updated successfully.");
    }
    public static void main(String[] args) {
    	FruitManager fm=new FruitManager();
    	fm.showFruit();
		
	}
}