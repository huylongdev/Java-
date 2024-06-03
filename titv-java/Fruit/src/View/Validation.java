package View;

import java.util.Scanner;

public class Validation {
    private static final Scanner scanner = new Scanner(System.in);

    public String getValue(String message) {
        System.out.println(message);
        return scanner.nextLine().trim();
    }

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Error: Please enter a number within the range [" + min + ", " + max + "]");
                System.out.print("Retry:  ");
            }
        }
    }

    public static int checkInputInteger() {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                String inputString = scanner.nextLine().trim();
                input = Integer.parseInt(inputString);

                if (input > 0) {
                    validInput = true;
                } else {
                    System.err.println("Error: Please enter a number greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please try again");
            }
        }

        return input;
    }

    public static String checkInputString() {
        while (true) {
            String result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Error: Cannot accept an empty string!");
                System.out.print("Please enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Error: Please enter 'Y' or 'N'.");
            System.out.print("Please enter again: ");
        }
    }
}