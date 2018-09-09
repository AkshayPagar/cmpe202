
/**
 * Write a description of class Gumball2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gumball2 extends GumballMachine
{
    // instance variables - replace the example below with your own
    
    public Gumball2(int size)
    {
        this.num_gumballs = size;
        this.has_funds = false;
        this.funds=0;
    }
    
    public void insertCoin(int coin)
    {
        if(coin==25)
        {
            funds=funds+coin;
        
            if(funds<50)
            System.out.println("Added the money! Please add "+ (50-funds) +" amount");
            else
            {
                if(funds>=50)
                {
                    this.has_funds = true ;
                    System.out.println("Sufficient Money! Thank you !");                
                }
                else
                {
                    this.has_funds = false ;
                }
            
            }
        }
        
        else
        {
            System.out.println("Please insert quarters only");
        }
    
   }
}
