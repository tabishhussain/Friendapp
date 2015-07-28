package com.android.tabishhassan.howwellyouknowyourfriend.activities;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.tabishhassan.howwellyouknowyourfriend.R;

import java.util.ArrayList;
import java.util.List;

public class PlayerOneActivity extends ListActivity {
    List<String> data = new ArrayList<String>();

    String[] city= {
            "Bangalore",
            "Chennat",
            "Mumbai",
            "Pune",
            "Delhi",
            "Jabalpur",
            "Indore",
            "Ranchi",
            "Hyderabad",
            "Ahmedabad",
            "Kolkata",
            "Bhopal",
            "Pune",
            "Delhi",
            "Jabalpur",
            "Indore",
            "Ranchi",
            "Hyderabad",
            "Ahmedabad",
            "Kolkata",
            "Bhopal"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_one);
        ListView list = getListView();
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setTextFilterEnabled(true);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.list_items, city));
        list.setDividerHeight(4);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        CheckedTextView item = (CheckedTextView) v;
        Toast.makeText(this, city[position] + " checked : " +
                item.isChecked(), Toast.LENGTH_SHORT).show();
    }
}
