package Learning;
class Circle{
	public Circle() {
		System.out.println("Constructor of the Parent class");
	}
	public double radius ;
	public double area(){
		return Math.PI*radius*radius;
	}
	public double perimeter(){
		return Math.PI*radius*2;
	}
	public double circumference(){
		return perimeter();
	}
	
}
class CYlinder2 extends Circle{
	public CYlinder2() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of the Child class");
	}
		
	
	public double height ;
	public double volume(){
		return area()*height;
	}
	
	
}

public class Inheritance {
	public static void main(String[] args) {
		CYlinder2 c1 = new CYlinder2()
;
		c1.height=7;
		c1.radius=7;
		System.out.println("Volume of the inherited method is : "+c1.volume() +"\nArea of the inherited method is : "+c1.area());
		}

}
