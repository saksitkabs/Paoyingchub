package com.example.parkt_000.paoyingchub;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;






public class MainActivity extends ActionBarActivity {





    MediaPlayer player ;
    MediaPlayer player2 ;
    MediaPlayer player3 ;



    DBgame helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player=MediaPlayer.create(MainActivity.this,R.raw.main);
        player.setLooping(true);

        player.start();

    }
    protected void onResume() {
        super.onResume();
    }


    public void buttonClicked(View v) {
        int id = v.getId();
        Intent i;




        switch(id) {
            case R.id.btstart:





                if(player!= null){
                    player.stop();
                    player.release();}

                if(player3!= null){
                    player3.stop();
                    player3.release();}


                player2=MediaPlayer.create(MainActivity.this,R.raw.click);
                player2.start();

               //timer();


                i = new Intent(this, Splash_screen.class);
                startActivity(i);
                break;

            case R.id.btshow:


                if(player!= null){
                    player.stop();
                    player.release();}


                player2=MediaPlayer.create(MainActivity.this,R.raw.click);
                player2.start();
                i = new Intent(this, HighScore.class);
                startActivity(i);
                break;


        }
    }

public void timer() {
    long startTime = System.currentTimeMillis();

    while (System.currentTimeMillis() - startTime < 3000) {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 88) {
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                int score = data.getIntExtra("score", 0);


                helper = new DBgame(this.getApplicationContext());
                SQLiteDatabase db = helper.getWritableDatabase();
                ContentValues r = new ContentValues();

                r.put("name",name);
                r.put("score",score);

                long new_id = db.insert("dbscore",null,r);


            }
        }

        Log.d("course", "onActivityResult");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
