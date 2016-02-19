package com.sun.suni.converter.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.sun.suni.converter.adapters.Custom_Grid;
import com.sun.suni.converter.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    GridView grid;
    String[] text = {"Temperature", "Weight", "Length", "Time", "Area", "Volume", "Storage", "Pressure", "Sound", "Energy", "Magnet", "Image"};
    int[] imgId = {R.drawable.thermometer67, R.drawable.food27, R.drawable.leftarrow, R.drawable.vehicle92, R.drawable.pie37, R.drawable.beaker8, R.drawable.storage, R.drawable.bpc, R.drawable.audio, R.drawable.energy, R.drawable.magnet, R.drawable.images};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Custom_Grid adapter = new Custom_Grid(MainActivity.this, text, imgId);
        grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Intent t = new Intent(getApplicationContext(),Temperature.class);
                        startActivity(t);
                        break;
                    case 1:
                        Intent w = new Intent(getApplicationContext(),Weight.class);
                        startActivity(w);
                        break;
                    case 2:
                        Intent c = new Intent(getApplicationContext(),Length.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent ti = new Intent(getApplicationContext(),Time.class);
                        startActivity(ti);
                        break;
                    case 4:
                        Intent s = new Intent(getApplicationContext(),Area.class);
                        startActivity(s);
                        break;
                    case 5:
                        Intent v = new Intent(getApplicationContext(),Volume.class);
                        startActivity(v);
                        break;
                    case 6:
                        Intent st = new Intent(getApplicationContext(), Storage.class);
                        startActivity(st);
                        break;
                    case 7:
                        Intent p = new Intent(getApplicationContext(),Pressure.class);
                        startActivity(p);
                        break;
                    case 8:
                        Intent sound = new Intent(getApplicationContext(),Sound.class);
                        startActivity(sound);
                        break;
                    case 9:
                        Intent ene = new Intent(getApplicationContext(),Energy.class);
                        startActivity(ene);
                        break;
                    case 10:
                        Intent mag = new Intent(getApplicationContext(),Magnet.class);
                        startActivity(mag);
                        break;
                    case 11:
                        Intent ima = new Intent(getApplicationContext(),Image.class);
                        startActivity(ima);
                        break;
                }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.feed) {
            // Handle the camera action
        } else if (id == R.id.about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
