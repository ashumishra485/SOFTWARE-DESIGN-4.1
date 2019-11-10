class Name
    {
        protected String value;
        public Name(String v) {
        	value = v;
        }
        public void print() {}
        public void resetName(String v) {
        }
    }
class UnderLine extends Name{
	public UnderLine(String v) {
		super(v);
		
	}
	
	public void print() {
		super.print();
		for(int i=0;i<value.length();i++) {
			System.out.print("-");
		}
		System.out.println();
		
	}
}
	
class UpperCase extends Name{
	public UpperCase(String v) {
		super(v);
		
	}
	
	public void print() {
		System.out.println(value.toUpperCase());
		
	}
}
public class NameTest {

	public static void main(String[] args) {
        	Name[] list=new Name[4];
        	list[0]= new Name("Athy");
        	list[1]= new UnderLine("Bally");
        	list[2]= new UpperCase("Cork");
        	list[3]= new UnderLine("Derry");
        
		for(int i=0;i<list.length;i++){
			list[i].print();
			System.out.println();
		}  
	}
}
