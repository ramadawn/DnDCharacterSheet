import java.util.Random;

public class Battle {

    int damageDealt;

    //AC method to determine if attacks hit
    public boolean attackHit(String aAC) {

        int AC = Integer.parseInt(aAC);
        int hitDie = new Random().nextInt(20+1);
        boolean hitBoolean;

        if (hitDie >= AC) {
            hitBoolean = true;
        } else {
            hitBoolean = false;
        }
        return hitBoolean;

    }

    //Damage method for calculating damage taken
    public String battleNumbers(CharacterSheet offense, CharacterSheet defense) {

        //Call AC method to determine if attack hits
        boolean attackAccuracy = this.attackHit(defense.getArmour());

        //If statement for if the attack hits or not.
        if (attackAccuracy = false) {
            //Attack misses, no damage dealt
            this.damageDealt = 0;
        } else if (attackAccuracy = true) {
            //Attack hits, calculate damage
            int attackDie = getAttackDie(offense.getWeapon1());
            this.damageDealt = new Random().nextInt(attackDie+1);
            defense.setCurrentHP(defense.getCurrentHPInt() - damageDealt);
            if (defense.getCurrentHPInt() < 0) {
                defense.setCurrentHP(0);
            }
        }

        String results;
        //Create String for displaying result
        if(defense.getCurrentHPInt() >= 0) {
            results = offense.getName() + "has dealt " + this.damageDealt + " damage. " + defense.getName() + "has " + defense.getCurrentHPInt() + " health remaining.";
        } else {
            results = offense.getName() + "has dealt " + this.damageDealt + " damage. " + defense.getName() + "has " + defense.getCurrentHPInt() + " health remaining. "
                    + defense.getName() + " has been defeated.";
        }
        return results;
    }

    //Method for finding weapon attack die
    public int getAttackDie(String aName) {
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
            default:
                throw new IllegalStateException("Unexpected value: " + aName);
        }
    }

}
