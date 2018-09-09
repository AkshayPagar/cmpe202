
/**
 * Write a description of class Gumball1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gumball1 extends GumballMachine
{
    public Gumball1( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_funds = false;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
           { 
               this.has_funds = true ;
               System.out.println("Quarter Inserted");
           
            }
        else 
            this.has_funds = false ;
    }
    
}
