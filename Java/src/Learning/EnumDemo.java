package Learning;
enum Dept{
 
	CS , IT ,CIVIL , ME , ECE;
	private Dept() {
		System.out.println(this.name()+ " " + "-"+ " " +this.ordinal());//will be called upon loading of the program
	}
}
public class EnumDemo {
public static void main(String[] args) {
	Dept d = Dept.CS;
	switch (d) {
	case CS: {
		
		System.out.println("Head : Ashok Verma ");
		break;
	}
case CIVIL: {
		
		System.out.println("Head : Pandey ");
		break;
	}
case ECE: {
	
	System.out.println("Head : no idea ");
	break;
}
case ME: {
	
	System.out.println("Head : pal  ");
	break;
}
	default:
		throw new IllegalArgumentException("Unexpected value: " + d);
	}
	
	
	Dept list[]  = Dept.values();
	for(Dept x : list) {
		System.out.println(x);
	}
}
}
