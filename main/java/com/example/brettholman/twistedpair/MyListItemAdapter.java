package com.example.brettholman.twistedpair;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Brett Holman on 3/14/2015.
 */
public class MyListItemAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;
    private final Bike[] bikes;

    public MyListItemAdapter(Context context, String[] values, Bike[] bikes) {
        super(context, R.layout.adapter, values);
        this.context = context;
        this.values = values;
        this.bikes = bikes;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.adapter, parent, false);
        TextView price = (TextView)rowView.findViewById(R.id.Price);
        TextView model = (TextView)rowView.findViewById(R.id.Model);
        TextView brand = (TextView)rowView.findViewById(R.id.Brand);
        ImageView image = (ImageView)rowView.findViewById(R.id.icon);
        price.setText(Double.toString(bikes[position].getPrice()));
        model.setText(bikes[position].getModel());
        brand.setText(bikes[position].getBrand());
        BikeColor color = bikes[position].getColor();
        switch(color) {
            case Black:
                image.setImageResource(R.drawable.blackbike);
                break;
            case Blue:
                image.setImageResource(R.drawable.bluebike);
                break;
            case Red:
                image.setImageResource(R.drawable.redbike);
                break;
            default:
                image.setImageResource(R.drawable.ic_launcher);
                break;
        }
        return rowView;
    }
}
