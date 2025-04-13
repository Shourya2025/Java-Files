package Learning;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*
		 * Arithmetic Series Scanner sc = new Scanner(System.in); int a, d, n;
		 * System.out.print("Enter the first term of AP:"); a = sc.nextInt();
		 * System.out.print("Enter the Common Difference term of AP:"); d =
		 * sc.nextInt(); System.out.print("Enter the number of term in AP:"); n =
		 * sc.nextInt(); int ap = a; System.out.print("The series is :"); for (int i =
		 * 0; i < n; i++) {
		 * 
		 * System.out.print(ap + ","); ap = ap + d;
		 * 
		 * }
		 */
		/*
		 * Geometric Progression Scanner sc = new Scanner(System.in); int a, r, n;
		 * System.out.print("Enter the first term of GP:"); a = sc.nextInt();
		 * System.out.print("Enter the Common Ratio term of GP:"); r = sc.nextInt();
		 * System.out.print("Enter the number of term in GP:"); n = sc.nextInt(); int gp
		 * = a; System.out.print("The series is :"); for (int i = 0; i < n; i++) {
		 * 
		 * System.out.print(gp + ","); gp = gp*r;
		 * 
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1, c , n ;
		System.out.print("Enter the number of terms of the series:");
		n = sc.nextInt();
		System.out.print(a + ","+b+",");
 for(int i = 0 ; i < n-2 ; i++) {
	 c = a + b ;
	 System.out.print(c+",");
	 a =b ;
	 b = c ;
 }
	}

}
