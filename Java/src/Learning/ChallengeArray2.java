package Learning;

public class ChallengeArray2 {

	public static void main(String[] args) {
		// Maximum Element
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int max = A[0];
		int index = 0;
		for(int i =0 ; i< A.length;i++) {
			if(A[i]>max) {
				max = A[i];
				i = index;
				
				
				
			}
		}
		System.out.println("Maximum value of the array is: "+max);
		for (int i = 0; i < A.length; i++) {
			if (max == A[i]) {
				System.out.println("The index of the element is :" + i);
				System.exit(0);
			}

		}
		System.out.println("Element not found");

		
		

	}

}
