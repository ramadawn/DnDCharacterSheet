package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CodexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codex);

        //Click to go to Bestiary
        Button bestiaryBtn = (Button) findViewById(R.id.bestiarybtn);
        bestiaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CodexActivity.this, MonsterBestiaryActivity.class));
            }
        });

        //Click to go to Playable Races
        Button speciesBtn = (Button) findViewById(R.id.speciesbtn);
        speciesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CodexActivity.this, PlayableRacesActivity.class));
            }
        });

        //Click to go to Playable Classes
        Button classesBtn = (Button) findViewById(R.id.classesbtn);
        classesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CodexActivity.this, PlayableClassesActivity.class));
            }
        });
    }

}
