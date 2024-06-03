package View;

import java.util.Scanner;

import Controller.FruitManagement;
import View.Menu;
import View.Validation;

public class Main {
	public static void main(String[] args) {
		Menu a = new Menu();
		Scanner sc = new Scanner(System.in);
		String[] options = {" Create Fruit", "View order", "Shopping(for Buyers)"," Exit"};
		int choice;
		FruitManagement menu = new FruitManagement();
		do {
			System.out.println("---------MENU--------");
			choice = a.getChoice(options);
			switch (choice) {
				case 1: 
					menu.createFruit();
					break;
				case 2:
					menu.viewOrder();
					break;
				case 3:
					menu.shopping();
					break;
				case 4:
					System.out.println("Exit successful");
					break;
			default:
				throw new AssertionError();
			}
		}while(true);
	}
}
