import java.util.Arrays;

public class AscendingStrategy implements IStrategy{

	public void printNumbers(int[] num) {
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}

}
