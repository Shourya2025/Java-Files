package Learning;
class Rectangle{
	public double lenght ;
	public double breadth ;
	public double area() {
		return lenght*breadth;
	}
	public double perimeter() {
		return 2*(lenght+breadth);
	}
}
public class RectangleProperties {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.lenght = 10;
		r1.breadth =20;
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
	}

	
	
}
