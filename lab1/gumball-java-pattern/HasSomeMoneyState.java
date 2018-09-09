
/**
 * Write a description of class HasSomeMoneyState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HasSomeMoneyState implements State
{
    GumballMachine gumballMachine;
 
    // instance variables - replace the example below with your own
    public HasSomeMoneyState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertMoney(int coin)
    {   
        if(gumballMachine.getPrice()!=0){
        if(coin!=25&&coin!=1&&coin!=10)
        System.out.println("Invalid Coin ");
        else{
        if(coin!=25 && !gumballMachine.all_coins)
        System.out.println("Please insert quarters only");
        else
        {
            gumballMachine.total=gumballMachine.total+coin;
            System.out.println("Money Inserted ");
            if(gumballMachine.total>=gumballMachine.getPrice())
            gumballMachine.setState(gumballMachine.getHasSufficientMoneyState());
            else
            gumballMachine.setState(gumballMachine.getHasSomeMoneyState());
        }
    }
    }
    else
    System.out.println("Please select from machine 1/2/3 only");
}
    public void ejectMoney()
    {   
       gumballMachine.total=0; 
       System.out.println("Money Ejected");
       gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
    
    public void turnCrank()
    {
        System.out.println("You turned...but there is no enough money");
    }
    
    public void dispense()
    {
        System.out.println("No gumball dispensed");
    }
    
    public String toString() {
		return "Please insert more money";
	}
}
