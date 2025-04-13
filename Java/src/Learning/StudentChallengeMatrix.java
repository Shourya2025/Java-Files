package Learning;

public class StudentChallengeMatrix {
	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		int B[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		int C[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j]=0;
				for(int k= 0 ; k<3 ; k++) {
					C[i][j]= C[i][j]+ A[i][k]*B[k][j];
				}
			}
			
		}
		for(int x[] :C ) {
			for(int y : x ) {
				System.out.print(y+" ");
			}
			System.out.println( );
		}

	}
}
    



/*-----------------------------
Addition and Subtraction
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
	C[i][j] = A[i][j] + B[i][j];
	System.out.print(C[i][j] + "  ");
}
System.out.println();
}

*/