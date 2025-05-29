package Learning;

class MyObject{
	public String toString() {
		return "My Object";
	}
	public int hashCode() {
		return 100 
				;
		
	}
	public boolean equals(Object o) {
		return this.hashCode()==o.hashCode();
	}
}
public class ObjectClass {
	

	public static void main(String[] args) {
		// Object Class
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.hashCode());
		
		MyObject m1 = new MyObject();
		MyObject m2 = new MyObject();
		System.out.println(m1);
		System.out.println(m1.equals(m2));
		

	}

}
