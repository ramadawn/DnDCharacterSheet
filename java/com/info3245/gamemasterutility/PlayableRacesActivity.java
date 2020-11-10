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

public class PlayableRacesActivity extends AppCompatActivity {

    int positionid;
    String[] namelist = {"Dragonborn","Dwarf","Elf","Genasi","Goblin","Hobgoblin","Human","Tiefling","Tortle","Warforged"};
    String[] descriptionlist = {"Dragonborn look very much like dragons standing erect in humanoid form, though they lack wings or a tail.",
            "Bold and hardy, dwarves are known as skilled warriors, miners, and workers of stone and metal.",
            "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it.",
            "Genasi carry the power of the elemental planes of air, earth, fire, and water in the blood.",
            "Goblins occupy an uneasy place in a dangerous world, and they react by lashing out at any creatures they believe they can bully.",
            "War is lifeblood of hobgoblins. Its glories are the dreams that inspire them. Its horrors don’t feature in their nightmares.",
            "Humans are the most adaptable and ambitious people among the common races. Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds.",
            "To be greeted with stares and whispers, to suffer violence and insult on the street, to see mistrust and fear in every eye: this is the lot of the tiefling.",
            "What many tortles consider a simple life, others might call a life of adventure. They are nomad survivalists eager to explore the wilderness.",
            "Warforged are made from wood and metal, but they can feel pain and emotion. Built as weapons, they must now find a purpose beyond war."};
    String[] racialList = {"+2 Strength, +1 Charisma, Draconic Ancestry, Breath Weapon, Damage Resistance",
            "+2 Constitution, Darkvision, Dwarven Resilience, Dwarven Combat Training, Stonecutting",
            "+2 Dexterity, Darkvision, Keen Senses, Fey Ancestry, Trance",
            "+2 Constitution, Air, Earth, Fire, Water Subraces",
            "+2 Dexterity, +1 Constitution, Darkvision, Fury of the Small, Nimble Escape",
            "+2 Constitution, +1 Intelligence, Darkvision, Martial Training, Saving Face",
            "+1 to All Ability Scores, Extra Language",
            "+2 Charisma, +1 Intelligence, Darkvision, Hellish Resistance, Infernal Legacy",
            "+2 Strength, +1 Wisdom, Claws, Hold Breath, Natural Armor, Shell Defense, Survival Instinct",
            "+2 Constitution, +1 to One Other Ability Score, Constructed Resilience, Sentry’s Rest, Integrated Protection, Specialized Design"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playable_races);

        final Spinner speciesChoice = (Spinner) findViewById(R.id.speciesSpinner);

        TextView speciesName = (TextView) findViewById(R.id.speciesName);
        TextView speciesDescription = (TextView) findViewById(R.id.speciesDescription);
        TextView racialTrait = (TextView) findViewById(R.id.racialTraits);
        ImageView speciesImage = (ImageView) findViewById(R.id.speciesImage);

        //Back Button to Codex
        Button backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayableRacesActivity.this,CodexActivity.class));
            }
        });

        //Change data for each Species
        speciesChoice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                positionid = speciesChoice.getSelectedItemPosition();
                speciesName.setText(namelist[positionid]);
                speciesDescription.setText(descriptionlist[positionid]);
                racialTrait.setText(racialList[positionid]);
                switch(positionid) {
                    case 0:
                        speciesImage.setImageResource(R.drawable.dragonborn);
                        break;
                    case 1:
                        speciesImage.setImageResource(R.drawable.dwarf);
                        break;
                    case 2:
                        speciesImage.setImageResource(R.drawable.elf);
                        break;
                    case 3:
                        speciesImage.setImageResource(R.drawable.genasi);
                        break;
                    case 4:
                        speciesImage.setImageResource(R.drawable.goblin);
                        break;
                    case 5:
                        speciesImage.setImageResource(R.drawable.hobgoblin);
                        break;
                    case 6:
                        speciesImage.setImageResource(R.drawable.human);
                        break;
                    case 7:
                        speciesImage.setImageResource(R.drawable.tiefling);
                        break;
                    case 8:
                        speciesImage.setImageResource(R.drawable.tortle);
                        break;
                    case 9:
                        speciesImage.setImageResource(R.drawable.warforged);
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
