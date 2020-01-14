package com.example.pitbulltop5;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1,m2,m3,m4,m5,m6;
    int count;




    public void onclick1(View view)
    {
        if(count==1) {
            m1.stop();
            m1=MediaPlayer.create(this,R.raw.dontstop);
        }
        else if(count==2) {
            m2.stop();
            m2=MediaPlayer.create(this,R.raw.fireball);
        }
        else if(count==3) {
            m3.stop();
            m3=MediaPlayer.create(this,R.raw.givemeeverything);
        }
        else if(count==4) {
            m4.stop();
            m4=MediaPlayer.create(this,R.raw.iknow);
        }
        else if(count==5) {
            m5.stop();
            m5=MediaPlayer.create(this,R.raw.international);
        }
        else if(count==6) {
            m6.stop();
            m6=MediaPlayer.create(this,R.raw.rain);
        }
       count=1;
        ImageView img1=(ImageView)findViewById(R.id.img);
        img1.animate().rotationBy(360).setDuration(2000);
        Toast.makeText(getApplicationContext(),"playing pitbull don't stop",Toast.LENGTH_LONG).show();
       m1.start();
    }

    public void onclick2(View view)
    {
        if(count==1) {
            m1.stop();
            m1=MediaPlayer.create(this,R.raw.dontstop);
        }
        else if(count==2) {
            m2.stop();
            m2=MediaPlayer.create(this,R.raw.fireball);
        }
        else if(count==3) {
            m3.stop();
            m3=MediaPlayer.create(this,R.raw.givemeeverything);
        }
        else if(count==4) {
            m4.stop();
            m4=MediaPlayer.create(this,R.raw.iknow);
        }
        else if(count==5) {
            m5.stop();
            m5=MediaPlayer.create(this,R.raw.international);
        }
        else if(count==6) {
            m6.stop();
            m6=MediaPlayer.create(this,R.raw.rain);
        }

      count=2;
        ImageView img1=(ImageView)findViewById(R.id.img);
        img1.animate().rotationBy(360).setDuration(2000);
        Toast.makeText(getApplicationContext(),"playing pitbull fireball",Toast.LENGTH_LONG).show();
      m2.start();
    }

    public void onclick3(View view)
    {
        if(count==1) {
            m1.stop();
            m1=MediaPlayer.create(this,R.raw.dontstop);
        }
        else if(count==2) {
            m2.stop();
            m2=MediaPlayer.create(this,R.raw.fireball);
        }
        else if(count==3) {
            m3.stop();
            m3=MediaPlayer.create(this,R.raw.givemeeverything);
        }
        else if(count==4) {
            m4.stop();
            m4=MediaPlayer.create(this,R.raw.iknow);
        }
        else if(count==5) {
            m5.stop();
            m5=MediaPlayer.create(this,R.raw.international);
        }
        else if(count==6) {
            m6.stop();
            m6=MediaPlayer.create(this,R.raw.rain);
        }

     count=3;
        ImageView img1=(ImageView)findViewById(R.id.img);
        img1.animate().rotationBy(360).setDuration(2000);
        Toast.makeText(getApplicationContext(),"playing pitbull give me everything",Toast.LENGTH_LONG).show();
     m3.start();
    }

    public void onclick4(View view)
    {
        if(count==1) {
            m1.stop();
            m1=MediaPlayer.create(this,R.raw.dontstop);
        }
        else if(count==2) {
            m2.stop();
            m2=MediaPlayer.create(this,R.raw.fireball);
        }
        else if(count==3) {
            m3.stop();
            m3=MediaPlayer.create(this,R.raw.givemeeverything);
        }
        else if(count==4) {
            m4.stop();
            m4=MediaPlayer.create(this,R.raw.iknow);
        }
        else if(count==5) {
            m5.stop();
            m5=MediaPlayer.create(this,R.raw.international);
        }
        else if(count==6) {
            m6.stop();
            m6=MediaPlayer.create(this,R.raw.rain);
        }

     count=4;
        ImageView img1=(ImageView)findViewById(R.id.img);
        img1.animate().rotationBy(360).setDuration(2000);
        Toast.makeText(getApplicationContext(),"playing pitbull i know",Toast.LENGTH_LONG).show();
     m4.start();
    }

    public void onclick5(View view)
    {
        if(count==1) {
            m1.stop();
            m1=MediaPlayer.create(this,R.raw.dontstop);
        }
        else if(count==2) {
            m2.stop();
            m2=MediaPlayer.create(this,R.raw.fireball);
        }
        else if(count==3) {
            m3.stop();
            m3=MediaPlayer.create(this,R.raw.givemeeverything);
        }
        else if(count==4) {
            m4.stop();
            m4=MediaPlayer.create(this,R.raw.iknow);
        }
        else if(count==5) {
            m5.stop();
            m5=MediaPlayer.create(this,R.raw.international);
        }
        else if(count==6) {
            m6.stop();
            m6=MediaPlayer.create(this,R.raw.rain);
        }

     count=5;
        ImageView img1=(ImageView)findViewById(R.id.img);
        img1.animate().rotationBy(360).setDuration(2000);
        Toast.makeText(getApplicationContext(),"playing pitbull international",Toast.LENGTH_LONG).show();
     m5.start();
    }

    public void onclick6(View view)
    {
        if(count==1) {
            m1.stop();
            m1=MediaPlayer.create(this,R.raw.dontstop);
        }
        else if(count==2) {
            m2.stop();
            m2=MediaPlayer.create(this,R.raw.fireball);
        }
        else if(count==3) {
            m3.stop();
            m3=MediaPlayer.create(this,R.raw.givemeeverything);
        }
        else if(count==4) {
            m4.stop();
            m4=MediaPlayer.create(this,R.raw.iknow);
        }
        else if(count==5) {
            m5.stop();
            m5=MediaPlayer.create(this,R.raw.international);
        }
        else if(count==6) {
            m6.stop();
            m6=MediaPlayer.create(this,R.raw.rain);
        }

      count=6;
        ImageView img1=(ImageView)findViewById(R.id.img);
        img1.animate().rotationBy(360).setDuration(2000);
        Toast.makeText(getApplicationContext(),"playing pitbull rain over me",Toast.LENGTH_LONG).show();
      m6.start();
    }

    public void onclickplay(View view)
    {
        if(count==1)
            m1.start();
        else if(count==2)
            m2.start();
        else if(count==3)
            m3.start();
        else if(count==4)
            m4.start();
        else if(count==5)
            m5.start();
        else if(count==6)
            m6.start();
    }

    public void onclickpause(View view)
    {
        if(count==1)
            m1.pause();
        else if(count==2)
            m2.pause();
        else if(count==3)
            m3.pause();
        else if(count==4)
            m4.pause();
        else if(count==5)
            m5.pause();
        else if(count==6)
            m6.pause();


    }

    public void onclickstop(View view)
    {
        if(count==1) {
            m1.stop();
            m1=MediaPlayer.create(this,R.raw.dontstop);
        }
        else if(count==2) {
            m2.stop();
            m2=MediaPlayer.create(this,R.raw.fireball);
        }
        else if(count==3) {
            m3.stop();
            m3=MediaPlayer.create(this,R.raw.givemeeverything);
        }
        else if(count==4) {
            m4.stop();
            m4=MediaPlayer.create(this,R.raw.iknow);
        }
        else if(count==5) {
            m5.stop();
            m5=MediaPlayer.create(this,R.raw.international);
        }
        else if(count==6) {
            m6.stop();
            m6=MediaPlayer.create(this,R.raw.rain);
        }
        count=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        m1=MediaPlayer.create(this,R.raw.dontstop);
        m2=MediaPlayer.create(this,R.raw.fireball);
        m3=MediaPlayer.create(this,R.raw.givemeeverything);
        m4=MediaPlayer.create(this,R.raw.iknow);
        m5=MediaPlayer.create(this,R.raw.international);
        m6=MediaPlayer.create(this,R.raw.rain);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
