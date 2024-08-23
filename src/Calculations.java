import java.util.Random;

public class Calculations {
    private static final Random random = new Random();

    // Removed initiative roll from within each round's calculations
    // This should be handled externally, only once before combat starts

    public static int rollInitiative(Combatant combatant) {
        int roll = 1 + random.nextInt(10); // Roll a 10-sided die
        return combatant.getInitiative() + roll;
    }

    public static int calculateBaseAttackPool(Combatant attacker) {
        // Base attack pool calculation now only adds 3 to strength and brawl
        return 3 + attacker.getStrength() + attacker.getBrawl();
    }

    public static int performAttackDetailed(Combatant attacker, Combatant defender) {
        int baseAttackPool = calculateBaseAttackPool(attacker);
        int finalAttackPool = baseAttackPool - defender.getDefense();
        System.out.println(attacker.getName() + " has a base attack pool of " + baseAttackPool);

        // Handling chance die scenario
        if (finalAttackPool <= 0) {
            System.out.println("Using a chance die due to defense superiority.");
            return rollChanceDie();
        }

        // Regular attack scenario
        return performRegularAttack(finalAttackPool);
    }

    private static int rollChanceDie() {
        int roll = 1 + random.nextInt(10);
        System.out.println("Chance die roll: " + roll);
        // Success only on a 10, explicitly without critical reroll opportunity
        return roll == 10 ? 1 : 0;
    }

    private static int performRegularAttack(int attackPool) {
        int successes = 0;
        for (int i = 0; i < attackPool; i++) {
            int roll = 1 + random.nextInt(10);
            if (roll == 10) {
                // Handle critical hit with potential for additional success
                successes += handleCriticalHit();
            } else if (roll >= 8) {
                successes++;
            }
        }
        return successes;
    }

    private static int handleCriticalHit() {
        int successes = 1; // Initial success for the critical hit
        int reroll = 1 + random.nextInt(10);
        System.out.println("Critical hit reroll: " + reroll);
        if (reroll >= 8) {
            successes++;
        }
        return successes;
    }
}
