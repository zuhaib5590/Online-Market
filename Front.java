package com.example.zuhai_y1rvi5f.onlinefoodorderingsystem;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;


public class Front extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_front);
        Thread timer=new Thread()
        {
            public void run()
            {
                try
                {

                    sleep(5000);

                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent splash=new Intent(Front.this,registerpage.class);

                    startActivity(splash);
                    // Intent splash=new Intent("com.example.zuhai_y1rvi5f.REGISTERPAGE");
                }
            }
        };timer.start();


    }

}
