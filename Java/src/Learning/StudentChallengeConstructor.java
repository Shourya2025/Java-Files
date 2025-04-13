package Learning;

class product {
	private int itemno;
	private double price;
	private int quantity;
	private String name;

	public int getItemno() {
		return itemno;

	}

	public double getPrice() {
		return price;

	}

	public String getName() {
		return name;

	}

	public int getQuantity() {
		return quantity;

	}

	public double setQuantity(int q) {
		quantity = q;
		return quantity;

	}

	public double setPrice(Double p) {
		price = p;
		return price;

	}

	public product() {
		itemno = 1;
		price = 10;
		quantity = 50;
		name = "Shampoo";

	}

	public product(int i, double p, int q, String n) {
		itemno = i;
		price = p;
		quantity = q;
		name = n;

	}

}

public class StudentChallengeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product P1 = new product();
		System.out.println(P1.getItemno());
		System.out.println(P1.getName());
		System.out.println(P1.getPrice());
		System.out.println(P1.getQuantity());
		System.out.println("------------------------");
		product P2 = new product(2,100, 20, "Bodywash");
		System.out.println(P2.getItemno());
		System.out.println(P2.getName());
		System.out.println(P2.getPrice());
		System.out.println(P2.getQuantity());

	}

}
