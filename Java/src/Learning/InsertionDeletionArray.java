package Learning;

import java.util.Scanner;

public class InsertionDeletionArray {

	public static void main(String[] args) {
		int A[] = new int[10];
		A[0]= 1;
		A[1] = 43;
		A[2] = 2;
		A[3] = 33;
		A[4] = 22;
		
		Scanner sc = new Scanner(System.in);
		int index ;// index
		int add ;// no
		System.out.println("Enter the number you wanna enter :");
		add = sc.nextInt();
		System.out.println("Enter the index a which you wnna enter :");
		index = sc.nextInt();
		//System.out.println(A.length);
		int cnt =0 ;
		for(int i =0 ; i <A.length;i++) {
			if(A[i]>0) {
				cnt++; // lenght of the actul array used 
			}
		}
		System.out.println(cnt);//Lenght for the loop 
		System.out.print("Present Array : ");
		for(int x :A) {
			System.out.print(x + " ");
		}System.out.println();
		for(int i =cnt;i >index ; i-- ) {
			A[i] =A[i-1];//Copy
			A[index] = add;
		}
		System.out.print("Updated Array : ");
		for(int x :A) {
			System.out.print(x + " ");
		}System.out.println();
		System.out.println("-----------------------------------");
		int del ; //By index 

		System.out.println("The length of the array filled is "+ cnt);
		System.out.print("Enter the idex you wanna delete");
		del = sc.nextInt();
		System.out.print("Present Array : ");
		for(int x :A) {
			System.out.print(x + " ");
		}System.out.println();
		for(int i = cnt ; i>del; i--) {
			A[i-1]= A[i];
		}
		System.out.print("Updated Array : ");
		for(int x :A) {
			System.out.print(x + " ");
		}System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* Insertion Deletion in an array
		int A[] = new int[10];
		A[0] = 4;
		A[1] = 43;
		A[2] = 2;
		A[3] = 33;
		A[4] = 22;
		int n = 5;
		for (int x : A) {
			System.out.print(x + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int index=2  ;// index
		int add= 20 ;// no
		/*System.out.println("Enter the number you wanna enter :");
		add = sc.nextInt();
		System.out.println("Enter the index a which you wnna enter :");
		index = sc.nextInt();
		
		int temp;
		for (int i = n; i > index; i--) {
			// temp = A[n];
			 A[i]=A[i - 1]; 
			A[index] = add;
		}
		for (int x : A) {
			System.out.print(x + " ");
		}
		System.out.println();
		//A[n] = add;*/
		

	}

}
