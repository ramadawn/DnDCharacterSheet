import java.util.Random;

public class Battle {

    int damageDealt;
    int healthLeft;

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
            this.healthLeft = defense.getCurrentHPInt();
        } else if (attackAccuracy = true) {
            //Attack hits, calculate damage
            int attackDie = getAttackDie(offense.getWeapon1());
            this.damageDealt = new Random().nextInt(attackDie+1);
            this.healthLeft = defense.getCurrentHPInt() - damageDealt;
            if (this.healthLeft < 0) {
                this.healthLeft = 0;
            }
        }

        //Create String for displaying result
        String results = offense.getName() + "has dealt " + this.damageDealt + " damage. " + defense.getName() + "has " + healthLeft + " health remaining.";
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
