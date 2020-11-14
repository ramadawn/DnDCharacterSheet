package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MonsterBestiaryActivity extends AppCompatActivity {

    MediaPlayer beholder, dragon, flumph, gelatinouscube, lich, mindflayer, ogre, owlbear, skeleton, tarrasque;
    int positionid;
    String[] namelist = {"Beholder","Flumph","Gelatinous Cube","Lich","Mind Flayer","Ogre","Owlbear","Red Dragon","Skeleton","Tarrasque"};
    String[] descriptionlist = {"Aggressive, hateful, and greedy, these aberrations dismiss all other creatures as lesser beings, toying with them or destroying them as they choose.",
            "The mysterious beings drift through the Underdark, propelled through the air by the jets whose sound gives them their name. A flumph glows faintly, reflecting its moods in its color. ",
            "The gelatinous cube is endowed with an insatiable hunger. These creatures scour dungeon passages, consuming living tissue while leaving bones and other materials undissolved.",
            "A lich is spawned when a great wizard embraces the evil state of undeath as a means of extending life beyond its mortal limits.",
            "Psionic tyrants, slavers, and interdimensional voyagers, mind flayers are insidious masterminds that harvest entire races for their own twisted ends.",
            "Ogres are hulking giants notorious for their quick tempers. When its rage is incited, an ogre lashes out in a frustrated tantrum until it runs out of objects or creatures to smash.",
            "A monstrous cross between giant owl and bear, an owlbear’s reputation for ferocity and aggression makes it one of the most feared predators of the wild.",
            "True dragons are known and feared for their predatory cunning and their magic, with the oldest dragons accounted as some of the most powerful creatures in the world.",
            "Skeletons were undead animated corpses similar to zombies, but completely devoid of flesh and did not feed on the living.",
            "The Tarrasque is feared by many as a \"destroyer of the world\" due to its destructive tendencies. If there is any good thing about the Tarrasque, it is that there is only one of them in the world."};
    String[] sizelist = {"Large","Small","Large","Medium","Medium","Large","Large","Medium-Gargantuan","Medium","Gargantuan"};
    String[] typelist = {"Aberration","Aberration","Ooze","Undead","Aberration","Giant","Monstrosity","Dragon","Undead","Monstrosity"};
    String[] alignmentlist = {"Lawful Evil","Lawful Good","Unaligned","Lawful, Neutral, or Chaotic Evil","Lawful Evil","Chaotic Evil","Unaligned","Chaotic Evil","Lawful Evil","Unaligned"};
    String[] ratinglist = {"13-14","1/8","2","21","7-8","2","3","4-24","1/4","30"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_bestiary);

        final Spinner bestiaryChoice = (Spinner) findViewById(R.id.bestiarySpinner);

        TextView monsterName = (TextView) findViewById(R.id.monsterName);
        TextView monsterDescription = (TextView) findViewById(R.id.monsterDescription);
        TextView monsterSize = (TextView) findViewById(R.id.monsterSize);
        TextView monsterType = (TextView) findViewById(R.id.monsterType);
        TextView monsterAlignment = (TextView) findViewById(R.id.monsterAlignment);
        TextView monsterRating = (TextView) findViewById(R.id.monsterRating);
        ImageView monsterImage = (ImageView) findViewById(R.id.monsterImage);

        beholder = new MediaPlayer();
        beholder = MediaPlayer.create(this,R.raw.beholder);
        dragon = new MediaPlayer();
        dragon = MediaPlayer.create(this,R.raw.dragon);
        flumph = new MediaPlayer();
        flumph = MediaPlayer.create(this,R.raw.flumph);
        gelatinouscube = new MediaPlayer();
        gelatinouscube = MediaPlayer.create(this,R.raw.gelatinouscube);
        lich = new MediaPlayer();
        lich = MediaPlayer.create(this,R.raw.lich);
        mindflayer = new MediaPlayer();
        mindflayer = MediaPlayer.create(this,R.raw.mindflayer);
        ogre = new MediaPlayer();
        ogre = MediaPlayer.create(this,R.raw.ogre);
        owlbear = new MediaPlayer();
        owlbear = MediaPlayer.create(this,R.raw.owlbear);
        skeleton = new MediaPlayer();
        skeleton = MediaPlayer.create(this,R.raw.skeleton);
        tarrasque = new MediaPlayer();
        tarrasque = MediaPlayer.create(this,R.raw.tarrasque);

        //Sound Button
        ImageButton soundBtn = (ImageButton) findViewById(R.id.soundBtn);
        soundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionid = bestiaryChoice.getSelectedItemPosition();
                switch(positionid){
                    case 0:
                        beholder.start();
                        break;
                    case 1:
                        flumph.start();
                        break;
                    case 2:
                        gelatinouscube.start();
                        break;
                    case 3:
                        lich.start();
                        break;
                    case 4:
                        mindflayer.start();
                        break;
                    case 5:
                        ogre.start();
                        break;
                    case 6:
                        owlbear.start();
                        break;
                    case 7:
                        dragon.start();
                        break;
                    case 8:
                        skeleton.start();
                        break;
                    case 9:
                        tarrasque.start();
                        break;
                }
            }
        });

        //Change data for each Monster
        bestiaryChoice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                positionid = bestiaryChoice.getSelectedItemPosition();
                monsterName.setText(namelist[positionid]);
                monsterDescription.setText(descriptionlist[positionid]);
                monsterSize.setText(sizelist[positionid]);
                monsterType.setText(typelist[positionid]);
                monsterAlignment.setText(alignmentlist[positionid]);
                monsterRating.setText(ratinglist[positionid]);

                //Change Picture
                switch(positionid){
                    case 0:
                        monsterImage.setImageResource(R.drawable.beholder);
                        break;
                    case 1:
                        monsterImage.setImageResource(R.drawable.flumph);
                        break;
                    case 2:
                        monsterImage.setImageResource(R.drawable.gelatinouscube);
                        break;
                    case 3:
                        monsterImage.setImageResource(R.drawable.lich);
                        break;
                    case 4:
                        monsterImage.setImageResource(R.drawable.mindflayer);
                        break;
                    case 5:
                        monsterImage.setImageResource(R.drawable.ogre);
                        break;
                    case 6:
                        monsterImage.setImageResource(R.drawable.owlbear);
                        break;
                    case 7:
                        monsterImage.setImageResource(R.drawable.dragon);
                        break;
                    case 8:
                        monsterImage.setImageResource(R.drawable.skeleton);
                        break;
                    case 9:
                        monsterImage.setImageResource(R.drawable.tarrasque);
                        break;
                }
            }

            //Defaut View
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                positionid = 1;
            }
        });
    }
}
