package Learning;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// Array's
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		for(int x:A) {
			System.out.print(x+" ");
		}
		System.out.println();
		int B[]= new int[5];
		B[2]=15;
		B[4] =17 ;
		for(int i = 0 ; i <B.length; i++) {
			System.out.print(B[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		for(int a = 0 ;a< A.length; a++) {
			System.out.print(A[a]++ + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		for(int x:A) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

}
