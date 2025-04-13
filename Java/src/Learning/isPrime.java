package Learning;

import java.util.Scanner;

public class isPrime {

	static boolean isPrime1(int x) {
		int z = x / 2;
		int cnt = 1;

		for (int i = 2; i <= z; i++) {
			if (x % i == 0) {
				cnt++;

			}

		}
		if (cnt == 1) {
			return true;

		} else
			return false;

		// Prime

	}

	public static void main(String[] args) {
		// Prime or not
		Scanner sc = new Scanner(System.in);
		int a;
		boolean s;
		System.out.println("Enter the number to be checked :");
		a = sc.nextInt();
		s = isPrime1(a);
		System.out.println(s);

	}

}
