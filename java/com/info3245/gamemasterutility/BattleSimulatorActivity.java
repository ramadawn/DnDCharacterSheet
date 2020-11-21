package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DamageCalculatorActivity extends AppCompatActivity {
    
    //Create Monsters for the Battle Simulation
    CharacterSheet  Flumph, Goblin, Owlbear, Ogre, Beholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_damage_calculator);
        
        //Set Flumph Variables
        Flumph.setName("Flumph");
        Flumph.setMaxHP(10);
        Flumph.setAC(12);
        Flumph.setWeapon1("FlumphAttack");
        //add the following to the getAttackDie method in the Battle Class
        //case "FlumphAttack":
        //return 4;
        Flumph.setAttributes("6","15","10","14","14","11");
        Flumph.setSkills("0","0","0","0","4","4","0","0","4",
                "0","0","0","0","0","0","0","0","0");

        //Set Goblin Variables
        Goblin.setName("Goblin");
        Goblin.setMaxHP(12);
        Goblin.setAC(15);
        Goblin.setWeapon1("GoblinAttack");
        //add the following to the getAttackDie method in the Battle Class
        //case "GoblinAttack":
        //return 8;
        Goblin.setAttributes("8","14","10","10","8","8");
        Goblin.setSkills("0","0","0","6","0","0","0","0","0",
                "0","0","0","0","0","0","0","0","0");

        //Set Owlbear Variables
        Owlbear.setName("Owlbear");
        Owlbear.setMaxHP(30);
        Owlbear.setAC(13);
        Owlbear.setWeapon1("OwlbearAttack");
        //add the following to the getAttackDie method in the Battle Class
        //case "OwlbearAttack":
        //return 12;
        Owlbear.setAttributes("20","12","17","3","12","7");
        Owlbear.setSkills("0","0","0","0","0","0","0","0","0",
                "0","0","0","3","0","0","0","0","0");

        //Set Ogre Variables
        Ogre.setName("Ogre");
        Ogre.setMaxHP(60);
        Ogre.setAC(15);
        Ogre.setWeapon1("OgreAttack");
        //add the following to the getAttackDie method in the Battle Class
        //case "OgreAttack":
        //return 12;
        Ogre.setAttributes("19","8","16","5","7","7");
        Ogre.setSkills("0","0","0","0","0","0","0","0","0",
                "0","0","0","0","0","0","0","0","0");

        //Set Beholder Variables
        Beholder.setName("Beholder");
        Beholder.setMaxHP(90);
        Beholder.setAC(18);
        Beholder.setWeapon1("BeholderAttack");
        //add the following to the getAttackDie method in the Battle Class
        //case "BeholderAttack":
        //return 12;
        Beholder.setAttributes("10","14","18","17","15","17");
        Beholder.setSkills("0","0","0","0","0","0","0","0","0",
                "0","0","0","12","0","0","0","0","0");

        
        
    }
}
