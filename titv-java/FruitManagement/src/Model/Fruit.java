package Model;

public class Fruit {
	private int fruitId;
	private String fruitName;
	private double price;
	private int quantity;
	private String origin;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Fruit(int fruitId, String fruitName, double price, int quantity, String origin) {
		super();
		this.fruitId = fruitId;
		this.fruitName = fruitName;
		this.price = price;
		this.quantity = quantity;
		this.origin = origin;
	}
	
	
	public int getFruitId() {
		return fruitId;
	}


	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}


	public String getFruitName() {
		return fruitName;
	}


	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	@Override
	public String toString() {
		return "Fruit [fruitId=" + fruitId + ", fruitName=" + fruitName + ", price=" + price + ", quantity=" + quantity
				+ ", origin=" + origin + "]";
	}


	
}
