public class Burger extends Composite
{
    
    double price;
    public Burger ( String d, double p )
    {
        super(d,p) ;
        this.price=p;
                
    }
    public Burger ( String d)
    {
        super(d) ;
    }
    
    public double getPrice()
    {
        double totalPrice=0.0;
        totalPrice+=price;
        return totalPrice;
    }

    
    public void printDescription() {
        if(price>0)
        System.out.println( " " + description + "                  "+price);
        else
        System.out.println( " " + description);
        
        
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}

       