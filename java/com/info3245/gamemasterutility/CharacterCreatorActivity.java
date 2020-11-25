package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
    }

    public void saveCharacter(CharacterSheet character) {
        String output = character.toString();
        String path = character.getSaveFileName();
        FileOutputStream fos = null;
        try {
            fos = openFileOutput(path, MODE_PRIVATE);
            fos.write(output.getBytes());
            Toast.makeText(this, "Saved to" + getFilesDir() + "/" + path, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void saveButton(View view){
        CharacterSheet newChar = new CharacterSheet();

        //get stats from text into character object

        saveCharacter(newChar);
    }
}