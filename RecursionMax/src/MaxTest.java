import java.util.Scanner;
public class MaxTest {

    public static int maxDigits(int value){
    	int last = value%10;
    	int rest = value/10;
    	if(value < 10)
    		return value;
    	else {
    		if(last>maxDigits(rest))
    			return last;
    		else
    			return maxDigits(rest);
    	}
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
  	    System.out.print("Enter Value:");
    	int number =sc.nextInt();

      System.out.println("Res= "+ maxDigits(number));
    }
}

