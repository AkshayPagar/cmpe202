public class Sauce extends LeafDecorator
{
    private String[] options ;
    
    
    public Sauce( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        for(int i=0;i<options.length-1;i++)
            this.price+=0.50;
        
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
