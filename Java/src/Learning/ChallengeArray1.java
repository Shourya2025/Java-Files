package Learning;

import java.util.Scanner;

public class ChallengeArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int cnt = 0;

		for (int x : A) {
			cnt += x;

		}
		System.out.println("Sum of all the element of array:" + cnt);
		// Finding the element
		int n;
		System.out.println("Enter the no for searching:");
		n = sc.nextInt();
		for (int i = 0; i < A.length; i++) {
			if (n == A[i]) {
				System.out.println("The index of the element is :" + i);
				System.exit(0);
			}

		}
		System.out.println("Element not found");

	}

}
