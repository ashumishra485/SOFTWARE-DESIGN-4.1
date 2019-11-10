import java.util.Scanner;
public class SearchTargetTest {

    public static boolean searchTarget(int value,int target){
    	int last = value%10;
    	int rest = value/10;
    	if (value<10) {
    		if(value==target)
    			return true;
    		else
    			return false;
    	}
    	else {
    		if(last==target) 
    			return true;
    		else
    			return searchTarget(rest, target);
    	}
    
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
  	    System.out.print("Enter Value:");
    	int number =sc.nextInt();
  	    System.out.print("Enter Target:");
    	int target =sc.nextInt();
      System.out.println("Res= "+ searchTarget(number,target));
    }
}

