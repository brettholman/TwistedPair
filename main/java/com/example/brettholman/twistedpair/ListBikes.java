package com.example.brettholman.twistedpair;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Written By Brett Holman
 * This class controls the List of Bikes page (pg 2).
 * All of the bikes are stored in a class names ListOfBikes.
 * This class would be currently controlling the inventory (if needed)
 * This is not the most ideal way to go about implementing the idea of a store.
 * But that would be something I would refactor, if this app was to be enhanced in the future.
 */

public class ListBikes extends ListActivity {
    private ListOfBikes listOfBikes = new ListOfBikes();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bikes);

        // Get the arrayLists into Arrays of their correct class.
        ArrayList<String> dummyValues = listOfBikes.getListOfNames();
        String[] Values = new String[dummyValues.size()];
        Values = dummyValues.toArray(Values);
        final ArrayList<Bike> bikes = listOfBikes.getListOfBikes();
        Bike[] bikesToPass = new Bike[bikes.size()];
        bikesToPass = bikes.toArray(bikesToPass);
        setListAdapter(new MyListItemAdapter(this, Values, bikesToPass));
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // Set up the onclick, and bundle the correct data to display.
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(parent.getContext(), ShowDetail.class);
                Bike curBike = bikes.get(position);
                intent.putExtra("Color", curBike.getColor());
                intent.putExtra("Brand", curBike.getBrand());
                intent.putExtra("Model", curBike.getModel());
                intent.putExtra("Price", curBike.getPrice());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_bikes, menu);
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
