package com.example.awesomefat.csc518_listexample;

//singleton - a class filled with stuff accessible by everything
public class Core
{

    public static CreditCardsLinkedList theCreditCardsLL = new CreditCardsLinkedList();
    public static CreditCardArrayAdapterForLinkedLists ccLinkedListAdapter;
    public static int creditCardCount = 0;

    public static LoyaltyProgramLinkedList loyaltyProgramLinkedList = new LoyaltyProgramLinkedList();
    public static LoyaltyProgramLinkedListArrayAdapter lpLinkedListAdapter;
    public static int loyaltyProgramCount = 0;

    public static void addLoyaltyProgram(LoyaltyProgram lp)
    {
        Core.loyaltyProgramLinkedList.addLast(lp);
        Core.loyaltyProgramCount++;
        Core.lpLinkedListAdapter.notifyDataSetChanged();
    }

    public static void addCreditCard(CreditCard cc)
    {
        Core.theCreditCardsLL.addEnd(cc);
        Core.creditCardCount++;
        Core.ccLinkedListAdapter.notifyDataSetChanged();
    }
}
