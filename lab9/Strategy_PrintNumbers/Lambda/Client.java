

import java.util.Arrays;
import java.util.List;

public class Client {

	  public static void main(String[] args) {
		 int[] Num= {2,6,1,5,4,3,7,9,8};
	    List<IStrategy> strategies = 
	      Arrays.asList(
	    (num) -> {Arrays.sort(num);
	    		System.out.println("Printing in Ascending Order:");
	    			for(int i=0;i<num.length;i++)
	    			System.out.print(num[i]+" ");},
	    
	    (num) -> {System.out.println("\n\nPrinting in Descending Order:");
	    		for(int i=num.length-1;i>=0;i--)
					System.out.print(num[i]+" ");}
	    );
	    
	    strategies.forEach((elem) -> elem.printNumbers(Num));
	  }
	  
	}
	

