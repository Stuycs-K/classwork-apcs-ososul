public class Wizard extends Adventurer {
    private int energy; // Special resource
    private int maxEnergy;

    public Wizard(String name) {
        super(name, 20); // 20 HP
        this.energy = 5; 
        this.maxEnergy = 10; 
    }

    public String getSpecialName() {
        return "Energy";
    }

    public int getSpecial() {
        return energy;
    }

    public void setSpecial(int n) {
        energy = Math.max(0, Math.min(n, maxEnergy)); // energy stays within bounds
    }

    public int getSpecialMax() {
        return maxEnergy;
    }

    public String attack(Adventurer other) {
        other.applyDamage(5); // Deal 5 damage
        return this.getName() + " casts a basic spell at " + other.getName() + " for 5 damage!";
    }

    public String support(Adventurer other) {
        other.setHP(other.getHP() + 5); // Heal 5 HP
        return this.getName() + " uses a healing spell on " + other.getName() + ", restoring 5 HP.";
    }

    public String support() {
        this.setHP(this.getHP() + 5); 
        return this.getName() + " self-heal, restoring 5 HP.";
    }

    public String specialAttack(Adventurer other) {
        if (energy >= 3) {
            energy -= 3; // Consume 3 energy
            other.applyDamage(10); // Deal 10 damage
            return this.getName() + " unleashes a fireball on " + other.getName() + " for 10 damage!";
        } else {
            return this.getName() + " does not have enough Energy for a special attack.";
        }
    }
}
