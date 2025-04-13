package Learning;

public class Recursion1 {

	static void fun(int n) {
		if(n>0) {
			System.out.println(n);
			fun(n-1);
		}
	}
	static void fun1(int n) {
		if(n>0) {
			fun(n-1);
			System.out.println(n);
			
		}
	}
	public static void main(String[] args) {
		// Recursion of the fun 
		fun(3);
		System.out.println("--------------------------");
		fun1(3);
		System.out.println("--------------------------");
		int arr[] = {12, 35, 1, 10, 34, 1};
		int max1, max2;
        max1 = max2 = arr[0];
        for(int i = 0 ; i <arr.length;
        i++){
            if(arr[i]> max1){
                max1 = max2 ;
                arr[i] = max1;
                
            }
            
		
		
	}
        System.out.println(max2);
        }}

