public class Player {

    private final Weapon weapon;
    private String name;
    private int healthPercentage=70;
    public enum Weapon {SWORD, AXE, BOW, SPEAR};

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        if (healthPercentage >= 0 && healthPercentage <= 100) {
            this.healthPercentage = healthPercentage;
        }else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }
        else {
            this.healthPercentage = 100;
        }

        this.weapon = weapon;

    }

    public void healthRemaining() {
        System.out.println("Remaining health = " + this.healthPercentage);
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage < 0) {
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");
        }
        if (this.healthPercentage > 0) {
            System.out.println(this.name + " has lost " + damage + " health points.");
            healthRemaining();
        }else {
            System.out.println(this.name + " has lost all health points.");
        }

    }

    public void restoreHealth(int healthPotion)
     {
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
        System.out.println(this.name + " has restored " + healthPotion + " health points.");
        healthRemaining();
    }
}
