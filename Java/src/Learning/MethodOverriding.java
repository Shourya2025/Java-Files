package Learning;
class Super{
	public void fun() {
		System.out.println("Hello Super");
	}
}
class Sub extends Super{
	@Override 
	public void fun() {
		System.out.println("Hello Sub");
	}
	public void fun2() {
		System.out.println("Hello Sub 2 ");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.fun();
		Super s2 = new Sub();//Dynaimc method dispatched 
		s2.fun();
		//s2.fun2();only call method of the first class 
		Super s1 = new Super();
		s1.fun();
	}

}
