

import java.util.Random;

public class HasSufficientMoneyState implements State {
    GumballMachine gumballMachine;
 
    public HasSufficientMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertMoney(int coin) 
    {
        if(gumballMachine.getPrice()!=0){
        if(coin!=25&&coin!=1&&coin!=10)
        System.out.println("Invalid Coin ");
        else{
        if(gumballMachine.getPrice()==25)
        System.out.println("You have already inserted a quarter");
        else{
            System.out.println("Money Inserted ");
            gumballMachine.total=gumballMachine.total+coin;
                if(coin!=25 && !gumballMachine.all_coins)
                    System.out.println("Please insert quarter only");
                else
                    gumballMachine.setState(gumballMachine.getHasSufficientMoneyState());
            }
        }   
    }
    else
    System.out.println("Please Select from machine 1/2/3 only");
}
    public void ejectMoney() {
        gumballMachine.total=0; 
        System.out.println("Money returned");
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.total=gumballMachine.total-gumballMachine.getPrice();
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
