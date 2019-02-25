package com.example.awesomefat.csc518_listexample;

public class LoyaltyProgramLinkedList {

    private LoyaltyProgramNode head;
    private int count;

    public LoyaltyProgramLinkedList()
    {
        this.head = null;
        this.count = 0;
    }

    public int length()
    {
        return this.count;
    }

    public LoyaltyProgram getAtIndex(int index)
    {
        LoyaltyProgramNode currNode = this.head;
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.getNextNode();
        }
        return currNode.getLylPrg();
    }

    public void addLast(LoyaltyProgram lp)
    {
        LoyaltyProgramNode n = new LoyaltyProgramNode(lp);

        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            LoyaltyProgramNode currNode = this.head;

            while(currNode.getNextNode() != null)
            {
                currNode = currNode.getNextNode();
            }
            currNode.setNextNode(n);
        }
        this.count++;
    }
}
