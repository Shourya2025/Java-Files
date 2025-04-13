package Learning;

import java.util.Scanner;

public class StudentChallenge {

	public static void main(String[] args) {
		// Find Radix
		System.out.println("Enter the number for which you want to find radix of :");
		String str;
		Scanner sc1 = new Scanner(System.in);
		str = sc1.nextLine();
		if (str.matches("[01]*")) {
			System.out.println("The radix of the number is Binary");
			
		}
		else if (str.matches("[1-7]*")) {
			System.out.println("The radix of the number is Octal");
			
		}
		else if (str.matches("[1-9A-F]*")) {
			System.out.println("The radix of the number is Hexadecimal");
			
		}
		else if (str.matches("[1-9]*")) {
			System.out.println("The radix of the number is decimal");
			
		}
		else {
			System.out.println("The number is none of the forms");

		}
	}

}
