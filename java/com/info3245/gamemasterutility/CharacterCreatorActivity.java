package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharacterCreatorActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creator);

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
        //Initialize edit text boxes
        EditText inputName = findViewById(R.id.etName);
        EditText inputHP = findViewById(R.id.etHealth);
        EditText inputWeapon = findViewById(R.id.etWeapon);
        EditText inputAC = findViewById(R.id.etAC);
        EditText inputStrength = findViewById(R.id.etStrength);
        EditText inputDexterity = findViewById(R.id.etDexterity);
        EditText inputConstitution = findViewById(R.id.etConstitution);
        EditText inputIntelligence = findViewById(R.id.etIntelligence);
        EditText inputWisdom = findViewById(R.id.etWisdom);
        EditText inputCharisma = findViewById(R.id.etCharisma);
        //Put entered text into character
        newChar.setName(inputName.getText().toString());
        newChar.setMaxHP(inputHP.getText().toString());
        newChar.setCurrentHP(inputHP.getText().toString());
        newChar.setWeapon1(inputWeapon.getText().toString());
        newChar.setAC(inputAC.getText().toString());
        newChar.setAttributes(inputStrength.getText().toString(),
                inputDexterity.getText().toString(),
                inputConstitution.getText().toString(),
                inputIntelligence.getText().toString(),
                inputWisdom.getText().toString(),
                inputCharisma.getText().toString());
        newChar.setSaveFileName(newChar.getName() + "_save.txt");
        //save character to file
        saveCharacter(newChar);
    }
}