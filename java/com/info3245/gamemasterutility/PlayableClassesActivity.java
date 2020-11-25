package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class PlayableClassesActivity extends AppCompatActivity {

    int positionid;
    String[] namelist = {"Barbarian","Bard","Cleric","Druid","Fighter","Monk","Paladin","Ranger","Rogue","Sorcerer","Warlock","Wizard"};
    String[] descriptionlist = {"A fierce warrior of primitive background who can enter a battle rage.","An inspiring magician whose power echoes the music of creation.",
            "A priestly champion who wields divine magic in service of a higher power.","A priest of the Old Faith, wielding the powers of nature and adopting animal forms.",
            "A master of martial combat, skilled with a variety of weapons and armor.","A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection.",
            "A holy warrior bound to a sacred oath.","A warrior who combats threats on the edges of civilization.",
            "A scoundrel who uses stealth and trickery to overcome obstacles and enemies.","A spellcaster who draws on inherent magic from a gift or bloodline.",
            "A wielder of magic that is derived from a bargain with an extraplanar entity.","A scholarly magic-user capable of manipulating the structures of reality."};
    String[] hitdielist = {"d12","d8","d8","d8","d10","d8","d10","d10","d8","d6","d8","d6"};
    String[] primaryabilitylist = {"Strength","Charisma","Wisdom","Wisdom","Strength or Dexterity","Dexterity & Wisdom",
            "Strength & Charisma","Dexterity & Wisdom","Dexterity","Charisma","Charisma","Intelligence"};
    String[] saveslist = {"Strength & Constitution","Dexterity & Charisma","Wisdom & Charisma","Intelligence & Wisdom","Strength & Constitution","Strength & Dexterity",
            "Wisdom & Charisma","Strength & Dexterity","Dexterity & Intelligence","Constitution & Charisma","Wisdom & Charisma","Intelligence & Wisdom"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playable_classes);

        final Spinner classesChoice = (Spinner) findViewById(R.id.classesSpinner);

        TextView className = (TextView) findViewById(R.id.className);
        TextView classDescription = (TextView) findViewById(R.id.classDescription);
        TextView hitDie = (TextView) findViewById(R.id.hitDie);
        TextView primaryAbility = (TextView) findViewById(R.id.primaryAbility);
        TextView classSaves = (TextView) findViewById(R.id.classSaves);
        ImageView classImage = (ImageView) findViewById(R.id.classImage);

        //Change data for each Class
        classesChoice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                positionid = classesChoice.getSelectedItemPosition();
                className.setText(namelist[positionid]);
                classDescription.setText(descriptionlist[positionid]);
                hitDie.setText(hitdielist[positionid]);
                primaryAbility.setText(primaryabilitylist[positionid]);
                classSaves.setText(saveslist[positionid]);

                switch(positionid) {
                    case 0:
                        classImage.setImageResource(R.drawable.barbarian);
                        break;
                    case 1:
                        classImage.setImageResource(R.drawable.bard);
                        break;
                    case 2:
                        classImage.setImageResource(R.drawable.cleric);
                        break;
                    case 3:
                        classImage.setImageResource(R.drawable.druid);
                        break;
                    case 4:
                        classImage.setImageResource(R.drawable.fighter);
                        break;
                    case 5:
                        classImage.setImageResource(R.drawable.monk);
                        break;
                    case 6:
                        classImage.setImageResource(R.drawable.paladin);
                        break;
                    case 7:
                        classImage.setImageResource(R.drawable.ranger);
                        break;
                    case 8:
                        classImage.setImageResource(R.drawable.rogue);
                        break;
                    case 9:
                        classImage.setImageResource(R.drawable.sorcerer);
                        break;
                    case 10:
                        classImage.setImageResource(R.drawable.warlock);
                        break;
                    case 11:
                        classImage.setImageResource(R.drawable.wizard);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                positionid = 1;
            }
        });

    }
}