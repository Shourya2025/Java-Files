package Learning;

import java.sql.Array;
import java.util.Scanner;

public class StudentChallenge2 {

	public static void main(String[] args) {
		// Type of website and protocol used
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name or url of the website that need to be checked :");
		str1 = sc.nextLine();
		// System.out.println("The protocol of the website is :"+str1.matches() + );
		String protocol = str1.substring(0, str1.indexOf(":"));
		if (protocol.equals("http")) {
			System.out.println("Hyper text transfer protocol");
		} else if (protocol.equals("https")) {
			System.out.println("Hyper text transfer protocol secured");
		} else if (protocol.equals("ftp")) {
			System.out.println("File transfer protocol");
		} else {
			System.out.println("The protocol is invalid ");

		}
		System.out.print("The type of website is :");
		String website = str1.substring(str1.lastIndexOf(".")+1);
		if (website.equals("com")) {
			System.out.println("Commercial");

		} else if (website.equals("org")) {
			System.out.println("Ngo organization");
		} else {
			System.out.println("Network");
		}

	}

}
