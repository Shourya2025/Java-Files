package Learning;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Day and Month according to input
		String Date ;
		int d, m ;
		String one;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Date:");
		Date = sc.next();
		System.out.println(Date);
		/*one= Date.substring(0 , Date.indexOf("/"));
		switch (one) {
		case 1: {
			System.out.println("Monday");break;
		}
		case 2: {
			System.out.println("Tuesday");break;
		}
		case 3: {
			System.out.println("Wednesday");break;
		}
		case 4: {
			System.out.println("Thursday");break;
		}
		case 5: {
			System.out.println("Friday");break;
		}
		case 6: {
			System.out.println("Saturday");break;
		}
		case 7: {
			System.out.println("Sunday");break;
		}

		default:
			System.out.println("Invalid argument");
		}
		*/
		System.out.print("Enter the day number you wanna find :");
		d = sc.nextInt();
		switch (d) {
		case 1: {
			System.out.println("Monday");break;
		}
		case 2: {
			System.out.println("Tuesday");break;
		}
		case 3: {
			System.out.println("Wednesday");break;
		}
		case 4: {
			System.out.println("Thursday");break;
		}
		case 5: {
			System.out.println("Friday");break;
		}
		case 6: {
			System.out.println("Saturday");break;
		}
		case 7: {
			System.out.println("Sunday");break;
		}

		default:
			System.out.println("Invalid argument");
		}
		System.out.print("Enter the number of month you want to find :");
		m = sc.nextInt();
		switch (m) {
		case 1: {
			System.out.println("Jan");break;
		}
		case 2: {
			System.out.println("Feb");break;
		}
		case 3: {
			System.out.println("March");break;
		}
		case 4: {
			System.out.println("April");break;
		}
		case 5: {
			System.out.println("May");break;
		}
		case 6: {
			System.out.println("June");break;
		}
		case 7: {
			System.out.println("July");break;
		}
		case 8: {
			System.out.println("Aug");break;
		}
		case 9: {
			System.out.println("Sep");break;
		}
		case 10: {
			System.out.println("Oct");break;
		}
		case 11: {
			System.out.println("Nov");break;
		}
		case 12: {
			System.out.println("Dec");break;
		}

		default:
			System.out.println("Invalid argument");
		}
	}

}
