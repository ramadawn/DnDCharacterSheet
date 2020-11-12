import java.util.Random;

public class Battle {

    private int attackValue = Integer.parseInt("0");
    private int ogHealthValue = Integer.parseInt("0");
    private int newHealthValue = Integer.parseInt("0");

    public int damageTaken( String aWeapon, String aHealth) {
        
        //Get attack and health
        attackValue = Integer.parseInt(aWeapon);
        ogHealthValue = Integer.parseInt(aHealth);

        //Calculate attack die roll
        int attackDie = new Random().nextInt(attackValue+1);

        //Calculate remaining health
        newHealthValue = ogHealthValue - attackDie;

        //Return new health
        return this.newHealthValue;

    }

}
