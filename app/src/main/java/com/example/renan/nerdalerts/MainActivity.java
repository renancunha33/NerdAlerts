package com.example.renan.nerdalerts;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer som;
    boolean mambo=false ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2cccbc")));


    }
    public void somNoob(View v){
        valida();
        som= MediaPlayer.create(this, R.raw.noobalert);
        som.start();
        mambo = true;
    }
    public void somMentira(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.mentiraalert);
        som.start();
        mambo = true;
    }
    public void somFunk(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.funkalert);
        som.start();
        mambo = true;
    }
    public void somMasc(View v){
        valida();
            som = MediaPlayer.create(this, R.raw.masculinityalert);
            som.start();
        mambo = true;

    }
    public void somFominha(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.fominhaalert);
        som.start();
        mambo = true;
    }
    public void somNojo(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.nojoalert);
        som.start();
        mambo = true;
    }
    public void somNovela(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.noveleiroalert);
        som.start();
        mambo = true;
    }
    public void somActor(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.overactoralert);
        som.start();
        mambo = true;
    }
    public void somTarado(View v){
        valida();
       som= MediaPlayer.create(this,R.raw.taradoalert);
        som.start();
        mambo = true;
    }
    public void somNerd(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.nerdoffice);
        som.start();
        mambo = true;
    }
    public void somNerdcast(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.nerdcast);
        som.start();
        mambo = true;
    }
    public void somBabaca(View v){
        valida();
        som= MediaPlayer.create(this,R.raw.babacaalert);
        som.start();
        mambo = true;
    }
public void valida(){

    if (mambo){
        som.stop();
        mambo=false;
    }

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
        if (id == R.id.action_settings) {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("About...");
            alert.setMessage("Nerd Alerts\n\nDeveloped by: Renan Cunha \nEmail: renan.cunha33@gmail.com");
            alert.setNeutralButton("OK", null);
            alert.show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
