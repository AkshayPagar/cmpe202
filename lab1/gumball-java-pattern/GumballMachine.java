

public class GumballMachine {
 
    State soldOutState;
    State noMoneyState;
    State hasSufficientMoneyState;
    State hasSomeMoneyState;
    State soldState;
 
    State state = soldOutState;
    public int count = 0;
    public int price;
    public boolean all_coins;
    int total;
    public GumballMachine(int numberGumballs, int machineType) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasSufficientMoneyState = new HasSufficientMoneyState(this);
        hasSomeMoneyState = new HasSomeMoneyState(this);
        soldState = new SoldState(this);

        this.total=0;
        if (machineType==1)
        {
        this.price=25;
        this.all_coins=false;
        }
        else if (machineType==2)
        {
        this.price=50;
        this.all_coins=false;
        }
        else if (machineType==3)
        {
        this.price=50;
        this.all_coins=true;
        }
        else
        {
        this.price=0;
        this.all_coins=true;
        }
        
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noMoneyState;
        } 
               
    }
 
    public void insertMoney(int coin) {
        state.insertMoney(coin);
    }
 
    public void ejectMoney() {
        state.ejectMoney();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
    
    int getTotal() {
        return total;
    }
    
    int getPrice() {
        return price;
    }
 
    void refill(int count) {
        this.count = count;
        state = noMoneyState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasSufficientMoneyState() {
        return hasSufficientMoneyState;
    }

    public State getHasSomeMoneyState() {
        return hasSomeMoneyState;
    }
    
    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
