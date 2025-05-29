package Learning;
import java.io.*;
import java.io.FileOutputStream;

public class Stream {
public static void main(String[] args) throws Exception{
	try(FileInputStream fis = new FileInputStream("C:\\Users\\HP\\FileJava\\Test.txt");){
		int x ;
		do { 
			x = fis.read();
			if(x!=-1) System.out.print((char)x);
		}while(x!=-1);
			
		
		
		//FileOutputStream fos = new FileOutputStream("C://User/HP/FileJava/Test.txt");
		//byte b[] = new byte[fis.available()];
		//fis.read(b);
		//String str  = new String(b);
		//System.out.println(str);
		//fis.close();
		
	}
	/*try(FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\FileJava\\Test.txt");){
		//FileOutputStream fos = new FileOutputStream("C://User/HP/FileJava/Test.txt");
		

		String str = "Learn Java Programming ";
		//fos.write(str.getBytes());C://\Users\HP\FileJava
		byte b[] = str.getBytes();
		for(byte x:b) {
			fos.write(x);
			
		}
		
		fos.close();
		
	}*/
	
//	catch(FileNotFoundException e ) {
//		System.out.println(e);
//	}
//	catch(IOException e ) {
//		System.out.println(e);
//	}
}
}
