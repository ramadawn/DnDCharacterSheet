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
    CharacterSheet  Flumph = new CharacterSheet();
    CharacterSheet Goblin = new CharacterSheet();
    CharacterSheet Owlbear = new CharacterSheet();
    CharacterSheet Ogre = new CharacterSheet();
    CharacterSheet Beholder = new CharacterSheet();

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
        ArrayAdapter<String> combatantAdapter = new ArrayAdapter<>(this, R.layout.custom_spinner,getResources().getStringArray(R.array.battlesimcharacterspinnerDEMO));
        combatantAdapter.setDropDownViewResource(R.layout.customer_spinner_dropdown);
        combatantSpinner.setAdapter(combatantAdapter);
        //same for monster spinner
        ArrayAdapter<String> monsterAdapter = new ArrayAdapter<>(this, R.layout.custom_spinner,getResources().getStringArray(R.array.battlesimmonsterspinner));
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
        Drax.setWeapon1("Lance");

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
        Flumph.setAttributes("6","15","10","14","14","11");
        Flumph.setSkills("0","0","0","0","4","4","0","0","4",
                "0","0","0","0","0","0","0","0","0");

        //Set Goblin Variables
        Goblin.setName("Goblin");
        Goblin.setMaxHP(12);
        Goblin.setAC(15);
        Goblin.setWeapon1("GoblinAttack");
        Goblin.setAttributes("8","14","10","10","8","8");
        Goblin.setSkills("0","0","0","6","0","0","0","0","0",
                "0","0","0","0","0","0","0","0","0");

        //Set Owlbear Variables
        Owlbear.setName("Owlbear");
        Owlbear.setMaxHP(30);
        Owlbear.setAC(13);
        Owlbear.setWeapon1("OwlbearAttack");
        Owlbear.setAttributes("20","12","17","3","12","7");
        Owlbear.setSkills("0","0","0","0","0","0","0","0","0",
                "0","0","0","3","0","0","0","0","0");

        //Set Ogre Variables
        Ogre.setName("Ogre");
        Ogre.setMaxHP(60);
        Ogre.setAC(15);
        Ogre.setWeapon1("OgreAttack");
        Ogre.setAttributes("19","8","16","5","7","7");
        Ogre.setSkills("0","0","0","0","0","0","0","0","0",
                "0","0","0","0","0","0","0","0","0");

        //Set Beholder Variables
        Beholder.setName("Beholder");
        Beholder.setMaxHP(90);
        Beholder.setAC(18);
        Beholder.setWeapon1("BeholderAttack");
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
                    //this will have to dynamically change with the retrieved character list
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
                    case "Flumph":
                        testEnemy.setName(Flumph.getName());
                        testEnemy.setAC(Flumph.getACString());
                        testEnemy.setMaxHP(Flumph.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(Flumph.getWeapon1());
                        break;
                    case "Goblin":
                        testEnemy.setName(Goblin.getName());
                        testEnemy.setAC(Goblin.getACString());
                        testEnemy.setMaxHP(Goblin.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(Goblin.getWeapon1());
                        break;
                    case "Owlbear":
                        testEnemy.setName(Owlbear.getName());
                        testEnemy.setAC(Owlbear.getACString());
                        testEnemy.setMaxHP(Owlbear.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(Owlbear.getWeapon1());
                        break;
                    case "Ogre":
                        testEnemy.setName(Ogre.getName());
                        testEnemy.setAC(Ogre.getACString());
                        testEnemy.setMaxHP(Ogre.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(Ogre.getWeapon1());
                        break;
                    case "Beholder":
                        testEnemy.setName(Beholder.getName());
                        testEnemy.setAC(Beholder.getACString());
                        testEnemy.setMaxHP(Beholder.getMaxHPStr());
                        testEnemy.fullHealth();
                        testEnemy.setWeapon1(Beholder.getWeapon1());
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

        boolean combatantHpCheck = Battle.enemyHPcheck(testCombatant.getCurrentHPInt());
        boolean enemyHpCheck = Battle.enemyHPcheck(testEnemy.getCurrentHPInt());
        if (combatantHpCheck) {
            if (enemyHpCheck) {
                result = Battle.battleNumbers(testCombatant, testEnemy);
            } else {
                result = "Enemy Already Defeated. Change Monster.";
            }
        } else {
            result = "Player Defeated. Change Character.";
        }
        resultDisplay.append("Round " + round + ":\n" + result + "\n");

        boolean combatantHpCheck2 = Battle.enemyHPcheck(testCombatant.getCurrentHPInt());
        boolean enemyHpCheck2 = Battle.enemyHPcheck(testEnemy.getCurrentHPInt());
        if (enemyHpCheck2) {
            if (combatantHpCheck2) {
                result = Battle.battleNumbers(testEnemy, testCombatant);
            } else {
                result = "Player Defeated. Change Character.";
            }
        } else {
            result = "Enemy Already Defeated. Change Monster.";
        }
        resultDisplay.append(result + "\n");

        round++;
    }
	
    public void healCharacterAction(View view) {
        Button cHealButton = (Button) findViewById(R.id.healCharacterButton);
        testCombatant.Heal(testCombatant.getMaxHPInt());
    }

    public void healEnemyAction(View view) {
        Button eHealButton = (Button) findViewById(R.id.healCharacterButton);
        testEnemy.Heal(testEnemy.getMaxHPInt());
    }
	
}
