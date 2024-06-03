package Model;
import Model.Fruit;
import Model.Order;
import View.Validation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class OrderManager {

    public Scanner sc = new Scanner(System.in);
    static ArrayList<Fruit> fruitList = new ArrayList<>();
    static Hashtable<String, ArrayList<Order>> shoppingList = new Hashtable<>();

    public void addFruit() {
        System.out.println("NEW FRUIT");

        System.out.print("ID: ");
        int id = Validation.checkInputInteger();

        System.out.print("Name: ");
        String name = Validation.checkInputString();

        boolean fruitExists = fruitList.stream().anyMatch(fruit -> fruit.getFruitName().equalsIgnoreCase(name));
        if (fruitExists) {
            System.out.println("Đã tồn tại tên này! Hãy nhập lại");
            return; 
        }

        System.out.print("Price: ");
        int price = Validation.checkInputInteger();

        System.out.print("Quantity: ");
        int quantity = Validation.checkInputInteger();

        System.out.print("Origin: ");
        String origin = Validation.checkInputString();

        Fruit newFruit = new Fruit(id, name, price, quantity, origin);
        fruitList.add(newFruit);

        System.out.println("Fruit mới đã được thêm vào.");
    }

    public static void createOrder() {
        while (true) {
            List<Fruit> availableFruits = getAvailableFruits();

            if (availableFruits.isEmpty()) {
                System.out.println("Xin lỗi, toàn bộ fruits đã hết!");
                break;
            }

            displayFruitList();

            System.out.print("Lựa chọn item (1-" + availableFruits.size() + ") hoặc nhấn 0 để hoàn thành ");
            int choice = Validation.checkInputLimit(0, availableFruits.size());

            if (choice == 0) {
                break;
            }

            Fruit selectedFruit = availableFruits.get(choice - 1);
            System.out.println("Lựa chọn của bạn: " + selectedFruit.getFruitName());

            String customerName = getCustomerName();
            int quantity = getQuantity(selectedFruit);

            updateOrderHistory(selectedFruit, customerName, quantity);

            updateFruitQuantity(selectedFruit, quantity);

            if (!confirmOrder()) {
                break;
            }
        }
    }

    private static List<Fruit> getAvailableFruits() {
        return fruitList.stream()
                .filter(fruit -> fruit.getQuantity() > 0)
                .toList();
    }

    private static String getCustomerName() {
        System.out.print("Tên: ");
        return Validation.checkInputString();
    }

    private static int getQuantity(Fruit selectedFruit) {
        System.out.print("Số lượng: ");
        return Validation.checkInputLimit(1, selectedFruit.getQuantity());
    }

    private static void updateOrderHistory(Fruit selectedFruit, String customerName, int quantity) {
        boolean found = false;
        ArrayList<Order> orderHistory = shoppingList.getOrDefault(customerName, new ArrayList<>());
        
        for (Order existingOrder : orderHistory) {
            if (existingOrder.getProductName().equals(selectedFruit.getFruitName())) {
                existingOrder.setQuantity(existingOrder.getQuantity() + quantity);
                existingOrder.setAmount(existingOrder.getAmount() + (quantity * selectedFruit.getPrice()));
                found = true;
                break;
            }
        }

        if (!found) {
            Order order = new Order(customerName, selectedFruit.getFruitName(), quantity, selectedFruit.getPrice());
            orderHistory.add(order);
        }

        shoppingList.put(customerName, orderHistory);
    }

    private static void updateFruitQuantity(Fruit selectedFruit, int quantity) {
        if (selectedFruit.getQuantity() > 0) {
            selectedFruit.setQuantity(selectedFruit.getQuantity() - quantity);
        }
    }

    private static boolean confirmOrder() {
        System.out.print("Do you want to order now (Y/N)? ");
        return Validation.checkInputYN();
    }


    public static void displayFruitList() {
        System.out.println("List of Fruit:");
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ |   ++ Price ++   | ++ Quantity ++ |");
        int itemNumber = 1;
        for (Fruit fruit : fruitList) {
            if (fruit.getQuantity() > 0) {
                System.out.printf("%12d %16s %16s %16dvnd %12d\n", itemNumber, fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice(), fruit.getQuantity());
                itemNumber++;
            }
        }
    }

    public static void printAllOrders() {
        System.out.println("Customer Orders:");

        for (String customerName : shoppingList.keySet()) {
            System.out.println("Customer: " + customerName);
            ArrayList<Order> orderHistory = shoppingList.get(customerName);

            if (orderHistory != null && !orderHistory.isEmpty()) {
                displayOrderHeader();

                int totalAmount = 0; 
                printOrderDetails(orderHistory, totalAmount);

                // Print the total amount spent by the customer
                System.out.println("Total Amount Spent: " + totalAmount + "vnd"); 
            } else {
                System.out.println("No orders found for this customer.");
            }

            System.out.println(); 
        }
    }

    private static void displayOrderHeader() {
        System.out.printf("%-20s | %-15s | %-12svnd | %-12s\n", "Product Name", "Quantity", "Price", "Amount");
    }

    private static void printOrderDetails(ArrayList<Order> orderHistory, int totalAmount) {
        for (Order order : orderHistory) {
            System.out.printf("%-20s | %-15d | %12dvnd | %12dvnd\n", order.getProductName(), order.getQuantity(),
                    order.getPrice(), order.getAmount());
            totalAmount += order.getAmount();
        }
    }
}