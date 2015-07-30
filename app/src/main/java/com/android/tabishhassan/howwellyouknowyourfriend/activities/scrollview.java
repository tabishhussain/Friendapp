package com.android.tabishhassan.howwellyouknowyourfriend.activities;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.tabishhassan.howwellyouknowyourfriend.R;

/**
 * Created by tabishhassan on 7/30/15.
 */
public class scrollview extends ArrayAdapter<String>
{
    private final Activity context;
    private String name;
    int count;
    public scrollview(Activity context,String str) {
        super(context, R.layout.list_items);
        this.context = context;
        name = str;
    }
    public View getView()
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_items, null, true);
        TextView Textname = (TextView)rowView.findViewById(R.id.textView);
        ImageView img = (ImageView)rowView.findViewById(R.id.imageView);
        CheckBox checkBox = (CheckBox)rowView.findViewById(R.id.checkBox);

        Textname.setText(name);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(context,name+" Added",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context,name+" Delete",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return rowView;
    }

}
