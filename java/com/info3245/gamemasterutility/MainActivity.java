package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_GameMasterUtility);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Codex button */
    public void openCodexActivity(View view) {
        Intent intent = new Intent(this, CodexActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the Game Tools button */
    public void openGameToolsActivity(View view) {
        Intent intent = new Intent(this, GameToolsActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the Character Manager button */
    public void openCharacterManagerActivity(View view) {
        Intent intent = new Intent(this, CharacterManagerActivity.class);
        startActivity(intent);
    }

}