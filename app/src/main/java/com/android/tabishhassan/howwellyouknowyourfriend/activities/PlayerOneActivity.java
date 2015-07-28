package com.android.tabishhassan.howwellyouknowyourfriend.activities;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
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
            "Bangalore\t\t\t\t\t\t\t",
            "Chennai\t\t\t\t\t\t\t\t\t\t\t\t",
            "Mumbai\t\t\t\t\t\t\t\t",
            "Pune\t\t\t\t\t\t\t\t\t\t",
            "Delhi\t\t\t\t\t\t\t\t\t\t",
            "Jabalpur\t\t\t\t\t\t\t\t\t\t\t\t\t",
            "Indore\t\t\t\t\t\t\t\t\t",
            "Ranchi\t\t\t\t\t\t\t\t\t",
            "Hyderabad\t\t\t\t\t\t\t\t\t\t\t\t\t",
            "Ahmedabad\t\t\t\t\t\t\t\t\t",
            "Kolkata\t\t\t\t\t\t\t\t\t",
            "Bhopal\t\t\t\t\t\t\t\t\t\t\t"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_one);
        ListView list = getListView();
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setTextFilterEnabled(true);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, city));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        CheckedTextView item = (CheckedTextView) v;
        Toast.makeText(this, city[position] + " checked : " +
                item.isChecked(), Toast.LENGTH_SHORT).show();
    }

    public class ListAdapter extends BaseAdapter{
        Activity context;
        LayoutInflater inflater;
        public ListAdapter(Activity c){
            this.context = c;
            inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder holder ;
            if(convertView==null)
            {
                holder = new ViewHolder();
                convertView = inflater.inflate(R.layout.list_items,null);
                holder.textView = (TextView)convertView.findViewById(R.id.lblListItems);
                convertView.setTag(holder);

            }
            else
            {
                holder = (ViewHolder)convertView.getTag();
            }
            holder.textView.setText(data.get(position));
            return convertView;
        }

    }
    public static class ViewHolder{
        TextView textView;
    }
}
