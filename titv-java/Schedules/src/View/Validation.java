package View;
import java.util.Scanner;

public class Validation {


	    private Scanner sc = new Scanner(System.in);

	    public int inputInt(String mess, int min, int max) {
	        System.out.print(mess);
	        while(true) {
	            String input = sc.nextLine();
	            try {
	                int number = Integer.parseInt(input);
	                if (number < min || number > max) {
	                    System.out.print("RANGE " + min + ", " + max + ": ");
	                    continue;
	                }
	                return number;
	            } catch (Exception e) {
	                System.out.print("HÃY NHẬP MỘT INTEGER INPUT");
	            }
	        }
	    }

	    public double inputDouble(String mess, double min, double max) {
	        System.out.print(mess);
	        while(true) {
	            String input = sc.nextLine();
	            try {
	                double number = Double.parseDouble(input);
	                if (number < min || number > max) {
	                    System.out.print("RANGE " + min + ", " + max + ": ");
	                    continue;
	                }
	                return number;
	            } catch (Exception e) {
	                System.out.print("HÃY NHẬP MỘT DOUBLE INPUT ");
	            }
	        }
	    }

	    public String inputString(String mess,String regex) {
	        System.out.print(mess);
	        while(true) {
	            String input = sc.nextLine();
	            if (!input.matches(regex)) {
	                System.out.print("HÃY NHẬP INPUT MATCH("+regex+").");
	                continue;
	            }
	            return input;
	        }
	    }

	    public boolean checkInputYN(String mess) {
	        System.out.println(mess);
	        while (true) {
	            String result = sc.nextLine();
	            if (result.equalsIgnoreCase("Y")) {
	                return true;
	            }

	            if (result.equalsIgnoreCase("N")) {
	                return false;
	            }
	            System.err.println("HÃY NHẬP LẠI y/Y or n/N.");
	            System.out.print("NHẬP LẠI: ");
	        
	    }


	}
}
