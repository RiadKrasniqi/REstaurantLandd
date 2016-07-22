package com.example.riad.restaurantlandd;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;
    SearchView sv;
    ArrayAdapter<String> adapter;
    ArrayAdapter<Integer> adapteri;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.restaurantapp,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back,R.drawable.back};
    public static String [] prgmNameList={"Let Us C","c++","kulla","lopa","kali","peja","rrota","suxhuki"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        context=this;

        lv=(ListView) findViewById(R.id.listView);
        sv = (SearchView) findViewById(R.id.searchView);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,prgmNameList);




        lv.setAdapter(adapter);




        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                adapter.getFilter().filter(text);

                return false;
            }
        });






    }




}
