package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameToolsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_tools);
    }
    /** Called when the user taps the Roll Simulator button */
    public void openRollSimulatorActivity(View view) {
        Intent intent = new Intent(this, RollSimulatorActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the Random Session Generator button */
    public void openRandomSessionGeneratorActivity(View view) {
        Intent intent = new Intent(this, RandomSessionGeneratorActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the Damage Calculator button */
    public void openDamageCalculatorActivity(View view) {
        Intent intent = new Intent(this, DamageCalculatorActivity.class);
        startActivity(intent);
    }
}