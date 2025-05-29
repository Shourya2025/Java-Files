package Learning;

@FunctionalInterface
interface MyLabda {
	//public void display(String str);
	public int add(int x , int y);
}

public class LambdaExpression {
	public static void main(String[] args) {
		MyLabda m = (a , b ) -> {
			return a+b;
		};
		
		System.out.println(m.add(15, 25));
		/*MyLabda m = (s) -> {// with parameter 
			System.out.println(s); // indirectly overrided the interfcae
		};*/
		
		//m.display("Hello Worlds this is lambda expression with parameter");

	}
}


/*
@FunctionalInterface
interface MyLabda {
	public void display();
}

public class LambdaExpression {
	public static void main(String[] args) {

		MyLabda m = () -> {
			System.out.println("Hello World"); // indirectly overrided the interfcae
		};
		m.display();

	}
}
*/



/*
@FunctionalInterface
interface MyLabda {
	public void display(String str);
	//public int add(int x , int y);
}

public class LambdaExpression {
	public static void main(String[] args) {

		MyLabda m = (s) -> {// with parameter 
			System.out.println(s); // indirectly overrided the interfcae
		};
		m.display("Hello Worlds this is lambda expression with parameter");

	}
}*/