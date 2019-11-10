
public class Cashsave extends Account {
	private int max;

	public Cashsave(int n , int b, int a) {
		super(n, b);
		max = a;
		
	}
	
	public boolean deposit(int amt) {
		if(amt <= max ) {
			balance = balance + amt;
			return true;
		}
		else {
			return false; 
		}
		
	}

}
