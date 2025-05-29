package Learning;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class BufferInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\HP\\FileJava\\Source1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(10);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
       //.out.println((char)bis.read());
        
        bis.close();
        fis.close();
    }
}
