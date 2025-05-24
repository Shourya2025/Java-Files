package Learning;
class NegException  extends Exception{
	public String toString(){
		return "Value cant be negative" ; 
	}
}

public class ThrowsThrow {
static int area(int l , int b) throws NegException{
	if(l<0 || b < 0)
		throw new NegException(); 
	return l*b;
}
static void met1()throws NegException {
	System.out.println(area(10,-3));
}
public static void main(String[] args) {
	try {
		met1();
		
	}
	catch (NegException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	finally {
		System.out.println("Hii");
	}
}

}
