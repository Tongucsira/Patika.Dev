public class Combatant {
    private String name; // Unique identifier for each combatant
    private int strength;
    private int dexterity;
    private int stamina;
    private int brawl;
    private int athletics;
    private int maxHealth;
    private int currentHealth;

    // Constructor
    public Combatant(String name, int strength, int dexterity, int stamina, int brawl, int athletics) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.stamina = stamina;
        this.brawl = brawl;
        this.athletics = athletics;
        // Calculate max health based on stamina
        this.maxHealth = 5 + stamina;
        this.currentHealth = this.maxHealth; // Initial health is max health
    }

    // Getter methods for attributes and skills
    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStamina() {
        return stamina;
    }

    public int getBrawl() {
        return brawl;
    }

    public int getAthletics() {
        return athletics;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    // Calculated properties
    public int getHealth() {
        return currentHealth;
    }

    public int getDefense() {
        return dexterity + athletics;
    }

    public int getInitiative() {
        return dexterity + 3;
    }

    public int getAttack() {
        return strength + brawl;
    }

    // Method to apply damage to the combatant
    public void takeDamage(int damage) {
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0; // Prevent health from going below 0
        }
    }

    // Method to check if the combatant is still standing
    public boolean isStanding() {
        return this.currentHealth > 0;
    }

    @Override
    public String toString() {
        return name + " - Health: " + getCurrentHealth() + "/" + getMaxHealth();
    }
}
