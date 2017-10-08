package com.betagro.adulvitc.easyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.betagro.adulvitc.easyapp.fragment.ChooseImageFragment;
import com.betagro.adulvitc.easyapp.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFramentMain, new MainFragment())
                    .commit();


        }

//        Toolbar Controller
        toolbarController();


    }   // Main Method


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

//        For Main Menu
        if (item.getItemId() == R.id.itemMain) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contentFramentMain, new MainFragment())
                    .commit();

        }



//        For Choose Image Menu
        if (item.getItemId() == R.id.itemChooseImage) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contentFramentMain, new ChooseImageFragment())
                    .commit();
        }


//         For Exit
        if (item.getItemId() == R.id.itemExit) {
            finish();
        }




        return super.onOptionsItemSelected(item);
    }

    private void toolbarController() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}   // Main Class
