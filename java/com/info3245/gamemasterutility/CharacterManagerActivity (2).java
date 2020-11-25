package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CharacterManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_manager);
    }
    /** Called when the user taps the Character Creator button */
    public void openCharacterCreatorActivity(View view) {
        Intent intent = new Intent(this, CharacterCreatorActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the Character List button */
    public void openCharacterListActivity(View view) {
        Intent intent = new Intent(this, CharacterListActivity.class);
        startActivity(intent);
    }
}