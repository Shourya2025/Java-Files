package Learning;

import java.io.*;

public class StudentCahllengeStream2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis1 =new FileInputStream("C:\\Users\\HP\\FileJava\\Source1.txt");
		FileOutputStream fos1 = new FileOutputStream("C:\\Users\\HP\\FileJava\\Souce3.txt");
		String str = "LEARN JAVA PROGRAMMING";
		fos1.write(str.getBytes());
		FileInputStream fis2 =new FileInputStream("C:\\Users\\HP\\FileJava\\Source3.txt");
		
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\FileJava\\Destination.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1 , fis2);
		int b ;
		while((b = sis.read())!=-1) {
			fos.write(b);
		}
		sis.close();
		fis1.close();
		fis2.close();
		fos.close();
		
		
	}

}
