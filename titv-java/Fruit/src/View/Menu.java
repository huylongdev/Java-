package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu<T> {

    private String title;
    private List<T> options;
    private Scanner scanner;

    public Menu() {
        options = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public Menu(String title, T[] options) {
        this.title = title;
        this.options = new ArrayList<>();
        for (T option : options) {
            this.options.add(option);
        }
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("========================================");
        System.out.println("\t\t" + title);
        System.out.println("========================================");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("----------------------------------------");
    }

    public void displayList(List<T> list, String listName) {
        System.out.println("========================================");
        System.out.println("\t\t" + listName);
        System.out.println("========================================");
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        } else {
            System.out.println("Danh sách rỗng");
        }
        System.out.println("----------------------------------------");
        System.out.println("Tổng số: " + list.size() + " " + listName);
    }

    public String getUserChoice() {
        System.out.print("Nhập lựa chọn của bạn: ");
        return scanner.nextLine();
    }

    public void run() {
        while (true) {
            displayMenu();
            String choice = getUserChoice();
            try {
                int intChoice = Integer.parseInt(choice);
                if (intChoice >= 1 && intChoice <= options.size()) {
                    execute(choice);
                } else {
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
            }
        }
    }

    public abstract void execute(String choice);
}