package com.example.awesomefat.csc518_listexample;

public class LoyaltyProgramNode {

    private LoyaltyProgram lp;
    private LoyaltyProgramNode next;

    public LoyaltyProgramNode(LoyaltyProgram lp)
    {
        this.lp = lp;
        this.next = null;
    }

    public LoyaltyProgram getLylPrg() {
        return lp;
    }

    public LoyaltyProgramNode getNextNode() {
        return next;
    }

    public void setNextNode (LoyaltyProgramNode nextNode) {
        this.next = nextNode;
    }
}
