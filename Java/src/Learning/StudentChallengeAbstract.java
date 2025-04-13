package Learning;
abstract class shape{
	abstract int perimeter();
	abstract int area();	
}
class CircleAbs extends shape{
	int radius ;
	int perimeter() {
		return (int)Math.PI*2*radius;
	}
	int area() {
		return (int)Math.PI*radius*radius;
	}
}
class RectangleAbs extends shape{
	int lenght  ;
	int breadth;
	int perimeter() {
		return 2*(lenght+breadth);
	}
	int area() {
		return lenght*breadth;
	}
}

public class StudentChallengeAbstract {

	public static void main(String[] args) {
		// Abstract class and overriding'
		CircleAbs c = new CircleAbs();
		c.radius = 7;System.out.println(c.area());
		System.out.println(c.perimeter());
		RectangleAbs r = new RectangleAbs();
		r.lenght = 10;
		r.breadth = 20 ;
		
		System.out.println(r.area());
		System.out.println(r.perimeter());

	}

}
