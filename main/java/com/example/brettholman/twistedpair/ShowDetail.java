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


public class ShowDetail extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        Bundle extras = getIntent().getExtras();
        int index = extras.getInt("index");
        ListOfBikes lob = new ListOfBikes();
        Bike bike = lob.getAtIndex(index);
        Log.v("Working", "SoFar");
        ImageView image = (ImageView)findViewById(R.id.Image);
        switch(bike.getColor()) {
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
        }
        TextView price = (TextView)findViewById(R.id.Price);
        price.setText("$"+Double.toString(bike.getPrice()));
        TextView brand = (TextView)findViewById(R.id.ShowDetailBrand);
        brand.setText(bike.getBrand());
        TextView model = (TextView)findViewById(R.id.ShowDetailModel);
        model.setText(bike.getModel());
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
