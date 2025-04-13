package Learning;

import java.util.Scanner;

public class SwappingUsing2No {
	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter the two numbers to be swapped :");
		Scanner s1 = new Scanner(System.in);
		a = s1.nextInt();
		b = s1.nextInt();
		System.out.println("The original 1st no is " + a);
		System.out.println("The original 2nd no is " + b);
		a = a ^ b;
		b = a ^ b;
		a = b ^ a;
		System.out.println("The Swapped 1st no is " + a);
		System.out.println("The Swapped 2nd no is " + b);
	}

}
