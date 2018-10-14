  
import java.text.DecimalFormat;


public class Client {

    public static void main(String args[])
    {
        double totalPrice=0.0;
        DecimalFormat fmt = new DecimalFormat("0.00");
        CustomerReceipt cust=new CustomerReceipt();
        Component theOrder = cust.printDesc() ;
        theOrder.printDescription();
        totalPrice = theOrder.getPrice();
        System.out.println("\n=============================");
        System.out.println("\nTotal Price:          "+ fmt.format(totalPrice)+ "\n\n");
        PackingSlip ps=new PackingSlip();
        Component theOrder1 = ps.printDesc() ;
        theOrder1.printDescription();
        
    }
    
}
 
