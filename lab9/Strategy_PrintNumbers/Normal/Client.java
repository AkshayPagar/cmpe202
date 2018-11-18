
public class Client {

	public void runTest()
	{
		FlexPoint fp= new FlexPoint();
		IStrategy NormalStrategy=new AscendingStrategy();
		IStrategy ReverseStrategy=new DescendingStrategy();
		fp.printNumbers();
		fp.changeStrategy(ReverseStrategy);
		fp.printNumbers();
	}
	
	public static void main(String args[])
	{
		Client c= new Client();
		c.runTest();
	}
	
}
