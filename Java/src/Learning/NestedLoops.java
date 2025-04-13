package Learning;

public class NestedLoops {

	public static void main(String[] args) {
		// Nested loops
		System.out.println("Pattern 1");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("(" + i + "," + j + ")");

			}
			System.out.println();

		}
		System.out.println("------------------------------------------------------");
		System.out.println("Pattern 2");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");

			}
			System.out.println();

		}

		System.out.println("------------------------------------------------------");
		System.out.println("Pattern 3");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + i + " ");

			}
			System.out.println();

		}
		System.out.println("------------------------------------------------------");
		System.out.println("Pattern 4");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + i + " ");

			}
			System.out.println();

		}
		System.out.println("------------------------------------------------------");
		System.out.println("Pattern 5");
		int sum =1 ;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(sum+ " ");
				sum++;

			}
			System.out.println();

		}
		System.out.println("------------------------------------------------------");
		System.out.println("Pattern 6");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
				

			}
			System.out.println();

		}
		System.out.println("------------------------------------------------------");
		System.out.println("Pattern 7");
		int cnt = 1 ;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(cnt+" ");
				cnt++;
				

			}
			System.out.println();

		}
		System.out.println("------------------------------------------------------");
		System.out.println("Pattern 8");
		 for(int i = 1 ; i<=5 ; i++){
	            for(int j = 1 ; j<=5-i+1; j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }
		 System.out.println("------------------------------------------------------");
			System.out.println("Pattern 9");
		 
		 
		 for(int i = 1 ; i<=5 ; i++){
	            for(int j = 1 ; j<=5; j++){
	                if(i<=j){
	                    System.out.print("*");
	                    
	                }
	                else System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }



	

}
