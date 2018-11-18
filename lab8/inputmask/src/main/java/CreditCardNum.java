/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{
	Decorator wrapped;
	private IKeyEventHandler nextHandler ;
	private String number = "" ;

	public CreditCardNum()
	{
		this.wrapped=null;
	}
	
	public void wrapDec(Decorator w)
	{
		this.wrapped=w;
	}
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
    
	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
		{ 
			return "[" + wrapped.decorator(number) + "]" + "  " ;}
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 )
			if (ch.matches("X|x")) {
				if (number.length() > 0)
					number = number.substring(0, number.length() - 1);
			}
			else
			number += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	
	


	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}



	

}