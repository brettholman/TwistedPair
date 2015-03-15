package com.example.brettholman.twistedpair;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Written by Brett Holman
 * This class controls displaying the information from each bike.
 * Based off of the intent that was passed in when this was called, I pull data and display that data.
 */

public class ShowDetail extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        // Pull the information from the Intent
        Bundle extras = getIntent().getExtras();
        double Price = extras.getDouble("Price");
        String Model = extras.getString("Model");
        String Brand = extras.getString("Brand");
        BikeColor Color = (BikeColor)extras.getSerializable("Color");

        // Get the different Views
        TextView price = (TextView)findViewById(R.id.Price);
        TextView brand = (TextView)findViewById(R.id.ShowDetailBrand);
        TextView model = (TextView)findViewById(R.id.ShowDetailModel);
        ImageView image = (ImageView)findViewById(R.id.Image);

        // Set the correct values to the different Views.
        switch(Color) {
            case Red:
                image.setImageResource(R.drawable.bigredbike);
                break;
            case Black:
                image.setImageResource(R.drawable.bigblackbike);
                break;
            case Blue:
                image.setImageResource(R.drawable.bigbluebike);
                break;
            default:
                image.setImageResource(R.drawable.ic_launcher);
                break;
        }
        price.setText("$" + Double.toString(Price));
        model.setText(Model);
        brand.setText(Brand);
    }

    public void addToCartClickHandler(View v) {
        Toast.makeText(this,"Item Added to Cart!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
