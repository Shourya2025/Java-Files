package Learning;

public class StarPattern {

	public static void main(String[] args) {
		// Star Pattern
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j>=6) {
					System.out.print("*");

				} else
					System.out.print(" ");
				//Loop 2 
				for(int m =1 ; m<=5 ; m++) {
					for(int n =1 ; n<=5 ; n++) {
						if (j+ i <=6) {System.out.print("*"+" ");
						}
						else System.out.print(" ");}
				}
			}
			System.out.println();
		}

	}

}
