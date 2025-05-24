package Learning;

public class ThrowThrows  {
	static int area(int l , int b )throws Exception {
		if(l<0 || b<0) {
			throw new Exception();
			
		}
		return l/b;
	}
/*static int meth1() {
	return 10/0;
}
static void meth2() {
	meth1();
}
static void  meth3() {
	meth2();
}
*/
	static void  meth1() throws Exception {
	System.out.println(area(10, -10));
	}
	
	public static void main(String[] args) {
		// Throws & Throws 
		try {meth1();}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
