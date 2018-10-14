public class PackingSlip implements Strategy{

    public Component printDesc()
    {
        Composite order = new Composite( "Packing slip:" ) ;
        Burger burg = new Burger("LBB") ;
        burg.addChild(new Leaf("Lettuce")) ;
        burg.addChild(new Leaf("Tomato")) ;
        burg.addChild(new Leaf("->|Grilled Onions")) ;
        burg.addChild(new Leaf("->|JALA grilled")) ;
        burg.addChild(new Leaf("{{{{Bacon}}}}")) ;
       
        order.addChild( burg );
        
        order.addChild(new Leaf("LTL CJN"));

        return order ;
    }
}   


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/