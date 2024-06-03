package Controller;

import Model.OrderManager;
import View.Menu;
import View.Validation;

import java.util.Scanner;

public class ShopManager extends Menu<String> {
    public static Scanner scanner = new Scanner(System.in);
    private static final String[] MENU_CHOICES = {"Create Fruit", "View Orders", "Shopping (for Buyer)", "Exit"};
    private OrderManager orderManager;

    public ShopManager() {
        super("FRUIT SHOP SYSTEM", MENU_CHOICES);
        orderManager = new OrderManager();
    }

    @Override
    public void execute(String choice) {
        switch (choice) {
            case "1" -> createNewFruit();
            case "2" -> OrderManager.printAllOrders();
            case "3" -> OrderManager.createOrder();
            case "4" -> exitApplication();
        }
    }

    public void createNewFruit() {
        System.out.println("=== Create New Fruit ===");

        while (true) {
            orderManager.addFruit();
            System.out.print("Do you want to continue adding fruits (Y/N)? ");

            if (!Validation.checkInputYN()) {
                break;
            }
        }

        System.out.println("=== Displaying All Created Fruits ===");
        OrderManager.displayFruitList();
    }

    private void exitApplication() {
        System.out.println("Exiting the Fruit Shop System. Thank you!");
        System.exit(0);
    }

    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();
        shopManager.run();
    }
}