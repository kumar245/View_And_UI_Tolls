package com.kumar.user.viewanduitolls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class List_View extends AppCompatActivity {
    ArrayList<AdapterItems> listnewsData=new ArrayList<AdapterItems>();
    MyCustomAdapter myCustomAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view);
        listView= (ListView) findViewById(R.id.lvList);
        //add data and view it
        listnewsData.add(new AdapterItems(R.drawable.c93d77234d4b8aa2cb41def4728e8157,"developer","develop apps"));
        listnewsData.add(new AdapterItems(R.drawable.d902a425d2e1acddb3bf7afda555706,"tester","testing apps"));
        listnewsData.add(new AdapterItems(R.drawable.featured,"admin","admin apps"));
        listnewsData.add(new AdapterItems(R.drawable.horse,"developer","develop apps"));
        myCustomAdapter=new MyCustomAdapter(listnewsData);
        listView.setAdapter(myCustomAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final AdapterItems adapterItems= listnewsData.get(position);
                TextView tvID= (TextView) view.findViewById(R.id.TID);
            }
        });
    }
    private class MyCustomAdapter extends BaseAdapter{
        public ArrayList<AdapterItems> listnewsDataAdapter;

        public MyCustomAdapter(ArrayList<AdapterItems> listnewsDataAdapter) {
            this.listnewsDataAdapter = listnewsDataAdapter;
        }

        @Override
        public int getCount() {
            return listnewsDataAdapter.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View myView=inflater.inflate(R.layout.list_view_example,null);

            //position is index if we pass index position it is size of index
            final AdapterItems adapterItems=listnewsDataAdapter.get(position);
            ImageView iID= (ImageView) myView.findViewById(R.id.IvImage);
            iID.setImageResource(adapterItems.Id);
            TextView tvTitle= (TextView) myView.findViewById(R.id.TID);
            tvTitle.setText(adapterItems.JobTitle);
            tvTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(List_View.this, adapterItems.JobTitle, Toast.LENGTH_SHORT).show();
                }
            });
            TextView tvDes= (TextView) myView.findViewById(R.id.DID);
            tvDes.setText(adapterItems.Description);
            return myView;
        }
    }
}
