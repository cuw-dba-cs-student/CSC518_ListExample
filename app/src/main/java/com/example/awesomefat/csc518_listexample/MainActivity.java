package com.example.awesomefat.csc518_listexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView creditCardLV, loyaltyProgramLV;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.creditCardLV = (ListView)this.findViewById(R.id.creditCardListView);
        this.loyaltyProgramLV = (ListView)this.findViewById(R.id.loyaltyProgramListView);

        Core.ccLinkedListAdapter = new CreditCardArrayAdapterForLinkedLists(this, R.layout.custom_credit_card_row, Core.theCreditCardsLL);
        Core.lpLinkedListAdapter = new LoyaltyProgramLinkedListArrayAdapter(this,R.layout.custom_loyalty_program_row, Core.loyaltyProgramLinkedList);


        this.creditCardLV.setAdapter(Core.ccLinkedListAdapter);
        this.loyaltyProgramLV.setAdapter(Core.lpLinkedListAdapter);

    }

    public void onAddCreditCardButtonPressed(View v)
    {
        Intent i = new Intent(this, AddCreditCardActivity.class);
        this.startActivity(i);
    }

    public void onAddLoyaltyProgramButtonPressed(View v)
    {
        Intent i = new Intent(this, AddLoyaltyProgramActivity.class);
        this.startActivity(i);
    }

}
