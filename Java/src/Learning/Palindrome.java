package Learning;
//Issue Not running
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Reverse a number

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 0;
		n = m;
		int rev = 0, r;

		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;

		}
		if (rev != m) {
			System.out.println("not a palindrome");
		} else

			System.out.println("The entered number is a palindrome ");
	}

}
