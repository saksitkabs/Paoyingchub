package com.example.parkt_000.paoyingchub;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;


public class game extends ActionBarActivity {

    ImageButton paper1;
    ImageButton sccissor1;
    ImageButton rock1;
    ImageButton en1;
    ImageButton en2;
    ImageButton en3;

    String choice;
    String opponent;
    int n ;
    int a ;
    int round;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        paper1 = (ImageButton)findViewById(R.id.paper1);
        sccissor1 = (ImageButton)findViewById(R.id.sccissor1);
        rock1 = (ImageButton)findViewById(R.id.rock1);
        en1 = (ImageButton)findViewById(R.id.en1);
        en2 = (ImageButton)findViewById(R.id.en2);
        en3 = (ImageButton)findViewById(R.id.en3);

    }

    public void buttonClicked(View v) {
        int id = v.getId();


        switch(id) {
            case R.id.rock1:


                paper1.setVisibility(View.INVISIBLE);


                sccissor1.setVisibility(View.INVISIBLE);

                choice = "rock";


                 n = new Random().nextInt(2); // Gives n such that 0 <= n < 20
                a = new Random().nextInt(2);

            if(n==0){

                en2.setVisibility(View.INVISIBLE);
                en3.setVisibility(View.INVISIBLE);

                if (a==0){
                    opponent = "rock";
                    en1.setImageResource(R.drawable.rockv1ja1);

                }

                else if(a==1){
                    opponent = "paper";
                    en1.setImageResource(R.drawable.paperv1ja1);
                }

                else if(a==2){
                    opponent = "sccissor";
                    en1.setImageResource(R.drawable.sccissorja1);
                }

            }

               else if(n==1){

                    en1.setVisibility(View.INVISIBLE);
                    en3.setVisibility(View.INVISIBLE);

                    if(a==0){
                        opponent = "rock";

                        en2.setImageResource(R.drawable.rockv1ja1);

                    }

                   else if(a==1){
                        opponent = "paper";
                        en2.setImageResource(R.drawable.paperv1ja1);
                    }

                    else if(a==2){
                        opponent = "sccissor";
                        en2.setImageResource(R.drawable.sccissorja1);
                    }
                }


               else if(n==2){

                    en1.setVisibility(View.INVISIBLE);
                    en2.setVisibility(View.INVISIBLE);

                    if(a==0){
                        opponent = "rock";
                        en3.setImageResource(R.drawable.rockv1ja1);
                    }

                   else if(a==1){
                        opponent = "paper";
                        en3.setImageResource(R.drawable.paperv1ja1);
                    }

                   else if(a==2){
                        opponent = "sccissor";
                        en3.setImageResource(R.drawable.sccissorja1);
                    }

                }





                break;

            case R.id.paper1:


                rock1.setVisibility(View.INVISIBLE);


                sccissor1.setVisibility(View.INVISIBLE);

                choice = "paper";

                n = new Random().nextInt(2); // Gives n such that 0 <= n < 20

                if(n==0){

                    en2.setVisibility(View.INVISIBLE);
                    en3.setVisibility(View.INVISIBLE);


                    if(a==0){
                        opponent = "rock";
                        en1.setImageResource(R.drawable.rockv1ja1);
                    }

                   else if(a==1){
                        opponent = "paper";
                        en1.setImageResource(R.drawable.paperv1ja1);
                    }

                   else if(a==2){
                        opponent = "sccissor";
                        en1.setImageResource(R.drawable.sccissorja1);
                    } }

               else if(n==1){

                    en1.setVisibility(View.INVISIBLE);
                    en3.setVisibility(View.INVISIBLE);
                    if(a==0){
                        opponent = "rock";
                        en2.setImageResource(R.drawable.rockv1ja1);
                    }

                   else if(a==1){
                        opponent = "paper";
                        en2.setImageResource(R.drawable.paperv1ja1);
                    }

                  else  if(a==2){
                        opponent = "sccissor";
                        en2.setImageResource(R.drawable.sccissorja1);
                    }  }


               else if(n==2){

                    en1.setVisibility(View.INVISIBLE);
                    en2.setVisibility(View.INVISIBLE);
                    if(a==0){
                        opponent = "rock";
                        en3.setImageResource(R.drawable.rockv1ja1);
                    }

                  else  if(a==1){
                        opponent = "paper";
                        en3.setImageResource(R.drawable.paperv1ja1);
                    }

                 else   if(a==2){
                        opponent = "sccissor";
                        en3.setImageResource(R.drawable.sccissorja1);
                    }  }





                break;

            case R.id.sccissor1:


                paper1.setVisibility(View.INVISIBLE);


                rock1.setVisibility(View.INVISIBLE);

                choice = "sccissor1";

                n = new Random().nextInt(2); // Gives n such that 0 <= n < 20

                if(n==0){

                    en2.setVisibility(View.INVISIBLE);
                    en3.setVisibility(View.INVISIBLE);
                    if(a==0){
                        opponent = "rock";
                        en1.setImageResource(R.drawable.rockv1ja1);
                    }

                   else if(a==1){
                        opponent = "paper";
                        en1.setImageResource(R.drawable.paperv1ja1);
                    }

                   else if(a==2){
                        opponent = "sccissor";
                        en1.setImageResource(R.drawable.sccissorja1);
                    }


                }

              else  if(n==1){

                    en1.setVisibility(View.INVISIBLE);
                    en3.setVisibility(View.INVISIBLE);
                    if(a==0){
                        opponent = "rock";
                        en2.setImageResource(R.drawable.rockv1ja1);
                    }

                 else   if(a==1){
                        opponent = "paper";
                        en2.setImageResource(R.drawable.paperv1ja1);
                    }

                  else  if(a==2){
                        opponent = "sccissor";
                        en2.setImageResource(R.drawable.sccissorja1);
                    } }


              else  if(n==2){

                    en1.setVisibility(View.INVISIBLE);
                    en2.setVisibility(View.INVISIBLE);
                    if(a==0){
                        opponent = "rock";
                        en3.setImageResource(R.drawable.rockv1ja1);
                    }

                  else  if(a==1){
                        opponent = "paper";
                        en3.setImageResource(R.drawable.paperv1ja1);
                    }

                  else  if(a==2){
                        opponent = "sccissor";
                        en3.setImageResource(R.drawable.sccissorja1);
                    }  }


                break;

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
