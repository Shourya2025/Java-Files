package Learning;

class Cylinder {
	private double radius;
	private double height;

	public double getHeight() {
		return height;

	}

	public double getRadius() {
		return height;

	}

	public double setHeight(int h) {
		if (h > 0) {
			height = h;
		} else
			height = 0;

		return height;
	}

	public double setRadius(int r) {
		if (r > 0) {
			radius = r;
		} else
			radius = 0;

		return radius;
	}

	public Cylinder() {
		setHeight(1);
		setRadius(1);
	}

	public double area() {
		return Math.PI * radius * radius * height;
	}

	public Cylinder(int r) {

		setHeight(1);
		setRadius(r);
	}

	public Cylinder(int r, int h) {

		setHeight(h);
		setRadius(r);
	}
}

public class CylinderProperties {

	public static void main(String[] args) {
		// Constructor and Data hiding
		Cylinder R1 = new Cylinder();
		System.out.println("Area by default constructor is :"+ R1.area());
		Cylinder R2 = new Cylinder(3);
		System.out.println("Area by single parameterized constructor is :"+ R2.area());
		Cylinder R3 = new Cylinder(3 ,6 );
		System.out.println("Area by double parameterized constructor is :"+ R3.area());
	}

} 
