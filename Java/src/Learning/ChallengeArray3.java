package Learning;

public class ChallengeArray3 {
	public static void main(String[] args) {
		//Second largest element of the array 
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int max1, max2;
		max1 = max2 = A[0];
		for (int i = 0; i < A.length; i++) {
			if(A[i]>max1) {
				max2 =max1;
				max1 =A[i];
				
			}
			else if (A[i]>max2) {
				max2 = A[i]
				;
				
			}
			

		}
		System.out.println("Second largest element is :"+max2);
	}

}
