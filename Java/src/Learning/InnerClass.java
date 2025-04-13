package Learning;

import javax.sql.rowset.serial.SQLOutputImpl;

/*Nested inner class 


class Outer{
 
	int x = 10;
	class Inner{
		int y =20;
		void innerdisplay() {
			System.out.println("Hello inner class");
			System.out.println(x + " "+ y);
		}}
		void outerdisplay() {
			Inner i = new Inner();
			i.innerdisplay();
			System.out.println(i.y);
		
		
	}
	
	
}
public class InnerClass {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		o1.outerdisplay();
		Outer.Inner i = new Outer().new Inner();
		
	}

}
*/
/*Local Inner class
class outer {

	void display() {
		class Inner {
			public Inner() {
				// TODO Auto-generated constructor stub
				System.out.println("Hello");
			}
		}
		Inner i = new Inner();
		

	}

}
*/
abstract class my{
	abstract void display();
	
}
class Outer {
	public void display() {
		my m = new my() {
			public void display() {
				System.out.println("Hello anyonomus");
			};
		};
	}
}

