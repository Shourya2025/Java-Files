/*package Learning;

import java.util.Scanner;
import java.math.*;

public class RootoftheQuadraticEq {

	public static void main(String[] args) {
		double a, b, c, r1, r2, root;
		System.out.println("Finding out the roots of the quadratic equation ");
		System.out.println("Enter the value accordingly ----->  ax^2 + bx + c = 0 ");
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter the value of a :");
		a = s2.nextDouble();
		System.out.print("Enter the value of b :");
		b = s2.nextDouble();
		System.out.print("Enter the value of c :");
		c = s2.nextDouble();
		root = Math.sqrt(((b * b) - (4 * a * c)));
		r1 = ((-b) + root)/(2*a);
		System.out.println("The First root value is :" +r1);
		r2 = ((-b) - root)/(2*a);
		System.out.println("The Second root value is :" +r2);

	}

}
package Learning;

import java.util.Scanner;
import java.math.*;

public class RootoftheQuadraticEq {

    public static void main(String[] args) {
        double a, b, c, r1, r2, root;
        System.out.println("Finding out the roots of the quadratic equation ");
        System.out.println("Enter the value accordingly ----->  ax^2 + bx + c = 0 ");
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        a = s2.nextDouble();
        System.out.print("Enter the value of b :");
        b = s2.nextDouble();
        System.out.print("Enter the value of c :");
        c = s2.nextDouble();
        
        // Calculate the discriminant
        root = Math.sqrt(((b * b) - (4 * a * c))); // Potential error if discriminant is negative
        r1 = ((-b) + root)/(2*a); // This will throw an error if root calculation fails
        System.out.println("The First root value is :" +r1);
        r2 = ((-b) - root)/(2*a); // This will also throw an error if root calculation fails
        System.out.println("The Second root value is :" +r2);
    }
}*/
package Learning;

import java.util.Scanner;
import java.math.*;

public class RootoftheQuadraticEq {

    public static void main(String[] args) {
    	int a, b, c
    	;
		double f;
    	
        double  r1, r2, root;
        System.out.println("Finding out the roots of the quadratic equation ");
        System.out.println("Enter the value accordingly ----->  ax^2 + bx + c = 0 ");
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        a = s2.nextInt();
        System.out.print("Enter the value of b :");
        b = s2.nextInt();
        System.out.print("Enter the value of c :");
        c = s2.nextInt();
        f = Math.sqrt(b*b-4*a*c)/(2*a); 
        System.out.print(f  +a + b + c ) ;
        // Calculate the discriminant
        root = 34;//Math.sqrt(((b * b) - (4 * a * c))); 
        System.out.println(root);// Potential error if discriminant is negative
        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a); // This will throw an error if root calculation fails
        System.out.println("The First root value is :" +r1);
        r2 = ((-b) - root)/(2*a); // This will also throw an error if root calculation fails
        System.out.println("The Second root value is :" +r2);
    }
}