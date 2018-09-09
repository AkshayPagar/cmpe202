

public class NoMoneyState implements State {
    GumballMachine gumballMachine;
    
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertMoney(int coin) {
        if(gumballMachine.getPrice()!=0){
        if(coin!=25&&coin!=1&&coin!=10)
        System.out.println("Invalid Coin ");
        else{
        System.out.println("Money Inserted ");
            if(coin!=25 && !gumballMachine.all_coins)
            System.out.println("Please insert quarter only");
            else
            {   
                gumballMachine.total=gumballMachine.total+coin;
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
 
    public void ejectMoney() {
        System.out.println("You haven't inserted any money");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no money");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
