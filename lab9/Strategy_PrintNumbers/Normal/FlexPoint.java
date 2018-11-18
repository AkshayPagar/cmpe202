
public class FlexPoint {
	
	 int[] Num= {2,6,1,5,4,3,7,9,8};
	 
	 public IStrategy current;
	 public IStrategy NormalStrategy=new AscendingStrategy();
	 //public IStrategy ReverseStrategy=new ReverseStrategy();
	 
	 public FlexPoint()
	 {
		 this.current=NormalStrategy;
	 }
	 
	 public void changeStrategy(IStrategy s)
	 {
		 current=s;
	 }
	 
	 public void printNumbers()
	 {
		 System.out.println("\nPrinting numbers in "+current.getClass().getName());
		 current.printNumbers(Num);
		 
	 }
}
