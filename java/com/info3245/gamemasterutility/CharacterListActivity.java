package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class CharacterListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);
        CharacterSheet oldCharacter = new CharacterSheet();
        oldCharacter.setSaveFileName("Ronaldo_save.txt");
        
        String[] files = getApplicationContext().fileList();

        TextView charName = findViewById(R.id.charName);
        charName.setText(oldCharacter.getName());
    }
}