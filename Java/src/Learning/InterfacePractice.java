package Learning;
interface Test1{
	void meth1();
	void meth2();
}
 class Test implements Test1 {
	public void meth1() {
		System.out.println("Hello method 1 ");
	}
	public void meth2() {
		System.out.println("Hello method 2 ");
	}
	public void meth3() {
		System.out.println("Hello method 3 ");
	}
	
}

public class InterfacePractice {

	public static void main(String[] args) {
		// Interface
		Test1 t = new Test();
		Test t1 = new Test();
		t.meth1();
		t.meth2();
		try {
			
			t1.meth3();
		}
		catch (Exception e) {
			// TODO: handle exception
			t1.meth3();
			
		}
		

	}

}
