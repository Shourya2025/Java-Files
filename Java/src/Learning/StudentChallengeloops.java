package Learning;

import java.util.Scanner;

public class StudentChallengeloops {

	public static void main(String[] args) {
		// multiplication table

		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no whose table to be displayed:");
		i = sc.nextInt();
		for (int n = 0; n <= 10; n++) {
			System.out.println(i + "x" + n + "=" + i * n);
		}
		// Sum of n numbers
		j = sc.nextInt();
		int sum = 0;
		for (int n = 1; n <= j; n++) {
			// System.out.println("Sum of n numbers is :" + (n+n));
			sum = sum + n;
			System.out.print(sum+ "\t");
		}
		System.out.println("Factorial of a number :");
		int fc  , fact = 1;
		fc = sc.nextInt();
		for (int k = 0; k <=fc; k++) {
			 fact = fact*k;
			
		}
		System.out.println(fact);
	}

}
