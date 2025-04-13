package Learning;

import java.util.Scanner;

public class GcdOfTwoNo {
	int  MaxOfArray(int A[]) {
		int Max1 = A[0];
		for(int i= 0 ; i<A.length ; i++) {
			if(Max1<A[i]) {
				Max1 =A[i];
				
			}
			//return Max1;
			
		}
		return Max1;
		
	}

	int Gcd(int x, int y) {
		while (x != y) {
			if (x > y) {
				x = x - y;
			} else
				y = y - x;
		}
		return x;
	}

	public static void main(String[] args) {
		// GCD/HCF of no's
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the First number: ");
		a = sc.nextInt();
		System.out.println("Enter the First number: ");
		b = sc.nextInt();
		GcdOfTwoNo gcd = new GcdOfTwoNo();
		System.out.println(gcd.Gcd(a, b));
		int A[] = { 1, 2 ,3, 4,56,7,809000,9,10
	};
		System.out.println(gcd.MaxOfArray(A));
	}

}
