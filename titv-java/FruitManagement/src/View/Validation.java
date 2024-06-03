package View;

import java.util.Scanner;

public class Validation{
	private Scanner sc;
	
	public Validation() {
		sc = new Scanner(System.in);
	} 
	
	public int getInt(String mess) {
		while(true) {
			try {
				System.out.println(mess);
				int input = sc.nextInt();
				if(input >= 0 && String.valueOf(input).length() <=6) {
					return input;
				}else {
					System.out.println("Vui long nhap lai!");
				}
			}catch (Exception e) {
				System.out.println("Vui long nhap dung lieu. Hay nhap lai!");
				sc.nextLine();
			}
		}
	}
	
	public String getName(String mess) {
		while(true) {
			System.out.println(mess);
			String input = sc.nextLine();
			try {
				if(input.matches("[a-zA-Z]+")&& input != null) {
					return input;
				}
			}catch(Exception e) {
				System.out.println("Vui long nhap dung du lieu, hay nhap lai");
				sc.nextLine();
			}
		}
	}
	
	public double getDouble(String mess) {
		while(true) {
			try {
				System.out.println(mess);
				double doubleInput = sc.nextDouble();
					if(doubleInput >= 0 && String.valueOf(doubleInput).length() <= 6) {
						return doubleInput;
					}else {
						System.out.println("Vui long nhap lai");
					}
					} catch (Exception e) {
						System.out.println("Vui long nhap dung du lieu, hay nhap lai");
						sc.nextLine();
			}
		}
	}
	
	
	public String getOrigin(String mess) {
			System.out.println(mess);
			sc.nextLine();
			String input = sc.nextLine();
				while(input.isEmpty()) {
					System.out.println("Vui long nhap lai");
					input = sc.nextLine();				
					}
				return input;
			}
	}





//
//public class Validation {
//	Scanner sc = new Scanner(System.in);
//	
//	public String getValue(String msg) {
//		System.out.println(msg);
//		return sc.nextLine();
//	}
//	
//	public String getValueAndValid(String msg, String regex, String cause) {
//		String value;
//		while(true) {
//			try {
//				value = getValue(msg);
//				if(value.isEmpty()) {
//					throw new Exception(" Input cannot empty");
//				}
//				if(!value.matches(regex)) {
//					throw new Exception(cause);
//				}
//				break;
//			} catch (Exception ex){
//				System.out.println(ex.getMessage());
//			}	
//		}	
//		return value;
//	}
//
//	public int getValidInteger(String msg) {
//		int value;
//		while(true) {
//			try {
//				System.out.print(msg);
//				value = Integer.parseInt(sc.next());
//				if(value>0) {
//					break;
//				} else {
//					System.out.println("Please enter value greater than 0");
//				}
//			} catch (NumberFormatException e) {
//					System.out.println("Invalid input. Please enter a valid integer.");
//			}
//		}
//		return value;
//	}
//	
//	public double getValidDouble(String msg) {
//		String value;
//		while(true) {
//			try {
//				value =  getValueAndValid(msg, "[\\d]+", "Invalid money");
//				if(Double.parseDouble(value) <= 0) {
//					throw new Exception("Amount of money must be positive");
//				}
//				return Double.parseDouble(value);
//			} catch (NumberFormatException e) {
//				System.out.println("Invalid amount of money");
//			} catch (Exception e) {
//				System.out.println(	e.getMessage());
//			}
//		}
//	}
//}
