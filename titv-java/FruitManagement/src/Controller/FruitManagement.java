package Controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import Model.Fruit;
import View.Validation;

public class FruitManagement{
	private ArrayList<Fruit> fruitList;
	private Hashtable<String, ArrayList<Fruit>> hashTable;
	
	public FruitManagement(int fruitID, String fruitName, int price, int quantity, String origin,  ArrayList<Fruit> fruitList) {
        this.fruitList = fruitList;
    }
    
    
 
	public FruitManagement() {
		fruitList = new ArrayList<>();
		hashTable = new Hashtable<>();
		fruitList.add(new Fruit(1,"Apple",10,24,"VietNam"));
		fruitList.add(new Fruit(2,"Lemon",120,50,"Australia"));
		fruitList.add(new Fruit(3,"Banana",200,30,"America"));
		fruitList.add(new Fruit(4,"Orange",30,30,"Japan"));
		fruitList.add(new Fruit(5,"Watermelon",50,30,"Korea"));
	}
	
	Validation data = new Validation();
	
	public void createFruit() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String nameFruit = data.getName("Enter Name fruit:");
			int idFruit = data.getInt("Enter ID fruit:");
			double priceFruit = data.getDouble("Enter Price Fruit: ");
			int quantityFruit = data.getInt("Enter Quantity Fruit: ");
			String originFruit = data.getOrigin("Enter origin Fruit: ");
			
			Fruit yn = new Fruit(idFruit, nameFruit, priceFruit, quantityFruit, originFruit);
			fruitList.add(yn);
			
			System.out.println("Do you want to continue (Y/N)?(PLS TYPE DOWN Y OR N)");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("Y")) {
				continue;
			}else {
				break;
			}
		}
	}

	public void shopping() {
	    ArrayList<Fruit> listOrder = new ArrayList<>();
	    listFruit();
	    while (true) {
	        int selected = data.getInt("Pls select item u wanna buy: ");
	        Fruit selectedFruit = null;
	        for (Fruit fruit : fruitList) {
	            if (fruit.getFruitId() == selected) {
	                selectedFruit = fruit;
	                System.out.println("your selection: " + fruit.getFruitName());
	                break;
	            }
	        }

	        if (selectedFruit != null) {
	            int quantity = data.getInt("Please input quantity: ");
	            boolean existFruit = false;
	            for (Fruit order : listOrder) {
	                if (order.getFruitId() == selectedFruit.getFruitId()) {
	                    order.setQuantity(order.getQuantity() + quantity);
	                    existFruit = true;
	                    break;
	                }
	            }
	            if (!existFruit) {
	                selectedFruit.setQuantity(quantity);
	                listOrder.add(selectedFruit);
	            }
	        }

	        String yn = data.getOrigin("Do u wanna continue buying? pls type down Y or N");
	        if (yn.equalsIgnoreCase("N")) {
	            break;
	        }
	    }

	    if (!listOrder.isEmpty()) {
	        System.out.println("| Product | Quantity |   Price   |   Amount   |");
	        double total = 0;
	        for (Fruit fruit : listOrder) {
	            double amount = fruit.getQuantity() * fruit.getPrice();
	            System.out.printf("| %-10s | %-10s | %-12s | %-10s |\n",
	                    fruit.getFruitName(),
	                    fruit.getQuantity(),
	                    fruit.getPrice() + "$",
	                    amount + "$"
	            );
	            total += amount;
	        }
	        System.out.printf("Total : ", total);
	        String nameCustomer = data.getName("Pls input your name: ");
	        hashTable.put(nameCustomer, listOrder);
	        System.out.println();
	        System.out.println("input successful");
	    }
	}
	
	public void listFruit() {
		System.out.println("List of fruit");
		System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Quantity ++ | ++ Price ++ |");
		for(Fruit fruit : fruitList) {
			System.out.printf("| %-10s | %-15s | %-15s | %-12s | %-12s | \n",
					fruit.getFruitId(),
					fruit.getFruitName(),
					fruit.getOrigin(),
					fruit.getQuantity(),
					fruit.getPrice() + "$");
		}
		
	}
	
	public void viewOrder() {
		for(String nameCustomer : hashTable.keySet()) {
			System.out.println("Customer: "+ nameCustomer);
			System.out.println("|  Product  | Quantity |  Price  |  Amount  |");
			double total = 0;
			for(Fruit view : hashTable.get(nameCustomer)) {
				System.out.printf("| %-10s | %-10s | %-12s | %-12s | \n",
						view.getFruitName(),
						view.getQuantity(),
						view.getPrice() + "$",
						view.getPrice() * view.getQuantity() + "$"
						);
				total += view.getPrice() * view.getQuantity() ;
				
			}
			System.out.printf("Total: "+ total);
		}
	}
	
	
}





//
//public class Product {
//	private List<Fruit> listOfFruit;
//	Validation val = new Validation();
//	
//	public Product() {
//		listOfFruit = new ArrayList<>();
//	}
//	public List<Fruit> getList(){
//		return listOfFruit;
//	}
//	public boolean isEmptyProduct() {
//		while(true) {
//			 if(listOfFruit.isEmpty()) {
//				 System.out.println("No fruit available");
//				 return true; // trả về đúng
//			 } else {
//				 return false; // trả về sai , tiếp tục chương trình
//			 }
//		}
//	}
//	
//	public void addFruit() {
//		 while(true) {
//			 int fruitId = val.getValidInteger("Enter fruit ID:");
//			 val.getValue("");
//			 String fruitName = val.getValueAndValid("Enter fruit name: ", "^[a-zA-Z]+$", "Invalid fruit name");
//			 double price = val.getValidDouble("Enter fruit price: ");
//			 int quantity = val.getValidInteger("Enter fruit quantity: ");
//			 val.getValue("");
//			 String origin = val.getValueAndValid("Enter fruit origin: ", "^[a-zA-Z]+$", "Invalid fruit origin");
//			 Fruit f = new Fruit(fruitId,fruitName, price, quantity, origin);
//			 
//			 listOfFruit.add(f);
//			 break;
//		 }
//	}
//	
//	public void showFruit() {
//		System.out.println("List of fruit\n" + "| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ |   ++ Price ++   |");
//		listOfFruit.forEach(x -> System.out.println(x));
//	}
//}
