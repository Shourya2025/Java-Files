package Learning;
import java.util.*;
import java.lang.*;

public class FirstProgram {

	public static void main(String[] args) {
		String name ;
		Scanner sc =  new Scanner(System.in );
		
		System.out.println("May I know your name ");
		name = sc.nextLine();//printing name as welcome command 
		System.out.println("Welcome "+name );
	}

}
