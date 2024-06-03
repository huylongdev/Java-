package View;
import Controller.School;
import Model.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        School menu = new School();
        Validation validation = new Validation();
        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. View student(Sort by name)");
            System.out.println("3.students with same city");
            System.out.println("4. Update ");
            System.out.println("5. Report");
            System.out.println("6. Exit");
            int choice = validation.inputInt("Enter choice:", 1, 6);
            switch (choice) {
                case 1:
                    menu.addStudent();
                    break;
                case 2:
                    menu.printStudentList();
                    break;
                case 3:
                    menu.findStudentsByCity();
                    break;
                case 4:
                    menu.findByID();
                    break;
                case 5:
                    menu.report();
                    break;
                case 6:
                    return;
            }
        }
    }
}