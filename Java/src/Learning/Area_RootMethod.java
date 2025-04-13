package Learning;

import java.util.Scanner;
import java.math.*;
public class Area_RootMethod {
	public static void main(String[] args) {
		float a, b, c, Area , s ;
		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter the a of the triangle: ");
		a 	= s1.nextFloat();
		System.out.print("Enter the b of the triangle: ");
		b = s1.nextFloat();
		System.out.print("Enter the c of the triangle: ");
		c = s1.nextFloat();
		s = (a+b+c)/2;
		Area = (float) Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		System.out.println("The area of trinagle by root method is :"+Area );
		


	}

}
