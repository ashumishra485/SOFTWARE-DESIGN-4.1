

public class Account {
	private String name;
	private int balance;
	 
	public Account(){name="unknown";
	                 this.balance=0;}
	public Account(String nm,int bal)
	                {this.name=nm;
	                this.balance=bal;}

	public boolean withdraw(int amt){
		if (amt>this.balance){
			return false;}
		else{
			this.balance-=amt;
			return true;}
	}
	
	public void deposit(int amt) {
		this.balance +=  amt;
	}
	
	public int read_balance() {
		return balance;
		
	}
	
	public String readName() {
		return name;
		
	}
	
	

}
