public abstract class GumballMachine
{
    public int funds;
    public int num_gumballs;
    public boolean has_funds;

    abstract void insertCoin(int coin);
    
    
    public void turnCrank()
    {
        if ( this.has_funds )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_funds = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                this.funds=this.funds-50;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
