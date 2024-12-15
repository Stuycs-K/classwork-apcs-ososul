public class Driver {
    public static void main(String[] args) {
        Adventurer wizard1 = new Wizard("Jimmy");
        Adventurer wizard2 = new Wizard("Gary");

        System.out.println(wizard1.attack(wizard2));
        System.out.println(wizard2.getName() + " has " + wizard2.getHP() + " HP remaining.");

        System.out.println(wizard1.support(wizard2));
        System.out.println(wizard2.getName() + " has " + wizard2.getHP() + " HP.");

        System.out.println(wizard1.support());
        System.out.println(wizard1.getName() + " has " + wizard1.getHP() + " HP.");

        System.out.println(wizard1.specialAttack(wizard2));
        System.out.println(wizard2.getName() + " has " + wizard2.getHP() + " HP.");

        System.out.println(wizard1.specialAttack(wizard2));
        System.out.println(wizard1.getName() + " has " + ((Wizard) wizard1).getSpecial() + " Energy.");
    }
}

