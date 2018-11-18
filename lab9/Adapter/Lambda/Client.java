
public class Client {
		
	public static void main(String args[])
	{
		String str1="Hello";
		Adaptee o = (text) -> {System.out.println(text+ " World");};
		Target t = () -> { o.printmsg(str1);};
		
		t.sayHello();
	}
}
