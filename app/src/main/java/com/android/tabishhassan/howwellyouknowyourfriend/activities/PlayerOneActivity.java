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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.tabishhassan.howwellyouknowyourfriend.R;

import java.util.ArrayList;
import java.util.List;

public class PlayerOneActivity extends Activity {
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
        LinearLayout layout = (LinearLayout)findViewById(R.id.layoutitems);
        for(int i = 0 ; i < city.length; i++)
        {
            scrollview view = new scrollview(PlayerOneActivity.this,city[i]);
            layout.addView(view.getView());
        }
    }
}
