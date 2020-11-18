package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class CharacterCreatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creator);

        CharacterSheet newCharacter = new CharacterSheet();
        newCharacter.setAttributes("8","3","6","2","2","7");
        newCharacter.setSkills("4","2","7","2","7","3",
                "1","8","0","3","1","4","1","7","3","4","4","2");
        newCharacter.setWeapon1("sword");
        newCharacter.setName("Ronaldo");
        newCharacter.setAC("6");
        newCharacter.setMaxHP("30");
        newCharacter.fullHealth();
        newCharacter.setSaveFileName(newCharacter.getName() + "_save.txt");
        Save.saveSheet(newCharacter, this);

    }
}