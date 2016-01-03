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

import com.purplebrain.adbuddiz.sdk.AdBuddiz;

public class MainActivity extends AppCompatActivity {
    MediaPlayer som;
    boolean mambo = false;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ads on nerd alert - by adbuddiz.com
        try {
            AdBuddiz.setPublisherKey("3dfa073e-c66c-426a-acab-76ce992d1434"); //feae3f4d-f584-46a1-bdae-418b09d2d8c8 adbuddiz hause@gmail.com
            AdBuddiz.cacheAds(this);
        } catch (Exception e) {
            //do nothing
        }
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2cccbc")));


    }

    public void somNoob(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.noobalert);
        som.start();
        mambo = true;

    }

    public void somMentira(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.mentiraalert);
        som.start();
        mambo = true;
    }

    public void somFunk(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.funkalert);
        som.start();
        mambo = true;
    }

    public void somMasc(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.masculinityalert);
        som.start();
        mambo = true;

    }

    public void somFominha(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.fominhaalert);
        som.start();
        mambo = true;
    }

    public void somNojo(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.nojoalert);
        som.start();
        mambo = true;
    }

    public void somNovela(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.noveleiroalert);
        som.start();
        mambo = true;
    }

    public void somActor(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.overactoralert);
        som.start();
        mambo = true;
    }

    public void somTarado(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.taradoalert);
        som.start();
        mambo = true;
    }

    public void somNerd(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.nerdoffice);
        som.start();
        mambo = true;
    }

    public void somNerdcast(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.nerdcast);
        som.start();
        mambo = true;
    }

    public void somBabaca(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.babacaalert);
        som.start();
        mambo = true;
    }
    public void somOzob(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.babaca);
        som.start();
        mambo = true;
    }
    public void somK(View v) {
        valida();
        som = MediaPlayer.create(this, R.raw.milhoes);
        som.start();
        mambo = true;
    }

    public void valida() {

        if (mambo) {
            som.stop();
            mambo = false;
        }
        Ads();
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
            alert.setMessage("Nerd Alerts\n\nDeveloped by: Hause \nEmail: renan.cunha33@gmail.com\nEmail: hausegroup@gmail.com");
            alert.setNeutralButton("OK", null);
            alert.show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Ads() {
        x++;
        if ((x%5)==0) {
            try {
                AdBuddiz.showAd(this); // this = current Activity
            } catch (Exception e) {
                //do nothing
            }
        }

    }
}
