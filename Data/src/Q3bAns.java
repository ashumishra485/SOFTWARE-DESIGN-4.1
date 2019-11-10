class Data
    {
       protected int value1, value2;
    
public Data(int v1, int v2)
{
	value1 = v1;
	value2 = v2;
}
public int Add() {
	return value1+value2;
	
}
public boolean All_Even() {
	boolean bol = false;
	if(value1 % 2 == 0 && value2 % 2==0) {
		bol = true;
	}
	return bol;
}
    }

class Pair extends Data{

	public Pair(int v1, int v2) {
		super(v1, v2);
	}
	public int Add() {
		return value1+ value2;
	}
	public boolean All_Even() {
		boolean bol = false;
		if(value1 % 2 == 0 && value2 % 2==0) {
			bol = true;
	}
		return bol;
	
}
class Treble extends Data{
	private int value3;
	public Treble(int v1, int v2, int v3) {
		super(v1,v2);
		this.value3=v3;
	}
	
	public int Add() {
		return value1+value2+value3;
	}
	public boolean All_Even() {
		if ((value1 % 2==0)&&(value2 % 2==0)&&(value3 % 2==0)) {
			return true;
		}
		else return false;
	}
}
	



public class Q3bAns
{
  public void main(String[] args)
  {
     Data []d = new Data[2];
     d[0] = new Pair(5,6);
     d[1] = new Treble(2, 4, 6);
     for (int i = 0; i < 2; i++)
     {   System.out.println();
         System.out.println("Sum of Values "+(i+1)+" :" +  d[i].Add());
         System.out.println("All Even "+(i+1)+ " :" +  d[i].All_Even());
     }
  }
}}
