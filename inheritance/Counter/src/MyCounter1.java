
public class MyCounter1 extends Counter {
	private int ulimit;

	public MyCounter1(int v,int ul) {
		super(v);
		ulimit = ul;
	}

	public boolean increment() {
		if(value==ulimit)
			return false;
		else
		{
			value++;
			return true;
		}
	
	}
	
	public int readLimit() {
		return ulimit;
	}

}
