    

public class Leaf implements Component {

    private String description ;
    protected Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
    }
    
    public void printDescription() {
        if(price!=null)
        System.out.println( " " + description + "              " + price ) ;
        else
        System.out.println( " " + description) ;
    }
    
    public double getPrice() {
        double p=0.0;
        if(price!=null)
            {
            p=price;
            return p;
        }
        else 
            return p;
    }
    
  

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
     
}
 
