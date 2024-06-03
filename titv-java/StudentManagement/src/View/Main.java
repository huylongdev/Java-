import Controller.School;
import Model.Student;
import View.Validation;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        School school = new School();
        Validation validation = new Validation();
        while (true) {
            System.out.println("1. Add new student");
            System.out.println("2. View student(Sort by name)");
            System.out.println("3. Student with same city");
            System.out.println("4. Update Info");
            System.out.println("5. Report");
            System.out.println("6. Exit");
            int choice = validation.inputInt("Enter choice:", 1, 6);
            switch (choice) {
                case 1:
                    school.addNew();
                    break;
                case 2:
                    school.printList();
                    break;
                case 3:
                    school.check();
                    break;
                case 4:
                    school.findByID();
                    break;
                case 5:
                    school.report();
                    break;
                case 6:
                    return;
            }
        }
    }
}