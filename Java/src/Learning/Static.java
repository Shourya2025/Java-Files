package Learning;
class Test12{
	static {
		System.out.println(" XBlock 1");
	}
	static {
		System.out.println("XBlock 2");
	}
}



public class Static {
	static {
		System.out.println("Block 1");
	}
	public static void main(String[] args) {
		System.out.println("Main");
		Test12 t = new Test12();
		
	}
	static {
		System.out.println("Block 2");
	}
}
/*
class Hondacity {
	static double d = 100;

	static double OnroadPrice(String name) {
		switch (name) {
		case "delhi ": {

			return d * d * .01;
		}
		case "mumbai ": {

			return d * d * .09;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + name);
		}
	}
}

public class Static {
	public static void main(String[] args) {
		System.out.println(Hondacity.d);
		System.out.println(Hondacity.OnroadPrice("delhi"));
	}

}
*/