
public class RestrictedOuting extends Outing {
	private int max;

	public RestrictedOuting(int count, int a) {
		super(count);
		// TODO Auto-generated constructor stub
		max = a;
		
	}
	
	public boolean add() {
		if(count==max) {
		return false;}
		else {
			count++;
			return true;
		}
		
	}
	
	public int check_avail_places() {
		int diff = 0;
		diff = this.max - this.count;
		return diff;
		
	}
	
	public int readCount() {
		return count;
		
	}
	
	public void print_details() {
		super.print_details();
		System.out.println("MAX"+max);
	}

}
