

public class Main {

	public static void main(String[] args) {
		GumballMachine gm1 = new GumballMachine(5,1);

		System.out.println(gm1);

		gm1.insertMoney(25);
		gm1.turnCrank();

		GumballMachine gm2 = new GumballMachine(5,2);

		System.out.println(gm2);

		gm2.insertMoney(25);
		gm2.turnCrank();
		gm2.insertMoney(25);
		gm2.turnCrank();

		GumballMachine gm3 = new GumballMachine(5,3);

		System.out.println(gm3);
		gm3.insertMoney(25);
		gm3.insertMoney(10);
		gm3.insertMoney(10);
		gm3.insertMoney(1);
		gm3.insertMoney(1);
		gm3.insertMoney(10);
		gm3.turnCrank();
	}
}
