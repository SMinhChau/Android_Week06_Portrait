package com.example.android_week06;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoesAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Shoes> arrayList;

    public ShoesAdapter(Context context, int layout, ArrayList<Shoes> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
         view= LayoutInflater.from(context).inflate(layout,viewGroup,false);

         Shoes shoes= arrayList.get(i);

        TextView title= view.findViewById(R.id.textItemTop);
        TextView name= view.findViewById(R.id.textItemBottom);
        ImageView img= view.findViewById(R.id.imgItem);

        title.setText(shoes.getShowText());
        name.setText(shoes.getName());
        img.setImageResource(shoes.getImg());
        return view;
    }
}
