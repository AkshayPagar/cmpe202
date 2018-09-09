
/**
 * Write a description of class Gumball3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gumball3 extends GumballMachine
{
    // instance variables - replace the example below with your own
    public Gumball3(int size)
    {
        this.num_gumballs = size;
        this.has_funds = false;
        this.funds=0;
    }
    
    public void insertCoin(int coin)
    {        
        if(coin==25|coin==10|coin==1)
        {
            funds=funds+coin;
        
            if(this.funds<50)
                System.out.println("Added the money! Please add "+ (50-funds) +" amount");
       
            else
            {
                System.out.println("Machine has enough money, Gumball can be ejected now");
                this.has_funds = true ;            
            }
        }
        
        else
        {
            System.out.println("Not a valid coin");
        }  
    }
}
