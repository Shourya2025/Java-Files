package GeeksforGeeks;
import java.util.Scanner;
public class GfgDay1 {

	public static int firstDigit(int n){
	    // code here
	    if(n==0){
	        System.out.println("0");
	    }
	    while(n>=10){
	        n = n%10;
	    }
	    return n;
	    
	}
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int n ;
	    n = sc.nextInt();
	    System.out.println(firstDigit(n));
	}

}
/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.*/