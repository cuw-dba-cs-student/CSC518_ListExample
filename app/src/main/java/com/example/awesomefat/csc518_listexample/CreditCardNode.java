package com.example.awesomefat.csc518_listexample;

public class CreditCardNode {

    private CreditCard creditCard;
    private CreditCardNode next;

    public CreditCardNode(CreditCard creditCard)
    {
        this.creditCard = creditCard;
        this.next = null;
    }

    public CreditCard getCard() {
        return creditCard;
    }

    public CreditCardNode getNextNode () {
        return next;
    }

    public void setNextNode (CreditCardNode nextNode) {
        this.next = nextNode;
    }
}
