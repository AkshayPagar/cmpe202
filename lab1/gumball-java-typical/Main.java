
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args) {
      
        GumballMachine Gm1= new Gumball1(20);
        System.out.println(Gm1);

        Gm1.insertCoin( 25 );
        Gm1.turnCrank();

        GumballMachine Gm2= new Gumball2(20);
        System.out.println(Gm2);
        Gm2.insertCoin( 25 );
        Gm2.turnCrank();
        Gm2.insertCoin( 25 );
        Gm2.turnCrank();

        GumballMachine Gm3= new Gumball3(20);
        System.out.println(Gm3);
        Gm3.insertCoin( 25 );
        Gm3.turnCrank();
        Gm3.insertCoin( 10 );
        Gm3.turnCrank();
        Gm3.insertCoin( 1 );
        Gm3.insertCoin( 1 );
        Gm3.insertCoin( 1 );
        Gm3.insertCoin( 1 );
        Gm3.insertCoin( 1 );
        Gm3.turnCrank();
        

}
}