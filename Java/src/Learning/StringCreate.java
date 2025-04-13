package Learning;

public class StringCreate {

	public static void main(String[] args) {
		String str1 = "Java Program ";
		System.out.printf("The value of Str1 :%s\n", str1);
		char c[] = { 'h', 'e', 'l', 'l', 'o' };
		String str3 = new String(c);
		System.out.printf("The pool of strings is : %s\n", str3);
		String str4 = "Python";
		String str5 = "Python";
		System.out.println(str5.equals(str4));
		System.out.println(str3.indexOf("l"));
		String str6 = "p";
		System.out.println(str6.matches("."));
		System.out.println(str6.matches("[abc]"));
		System.out.println(str6.matches("[^abc]"));
		System.out.println("Quantifiers");
		String str7 = "JavaProgram";
		System.out.println(str7.matches(".*"));
		System.out.println(str7.matches("[^bcd]*"));
		System.out.println(str7.matches("[a-z]*"));
		String str8 = "Shourya@gmail.com";
		System.out.println(str8.matches("[a-z A-Z]*@gmail.*"));//Validation
	}

}
