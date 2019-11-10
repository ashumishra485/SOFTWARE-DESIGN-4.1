
class Shape{
           
	protected int length;
    public Shape(int l){length=l;}
    public void draw(){}
    }	

class VertLine extends Shape{
	public VertLine(int l) {
		super(l);
	}
		public void draw() {
			for(int i=0;i<length;i++) {
				System.out.println("*");
			}
			
		}
	}
	
class HorzLine extends Shape{
	public HorzLine(int l) {
		super(l);
	}
	
	public void draw() {
		for(int i=0;i<length;i++) {
			System.out.print("*");
		}
		
		
	}
	   
}
class DiagonalLine extends Shape{
	public DiagonalLine(int l) {
		super(l);
	}
	public void draw() {
		for(int i=0;i<length;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
	}
}


            

public class DrawTest {
	public static void main(String[] args)
	{
	     Shape []s=new Shape [3];
         s[0]=new VertLine(5);
         s[1]=new HorzLine(6);  
         s[2]=new DiagonalLine(6);   
         //s[2]=new VertLine(6);  
         for(int j=0;j<3;j++)
         {
                System.out.println("\n\n");
                s[j].draw();
           }
}    }
