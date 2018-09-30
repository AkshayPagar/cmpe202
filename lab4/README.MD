


Classes:

    Customer
    Waitlist
    Restaurant

Responsibility:

    Customer: -Provide required information -Receieve notifications -Send Confirmation after receiving message from waitlist

    Waitlist -Add customers to the waitlist -Remove customers from waitlist -Check if current available seats can accommodate customer who is next on waitlist -Notify customers of availability of the table.

    Restaurant -Keep track of tables -Allocate table to selected customer -Send available table size to waitlist
    
    I have applied Observer pattern to the stated problem.
    Restaurant class is the Subject which is changing its state and notifies waitlist.
    Waitlist class is incharge of maintaining observer list and notifying observers and requesting confirmation. 
    Restaurant and waitlist extends ConcreteSubject class which in turn implements Subject Interface.
    Customer is extended from ConcreteObserver which implements Observer Interface.
    

Execution:

    As table is available the restaurant notfies waitlist, it sets the State to available and states how many seats are available.
    setState() calls notifyObservers() to update them about the change
    The customers in waitlist are checked if their member count matches or is less than available seats.
    If it is, them after requesting confirmation from customer, the table is allocated to customer. 
