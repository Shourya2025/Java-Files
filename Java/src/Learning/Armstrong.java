package Learning;

public class Armstrong {
	public static void main(String[] args) {
		// Armstrong Number
				int i, n, m , sum = 0 ;
				i = n = 153;
				while (i>0) {
					n = i%10; 
					sum = sum + n*n*n;
					
					
				}
				System.out.println("Hii");
				if (sum == i ) {
					System.out.println("The number is armstrong");
				}
				else System.out.println("notm");
	}

}
