package com.example.riad.restaurantlandd;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    public static String [] prgmNameList={"Restaurant Kulla","c++","kulla","lopa","kali","peja","rrota","suxhuki","pela","makina"};
    public static String [] country ={"Let Us C","c++","kulla","lopa","kali","peja","rrota","suxhuki","pela","makina"};
    public static String [] llojiii ={"Let Us C:","c++:","kulla:","lopa:","kali:","peja:","rrota:","suxhuki:","pela:","makina:"};
    public static String [] vendi ={"Let Us C","c++","kulla","lopa","kali","peja","rrota","suxhuki","pela","makina"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomAdapter adapter = new
                CustomAdapter(MainActivity.this, prgmNameList,country,llojiii,vendi, prgmImages);
        lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +prgmNameList[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}

