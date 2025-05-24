package Learning;
class LowBalaceExceptin extends Exception{
	public String toString() {
		return "Balanced should be not to much"; 	}
}
public class CheckedUnchecked {
	static void fun1() {
		try {
			System.out.println(10/0);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	static void fun2() {
		fun1();
		
	}static void fun3() {
		fun2();
		
	}
	public static void main(String[] args) {
		// Checked & Unchecked 
		int bal = 20;
		LowBalaceExceptin c = new LowBalaceExceptin();
		try {
			if(bal<100) {
				System.out.println(c.toString());
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("no idea");
		}
		try {
			fun3();
		}catch(Exception e ) {
			e.printStackTrace();
			
		}
		
		

	}

}
