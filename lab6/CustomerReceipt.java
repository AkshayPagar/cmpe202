public class CustomerReceipt implements Strategy{

    public Component printDesc()
    {
        Composite order = new Composite( "Customer Receipt:") ;
        Burger burg = new Burger("LBB",5.59) ;
        burg.addChild(new Leaf("{{{{Bacon}}}}")) ;
        burg.addChild(new Leaf("Lettuce")) ;
        burg.addChild(new Leaf("Tomato")) ;
        burg.addChild(new Leaf("->|Grilled Onions")) ;
        burg.addChild(new Leaf("->|JALA grilled")) ;
        
        order.addChild( burg);
        
        order.addChild(new Leaf("LTL CJN", 2.79));
        //double subtotal= order.getPrice()+customBurger.getPrice();
        //System.out.println(subtotal);
        
        return order ;
    }
}   


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/