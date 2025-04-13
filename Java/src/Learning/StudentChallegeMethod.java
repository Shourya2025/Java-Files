package Learning;

import java.util.Scanner;
import java.lang.Math;
public class StudentChallegeMethod {
int Area(int x , int y) {
	int area = x*y;
	return area;
	
}
float Area(float x , float y) {
	float area = x*y;
	return area;
}
double Area(double x , double y) {
	double area = x*y;
	return area;
}
double Area(double x ) {
	double area =  Math.PI*x*x;
	return area;
}
int Reverse(int n) {
	int rev = 0 , j ;
	while(n!=0) {
	
	rev = n%10+ 10*rev;
	n=n/10;
	}
	return rev;
}
int[] Reverse( int A[]) {
	int B[] = new int[A.length];
	for(int i = A.length-1 ,j=0; i>=0;i--,j++) {
		B[j]= A[i];
	}
	return B;
}
	public static void main(String[] args) {
		// Method overloading
		/*StudentChallegeMethod obj = new StudentChallegeMethod();
		System.out.println("Area in Float : "+obj.Area(11.4f, 011.3f));
		System.out.println("Area in double : "+obj.Area(11.4d, 011.3d));
		System.out.println("Area in integer : "+obj.Area(11, 011));
		System.out.println("Area in Float of the circle : "+obj.Area(11));
	*/
		StudentChallegeMethod obj = new StudentChallegeMethod();
		/*Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number to be reversed : ");
		n = sc.nextInt();
		System.out.println(obj.Reverse(n));
		int A[] = { 1, 2,3,4,5,6,7,8,9,0};
		System.out.println(obj.Reverse(A));
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
