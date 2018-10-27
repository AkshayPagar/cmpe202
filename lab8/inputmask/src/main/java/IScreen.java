/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public interface IScreen
{

	void rem(int count);
    void key(String ch, int cnt) ; 	// send key entry events to screen 
    String display() ;      		// displays screen components
    String name() ;         		// returns name of screen
 
}
