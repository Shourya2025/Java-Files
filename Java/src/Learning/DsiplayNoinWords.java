package Learning;

import java.util.Iterator;
import java.util.Scanner;

public class DsiplayNoinWords {

	public static void main(String[] args) {
		// Displaying no in words
		Scanner sc = new Scanner(System.in);
		int i, r, rev = 0;
		String str = "";
		System.out.print("Enter the no for displying :");
		i = sc.nextInt();

		while (i > 0) {
			r = i % 10;
			i = i / 10;
			str = str + r;
		}
		System.out.println(str);
		char c;
		for (int j = str.length() - 1; j >= 0; j--) {
			c = str.charAt(j);
			switch (c) {
			case '1': {
				System.out.print("one");
				break;
			}
			case '2': {
				System.out.println("two");
				break;
			}
			case '3': {
				System.out.print("three");
				break;
			}
			case '4': {
				System.out.print("four");
				break;
			}
			case '5': {
				System.out.println("five");
				break;
			}
			case '6': {
				System.out.print("six");
				break;
			}
			case '7': {
				System.out.print("seven");
				break;
			}
			case '8': {
				System.out.print("eght");
				break;
			}
			case '9': {
				System.out.print("nine");
				break;
			}
			case '0': {
				System.out.print("zero");
				break;
			}
			}

		}

	}

}
