package Learning;

import java.util.Scanner;

public class Relational {
	public static void main(String[] args) {
		// Greatest of the three numbers
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the three numbers to be checked:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("a is the greatest");
		} else {
			if (b > c) {
				System.out.println("b is the greatest");
			} else {
				System.out.println("c is the greatest");
			}

		}
		// Checking no is positive or negative
		int neg = -5;
		if (neg > 0) {
			System.out.println("The number is positive");

		}

		else {
			System.out.println("The number is negative");
		}
		
		//Odd or Even
		int no ;
		System.out.print("Enter number to check odd even :");
		no = sc.nextInt();
		if (no%2==0) {
			System.out.println("The no is even ");
		}
		else System.out.println("The no is odd ");
		
		//

	}

}
