package com.info3245.gamemasterutility;

import java.util.Random;

public class Battle {


    //AC method to determine if attacks hit
    public static boolean attackHit(int aAC) {

        int hitDie = new Random().nextInt(20+1);
        boolean hitBoolean;

        if (hitDie >= aAC) {
            hitBoolean = true;
        } else {
            hitBoolean = false;
        }
        return hitBoolean;
        
    }
    
    //HP Check method to determine if enemy has HP remaining
    public static boolean enemyHPcheck(int hp) {
        boolean hpBoolean;
        if (hp > 0) {
            hpBoolean = true;
        } else {
            hpBoolean = false;
        }
        return hpBoolean;
    }

    //Damage method for calculating damage taken
    public static String battleNumbers(CharacterSheet offense, CharacterSheet defense) {

        int damageDealt;

        //Call AC method to determine if attack hits
        boolean attackAccuracy = attackHit(defense.getACInt());

        //If statement for if the attack hits or not.
        if (!attackAccuracy) {
            //Attack misses, no damage dealt
            damageDealt = 0;
        } else {
            //Attack hits, calculate damage
            int attackDie = getAttackDie(offense.getWeapon1());
            damageDealt = new Random().nextInt(attackDie+1);
            defense.setCurrentHP(defense.getCurrentHPInt() - damageDealt);
            if (defense.getCurrentHPInt() < 0) {
                defense.setCurrentHP(0);
            }
        }

        String results;
        //Create String for displaying result
        if(defense.getCurrentHPInt() > 0) {
            results = offense.getName() + " has dealt " + damageDealt + " damage. " + defense.getName() + " has " + defense.getCurrentHPInt() + " health remaining.";
        } else {
            results = offense.getName() + " has dealt " + damageDealt + " damage. " + defense.getName() + " has " + defense.getCurrentHPInt() + " health remaining. "
                    + defense.getName() + " has been defeated.";
        }
        return results;
    }

    //Method for finding weapon attack die
    public static int getAttackDie(String aName) {
        switch(aName){
            case "Sword":
                return 8;
            case "Dagger":
                return 4;
            case "Bow":
                return 6;
            case "Halberd":
                return 10;
            case "Lance":
                return 10;
            case "Axe":
                return 6;
            case "Monster Claws":
                return 3;
            case "Monster Breath":
                return 6;
            case "Monster Stomp":
                return 9;
            case "Tarrasque Claw":
                return 28;
            case "FlumphAttack":
                return 4;
            case "GoblinAttack":
                return 8;
            case "OwlbearAttack":
                return 12;
            case "OgreAttack":
                return 12;
            case "BeholderAttack":
                return 12;
            default:
                throw new IllegalStateException("Unexpected value: " + aName);
        }
    }
}
