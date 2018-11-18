import java.util.Arrays;

public class DescendingStrategy implements IStrategy{

	public void printNumbers(int[] num) {
		Arrays.sort(num);
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.print(num[i]+" ");
		}
	}

}
