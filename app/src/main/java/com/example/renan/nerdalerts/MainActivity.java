package com.example.renan.nerdalerts;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#270e5b")));

    }
    public void somNoob(View v){
        final MediaPlayer som= MediaPlayer.create(this,R.raw.noobalert);
        som.start();
    }
    public void somMentira(View v){
        final MediaPlayer som= MediaPlayer.create(this,R.raw.mentiraalert);
        som.start();
    }
    public void somFunk(View v){
        final MediaPlayer som= MediaPlayer.create(this,R.raw.funkalert);
        som.start();
    }
    public void somMasc(View v){
        final MediaPlayer som= MediaPlayer.create(this,R.raw.masculinityalert);
        som.start();
    }
    public void somTarado(View v){
        final MediaPlayer som= MediaPlayer.create(this,R.raw.taradoalert);
        som.start();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        ///final MediaPlayer som= MediaPlayer.create(Inicio_fragment.super.getActivity(),R.raw.iapetus); exemplo som.start();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

}
