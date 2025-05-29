package Learning;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;

public class ByteArrayInputOutputStream {
    public static void main(String[] args) throws Exception {
    	char b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
    	CharArrayReader cr = new CharArrayReader(b);
    	int x;
    	while ((x = cr.read()) != -1) {
    	    System.out.print((char) x + " ");
    	}
    	cr.close();
    	
    }
}


//byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
//ByteArrayInputStream bis = new ByteArrayInputStream(b);
//int x;
//while ((x = bis.read()) != -1) {
//    System.out.print((char) x + " ");
//}
//bis.close();




//ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
//bos.write('a');bos.write('b');bos.write('c');bos.write('d');bos.write('e');bos.write('f');bos.write('g');bos.write('h');bos.write('i');bos.write('j');bos.write('k');
//bos.writeTo(new FileOutputStream("C:\\Users\\HP\\FileJava\\Source4.txt"));
//bos.close();