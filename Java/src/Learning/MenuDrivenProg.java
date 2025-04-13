package Learning;

import java.util.Scanner;

public class MenuDrivenProg {

	public static void main(String[] args) {
		// Add Sub Multiply Divide
		int a, b, c;
		int s;

		Scanner sc = new Scanner(System.in);
		System.out.println("The Operation available are as follow :\n" + " 1 : Add\n" + "2 : Sub \n" + "3 : Multiply\n"
				+ "4 : Divide ");
		System.out.println("Enter the two number for the opertion : ( a , b )");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		//System.out.println("\n");
		System.out.println("Enter the option you wanna perform :\n");

		s = sc.nextInt();
		switch (s) {
		case 1:
			// c = a+ b ;
			System.out.println("The addition is :" + (a + b));
			break;
		case 2:
			// c = a+ b ;
			System.out.println("The Subtraction is :" + (a - b));
			break;
		case 3:
			
			System.out.println("The Multiply is :" + (a * b));
			break;
		case 4:
			
			System.out.println("The Division is :" + (a % b));
			break;
		default:
			break;
		}
	}

}
