package Learning;

import java.util.Scanner;

public class Cuboid {
	public static void main(String[] args) {
		System.out.println("Printing the volume of cuboid ");
		int volume ;
		System.out.println("Enter the l b h one by one :");
		Scanner s3 = new Scanner(System.in);
		int l , b , h ;
		l = s3.nextInt();
		b = s3.nextInt();
		h = s3.nextInt();
		volume = l*b*h ;
		System.out.println("The volume of the cuboid is : "+volume);
	}

}
