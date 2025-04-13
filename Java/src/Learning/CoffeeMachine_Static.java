package Learning;
class CoffeeMachine {
	private float coffeeQty;
	private float milkQty;
	private float waterQty;
	
	static private CoffeeMachine my= null ;
	
	
	private CoffeeMachine() {
		coffeeQty=1;
		milkQty=1;
		waterQty=1;
		
	}static CoffeeMachine getInstance() {
		if(my == null) {
			my = new CoffeeMachine();
			//return my;
		}
		return my;
	}
	
	
}
public class CoffeeMachine_Static {
	public static void main(String[] args) {
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();
		System.out.println(m1+" "+ m2+ " "+ m3);
		if(m1==m2 && m2==m3) {
			System.out.println("same");
		}
	}
	
	

}
