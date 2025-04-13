package Learning;

public class StudentChallengeString {

	public static void main(String[] args) {
		//String str1 = "Hello@gmail.com";
		//System.out.println(str1.substring( 0 , str1.indexOf("@"))+ "  is the username of the user and the following id belongs to :"+ str1.substring(str1.indexOf("@"),(str1.length()))+" "+str1.matches(".*@gmail.com.*"));
		 // weather in date format or not !
		
		//String date = "01/72/2000";
		//System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
		//replacing speacial character with normal value 
		String str3 ="@#$%asfhgbqgvrfyuhgq357484576*9^&";
		System.out.println(str3.replaceAll("[^a-zA-Z0-9]", " "));
		//removing extra spaces form a string 
		String str2 = "   Hello                       the      world    ";
		System.out.println(str2.replaceAll("\\s+", " ").trim());
		//System.out.println(str2.trim());
	}

}
