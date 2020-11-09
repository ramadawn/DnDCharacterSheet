package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CodexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codex);
    }
    /** Called when the user taps the Monster Bestiary button */
    public void openMonsterBestiaryActivity(View view) {
        Intent intent = new Intent(this, MonsterBestiaryActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the Playable Races button */
    public void openPlayableRacesActivity(View view) {
        Intent intent = new Intent(this, PlayableRacesActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the Playable Classes button */
    public void openPlayableClassesActivity(View view) {
        Intent intent = new Intent(this, PlayableClassesActivity.class);
        startActivity(intent);
    }
}