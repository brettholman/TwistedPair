package com.example.brettholman.twistedpair;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;


public class ListBikes extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("1", "1");
        setContentView(R.layout.activity_list_bikes);
        ListOfBikes listOfBikes = new ListOfBikes();
        ArrayList<String> dummyValuestmp = listOfBikes.getListOfNames();
        String[] dummyValues = new String[dummyValuestmp.size()];
        dummyValues = dummyValuestmp.toArray(dummyValues);
        ArrayList<Bike> bikestmp = listOfBikes.getListOfBikes();
        Bike[] bikes = new Bike[bikestmp.size()];
        bikes = bikestmp.toArray(bikes);
        Log.v("2", "2");
        setListAdapter(new MyListItemAdapter(this, dummyValues, bikes));
        Log.v("3", "3");
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(parent.getContext(), ShowDetail.class);
                intent.putExtra("index", position);
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
