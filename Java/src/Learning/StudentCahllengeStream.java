package Learning;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentCahllengeStream {
public static void main(String[] args)throws Exception {
	
	
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\FileJava\\Source1.txt");
		//String str = "LEARN JAVA PROGRAMMING";
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\FileJava\\Source2.txt");
		//fos.write(str.getBytes());
		int b ;
		while((b = fis.read())!=-1) {
			if((b>=65 && b<=120))fos.write(b+32);
			else fos.write(b);
			
		}
		fos.close();
		fis.close();
		
		
	
	
}
}
