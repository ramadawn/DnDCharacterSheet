import java.util.Random;

public class Battle {
    
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
    public int damageTaken(String aWeapon, int aHealth) {

        //Calculate attack die roll
        int attackDie = getAttackDie(aWeapon);
        int attackRoll = new Random().nextInt(attackDie+1);

        //Return new health
        return aHealth - attackRoll;

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
