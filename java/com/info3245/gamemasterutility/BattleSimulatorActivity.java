package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class BattleSimulatorActivity extends AppCompatActivity {

    //Create test combatants
    CharacterSheet testCombatant = new CharacterSheet();
    CharacterSheet Jorge = new CharacterSheet();
    CharacterSheet Drax = new CharacterSheet();
    CharacterSheet Rem = new CharacterSheet();
    CharacterSheet testEnemy = new CharacterSheet();
    CharacterSheet skeleton = new CharacterSheet();
    CharacterSheet slime = new CharacterSheet();
    CharacterSheet tarrasque = new CharacterSheet();
    CharacterSheet  Flumph, Goblin, Owlbear, Ogre, Beholder;

    String result = "";
    int round = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_simulator);
        //initialize combatant spinner
        Spinner combatantSpinner = findViewById(R.id.combatantSpinner);
        //initialize the monster spinner
        Spinner monsterSpinner = findViewById(R.id.monsterSpinner);
        //set up array adapter with custom layout(Put this after the real character array once that is implemented)
        ArrayAdapter<String> combatantAdapter = new ArrayAdapter<>(this, R.layout.custom_spinner,getResources().getStringArray(R.array.battlesimcharacterspinnerdemo));
        combatantAdapter.setDropDownViewResource(R.layout.customer_spinner_dropdown);
        combatantSpinner.setAdapter(combatantAdapter);
        //same for monster spinner
        ArrayAdapter<String> monsterAdapter = new ArrayAdapter<>(this, R.layout.custom_spinner,getResources().getStringArray(R.array.battlesimmonsterspinnerdemo));
        monsterAdapter.setDropDownViewResource(R.layout.customer_spinner_dropdown);
        monsterSpinner.setAdapter(monsterAdapter);

        //set values for dummy characters/monsters

        Jorge.setName("Jorge");
        Jorge.setAC(10);
        Jorge.setMaxHP(100);
        Jorge.fullHealth();
        Jorge.setWeapon1("Sword");

        Drax.setName("Drax");
        Drax.setAC(4);
        Drax.setMaxHP(70);
        Drax.fullHealth();
        Drax.setWeapon1("Spear");

        Rem.setName("Rem");
        Rem.setAC(3);
        Rem.setMaxHP(50);
        Rem.fullHealth();
        Rem.setWeapon1("Bow");
		
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


        combatantSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //get selected character somehow. For now we're using a switch
                String selectedItem = combatantSpinner.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Loading character: " + selectedItem, Toast.LENGTH_LONG).show();
                switch(selectedItem) {
//                    How do we make a dynamic spinner?
                    case "Jorge":
                        testCombatant.setName(Jorge.getName());
                        testCombatant.setAC(Jorge.getACString());
                        testCombatant.setMaxHP(Jorge.getMaxHPStr());
                        testCombatant.fullHealth();
                        testCombatant.setWeapon1(Jorge.getWeapon1());
                        break;
                    case "Drax":
                        testCombatant.setName(Drax.getName());
                        testCombatant.setAC(Drax.getACString());
                        testCombatant.setMaxHP(Drax.getMaxHPStr());
                        testCombatant.fullHealth();
                        testCombatant.setWeapon1(Drax.getWeapon1());
                        break;
                    case "Rem":
                        testCombatant.setName(Rem.getName());
                        testCombatant.setAC(Rem.getACString());
                        testCombatant.setMaxHP(Rem.getMaxHPStr());
                        testCombatant.fullHealth();
                        testCombatant.setWeapon1(Rem.getWeapon1());
                        break;
                }
                round = 1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        monsterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //get selected monster somehow. For now we're using a switch
                String selectedItem = monsterSpinner.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Loading monster: " + selectedItem, Toast.LENGTH_LONG).show();
                switch(selectedItem) {
                    case "Skeleton":
                        testEnemy.setName(skeleton.getName());
                        testEnemy.setAC(skeleton.getACString());
                        testEnemy.setMaxHP(skeleton.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(skeleton.getWeapon1());
                        break;
                    case "Slime":
                        testEnemy.setName(slime.getName());
                        testEnemy.setAC(slime.getACString());
                        testEnemy.setMaxHP(slime.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(slime.getWeapon1());
                        break;
                    case "Tarrasque":
                        testEnemy.setName(tarrasque.getName());
                        testEnemy.setAC(tarrasque.getACString());
                        testEnemy.setMaxHP(tarrasque.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(tarrasque.getWeapon1());
                        break;
                }
                round = 1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public void takeTurn(View view) {
        TextView resultDisplay = (TextView) findViewById(R.id.resultText);
        result = Battle.battleNumbers(testCombatant, testEnemy);
        resultDisplay.append("Round " + round + ":\n" + result + "\n");
        result = Battle.battleNumbers(testEnemy, testCombatant);
        resultDisplay.append(result + "\n");
        round++;
    }
}