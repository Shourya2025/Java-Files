package Learning;

public class ReverseStringUsingForLoop {
	public static void main(String[] args) {
		 String str = "Hello";
		 String string ;
		 for (int i = str.length()-1; i >=0 ; i--) {
			 char ch  = str.charAt(i);
			 System.out.print(ch);
			
			
		}
	}
}
