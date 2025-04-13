package Learning;

class Rectangle1{
	private double lenght ;
	private double breadth ;
	public double getLenght() {
		return lenght ;
	}
	public double getBreadth() {
		return breadth ;
	}
	public double setBreadth(double d) {
		if(d>0) {
			breadth = d;
		}
		else breadth = 0 ;
		return breadth;
		
	}
	public double setLenght(int l) {
		if(l>0) {
			lenght = l;
		}
		else lenght = 0 ;
		return lenght;
		
	}
	public Rectangle1(){
		setLenght(1);
		setBreadth(1);
	}
	public Rectangle1(int side ){
		lenght = breadth = side ;
		
	}
	public double area(){
		return lenght*breadth;
		
	}
	public double perimeter (){
		return 2*(lenght+breadth);
		
	}
	
}
public class RectangleGetSet {
	public static void main(String[] args) {
		
		Rectangle1 R1 = new Rectangle1();
		
		System.out.println("The area of the constructor rectangle is : "+R1.area());
		Rectangle1 R2 = new Rectangle1(5);
		System.out.println("The given value represents square :"+ R2.area());
		R1.setLenght(5);
		R1.setBreadth(10.0);
		System.out.println("The area of the private rectangle is : "+R1.area());
	}
	
	

}
