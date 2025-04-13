package Learning;

class Rectangle2 {
	public int lenght;
	public int breadth;

	public Rectangle2() {
		lenght = breadth = 1;
	}

	public Rectangle2(int l, int b) {
		lenght = l;
		breadth = b;
	}

}

class Cuboid1 extends Rectangle2 {
	public int height;

	public Cuboid1() {
		height = 1;

	}

	Cuboid1(int l, int b, int h) {
		super(l, b);
		height = h;

	}

	int volume() {
		return lenght * breadth * height;
	}

}

public class ParentChildConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid1 c1 = new Cuboid1();
		System.out.println("Volume with non parameterrized constructor:" + c1.volume());
		Cuboid1 c2 = new Cuboid1(10, 5, 5);
		;
		System.out.println("Volume with  parameterrized constructor:" + c2.volume());

	}

}
