package com.example.riad.restaurantlandd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {


    String[] result;
    String[] Lloji;
    String[] vendndodhja;
    String[] prishtine;
    Context context;
    int[] imageId;
    private static LayoutInflater inflater = null;

    public CustomAdapter(MainActivity mainActivity, String[] prgmNameList,String[] llojiii,String[] vendi,String[] country, int[] prgmImages) {
        // TODO Auto-generated constructor stub
        result = prgmNameList;
        Lloji = llojiii;
        vendndodhja = vendi;
        prishtine = country;
        context = mainActivity;
        imageId = prgmImages;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView tv;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.program_list, null);
        holder.tv = (TextView) rowView.findViewById(R.id.textView1);
        holder.tv2= (TextView) rowView.findViewById(R.id.lloji);
        holder.tv3 = (TextView) rowView.findViewById(R.id.vendi);
        holder.tv4 = (TextView) rowView.findViewById(R.id.prishtine);
        holder.img = (ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result[position]);
        holder.tv2.setText(Lloji[position]);
        holder.tv3.setText(vendndodhja[position]);
        holder.tv4.setText(prishtine[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        notifyDataSetChanged();
    }

}


