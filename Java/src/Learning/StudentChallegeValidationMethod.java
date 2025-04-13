package Learning;

public class StudentChallegeValidationMethod {
  boolean Validate(String n) {
	
	return n.matches("[a-zA-z]+");
	
  }
  boolean Validate(int age) {
		
		return age>=3 && age<=15; 
		
		  
	  }
	public static void main(String[] args) {
		// Validate
		String str = "Shourya";
		int age = 21;
		StudentChallegeValidationMethod obj = new StudentChallegeValidationMethod();
		System.out.println(obj.Validate(str));
		System.out.println(obj.Validate(age));

	}

}
