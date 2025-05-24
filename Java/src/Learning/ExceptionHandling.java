package Learning;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// Try Catch Finally;
		try {int a , b , c;
		a =sc.nextInt();
		b =sc.nextInt();
		//a =sc.nextInt();
		c = a / b;
		System.out.println(c);}
		catch(Exception e) {
			System.out.println("The exception is:"+ e);
		}
		//
		finally {
			System.out.println("Chal gaya finally");
		}

	}

}
