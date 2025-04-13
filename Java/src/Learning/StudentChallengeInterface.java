package Learning;
interface Member {
	void callback();
	
}
class Store {
	Member mem[ ] = new Member[100];
	int cnt = 0 ;
	
	void register(Member m) {
		mem[cnt ++] = m ;
		
	}
	 void inviteSales(){
		for(int i = 0 ; i < cnt ; i++) {
			mem[i].callback();
		}
	}
	
}
class Customer implements Member{
	String name ; 
	public Customer() {
		// TODO Auto-generated constructor stub
		
	}
}



















/*interface Member {
	void callback();
}

class Store  {
	Member mem[] = new Member[100];
	int cnt = 0;
	void regeister(Member m) {
		mem[cnt ++]= m;
		
	}
	void inviteSale() {
		for(int i = 0 ; i < cnt ; i++) {
			mem[i].callback();
		}
	}
}

class Customer implements Member {
	String name ;
	public Customer(String n ) {
		// TODO Auto-generated constructor stub
		name = n ;
		
	}
	public void callback() {
		System.out.println(" Ok , I will be there");
	}
}
public class StudentChallengeInterface {

	public static void main(String[] args) {
		// 
		Store s = new Store();
		Customer c1 = new Customer("John");
		Customer c2 = new Customer("John");

		s.regeister(c1);
		s.regeister(c2);
		s.inviteSale();
	}

}
*/