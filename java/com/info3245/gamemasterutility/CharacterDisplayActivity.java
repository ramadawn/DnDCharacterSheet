package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CharacterDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_display);

        //initialize text view
        TextView cName = findViewById(R.id.tvNameDisplay);
        TextView cHP = findViewById(R.id.tvHealthDisplay);
        TextView cAC = findViewById(R.id.tvACDisplay);
        TextView cWeapon = findViewById(R.id.tvWeaponDisplay);
        TextView cStrength = findViewById(R.id.tvStrengthDisplay);
        TextView cDexterity = findViewById(R.id.tvDexterityDisplay);
        TextView cConstitution = findViewById(R.id.tvConstitutionDisplay);
        TextView cIntelligence = findViewById(R.id.tvIntelligenceDisplay);
        TextView cWisdom = findViewById(R.id.tvWisdomDisplay);
        TextView cCharisma = findViewById(R.id.tvCharismaDisplay);
        //get incoming intent
        Intent intent = getIntent();
        //unpack data from intent
        String data = intent.getStringExtra("data");
        //make blank character
        CharacterSheet displayChar = new CharacterSheet();
        //load string to character
        Load.loadSheet(displayChar,data);
        //set name in textview
        cName.setText(displayChar.getName());
        cHP.setText(displayChar.getCurrentHPStr());
        cAC.setText(displayChar.getACString());
        cWeapon.setText(displayChar.getWeapon1());
        cStrength.setText(displayChar.getStrString());
        cDexterity.setText(displayChar.getDexString());
        cConstitution.setText(displayChar.getConString());
        cIntelligence.setText(displayChar.getIntString());
        cWisdom.setText(displayChar.getWisString());
        cCharisma.setText(displayChar.getChaString());

    }
}