package com.example.brettholman.twistedpair;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class Login extends ActionBarActivity {

    /**
     * This is the main functionality of this screen,
     * Two Dummy EditText fields that can not be null when the button is pushed.
     * Otherwise the Bike Listing page is loaded.
     *
     * @param v
     */
    public void LoginClickHandler(View v) {
        Log.v("LoginInClickHandler","Working");
        EditText UserName = (EditText)findViewById(R.id.UserName);
        EditText Password = (EditText)findViewById(R.id.Password);
        if(UserName.getText().length() == 0) {
            Toast.makeText(
                    getApplicationContext(),
                    "Please enter a valid login",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if(Password.getText().length() == 0) {
            Toast.makeText(
                    getApplicationContext(),
                    "Please enter a valid Password",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(this, ListBikes.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
