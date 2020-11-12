import java.util.Random;

public class Battle {

    private int attackValue = Integer.parseInt("0");
    private int ogHealthValue = Integer.parseInt("0");
    private int newHealthValue = Integer.parseInt("0");

    public int damageTaken( String aWeapon, String aHealth) {
        attackValue = Integer.parseInt(aWeapon);
        ogHealthValue = Integer.parseInt(aHealth);

        int attackDie = new Random().nextInt(attackValue+1);

        newHealthValue = ogHealthValue - attackDie;

        return this.newHealthValue;

    }

}
