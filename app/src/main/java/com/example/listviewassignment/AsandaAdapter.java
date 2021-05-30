package com.example.listviewassignment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AsandaAdapter extends ArrayAdapter<String> {

    private String [] drinkName;
    private Integer [] drinkImage;
    private Activity context;

    public AsandaAdapter(Activity context, Integer [] drinkImage,String [] drinkName) {
        super(context, R.layout.activity_main,drinkName);

        this.context = context;
        this.drinkName = drinkName;
        this.drinkImage = drinkImage;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.layout,null,true);
        TextView text = (TextView) rowView.findViewById(R.id.textView);
        ImageView pics = (ImageView) rowView.findViewById(R.id.imageView);
        text.setText(drinkName[position]);
        pics.setImageResource(drinkImage[position]);
        return rowView;

    }
}

