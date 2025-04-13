package Learning;

public class StudentChallengeVarargs {

	static int max(int ...A) {
		if(A.length==0)return Integer.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i]>max) {
				max = A[i];
			}
			
		}
		return max ;
	}
static int sum(int ...S) {
	int sum = 0 ;
	for (int i = 0; i < S.length; i++) {
		sum = sum+S[i];
		
	}
	return sum ;
		
	}
	
	static double discount(int ...D) {
		int sum = sum(D);
		int dis ;
		if (sum < 500) {
			return sum*.10;
			
		}else if  (sum > 500 && sum <1000) {
			return sum*.15;
			
		}  else {
return sum*.20;
		}
	}
	
	public static void main(String[] args) {
		// Sum & Max & Discount
		System.out.println(max());
		System.out.println(max(10));
		System.out.println(max(10,20));
		System.out.println(max(10,5,3));
		System.out.println(sum());
		System.out.println(sum(1,2,3,4,5,6,7,8,90,10));
		System.out.println(sum(12345678,1234567,1234567,2345678,4567890,234567890,1234567890 ));
		System.out.println(discount(100,230,22, 34564,23456));
		System.out.println(discount(10));
		System.out.println(discount(10,501));
		
		
		
	}

}
