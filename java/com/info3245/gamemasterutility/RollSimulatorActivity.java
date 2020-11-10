package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class RollSimulatorActivity extends AppCompatActivity {

    //Initialize Values.
    int[] dice;
    int diceNumbers;
    int diceSides;
    int diceTotal;
    AnimationDrawable diceAnimation;
    MediaPlayer diceSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_simulator);

        //Create Dice Rolling Sound.
        diceSound = new MediaPlayer();
        diceSound = MediaPlayer.create(this,R.raw.dicerolling);

        Button diceRoll = (Button) findViewById(R.id.diceroll);
        ImageView diceImg = (ImageView) findViewById(R.id.rollAnim);
        diceImg.setBackgroundResource(R.drawable.diceanimation);
        diceAnimation = (AnimationDrawable) diceImg.getBackground();

        // Created for displaying results
        final TextView dicesTotal = (TextView) findViewById(R.id.totalText);
        final TextView dicesResults = (TextView) findViewById(R.id.resultsText);
        final EditText numRoll = (EditText) findViewById(R.id.diceNum);
        final EditText sideRoll = (EditText) findViewById(R.id.sideNum);

        //Back Button to Codex
        Button backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RollSimulatorActivity.this,GameToolsActivity.class));
            }
        });

        diceRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Reset dice total for repeat uses.
                diceTotal = 0;

                //Play dice sound and animation.
                diceSound.start();
                diceAnimation.start();

                //Get number and sides of dice
                diceNumbers = Integer.parseInt(numRoll.getText().toString());
                diceSides = Integer.parseInt(sideRoll.getText().toString());

                //Create the array of dice roll results and add up total.
                dice = new int[diceNumbers];
                for (int i = 0; i < dice.length; i++) {
                    dice[i] = new Random().nextInt(diceSides+1);
                    diceTotal = diceTotal + dice[i];
                }

                //Set text to results and total.
                dicesResults.setText(Arrays.toString(dice));
                dicesTotal.setText(String.valueOf(diceTotal));

                //Create handler to allow repeat animations
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        diceAnimation.stop();
                    }
                }, 1500);
            }
        });

    }
}
