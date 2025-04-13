package Learning;

import java.util.Scanner;

public class StudentChallengeLoops2 {

	public static void main(String[] args) {
		// Display the number 
		int n , r , arm = 0;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number whose digits to be displayed:");
		n = sc.nextInt();
		int count = 0 ;
		
		while(n>0) {
			r = n%10;
			arm = arm +r*r*r;
			System.out.print(r+"\t");
			n =n/10;
			count++;
			
		}
		
		System.out.println("\n"+"The number of digits it contain is :"+count);
		
		//Armstrong Number
		if(arm == n) {
			System.out.println("The Number is Armstrong");
		}
		else System.out.println("The Number is not Armstrong");
		

	}

}
