package com.example.awesomefat.csc518_listexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class LoyaltyProgramLinkedListArrayAdapter extends ArrayAdapter {

    private Context context;
    private LoyaltyProgramLinkedList lpLinkedList;
    private int textViewResourceId;

    public LoyaltyProgramLinkedListArrayAdapter(@NonNull Context context, int textViewResourceId, @NonNull LoyaltyProgramLinkedList linkedList) {
        //Ask Dr. L what "super" does. Inheritance. Rely on the parents constructor.
        super(context, textViewResourceId);
        this.context = context;
        this.lpLinkedList = linkedList;
        this.textViewResourceId = textViewResourceId;
    }

    @Override
    public int getCount()
    {
        return this.lpLinkedList.length();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View lpListItem = convertView;
        if(lpListItem == null)
        {
            lpListItem = LayoutInflater.from(context).
                    inflate(this.textViewResourceId,parent,false);
        }

        TextView lpName = (TextView)lpListItem.findViewById(R.id.lpNameTV);
        TextView lpBank = (TextView)lpListItem.findViewById(R.id.lpBankTV);
        TextView lpPointBal = (TextView)lpListItem.findViewById(R.id.lpPointBalTV);

        LoyaltyProgram lp = this.lpLinkedList.getAtIndex(position);

        lpName.setText( lp.getName() );
        lpBank.setText( lp.getBank() );
        lpPointBal.setText( "" +  lp.getPointBalance() );
        //return the View after we have set all of the values

        return lpListItem;
    }
}
