import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Adventurer player = new Wizard("Dumbledore");
        Adventurer enemy = new CodeWarrior("Prince");

        while (true) {
            // Print status
            System.out.println(player.getName() + ": " + player.getHP() + "/" + player.getmaxHP() + " HP, " +
                    player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
            System.out.println(enemy.getName() + ": " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " +
                    enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());

            // Prompt user
            System.out.println("Type: attack / special / support / quit");
            String input = userInput.nextLine();

            if (input.equals("attack")) {
                System.out.println(player.attack(enemy));
            } else if (input.equals("special")) {
                System.out.println(player.specialAttack(enemy));
            } else if (input.equals("support")) {
                System.out.println(player.support());
            } else if (input.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid input.");
                continue;
            }

            if (enemy.getHP() <= 0) {
                System.out.println(enemy.getName() + " has been defeated! You win!");
                break;
            }

            // Enemy turn
            int choice = (int) (Math.random() * 3);
            if (choice == 0) {
                System.out.println(enemy.attack(player));
            } else if (choice == 1) {
                System.out.println(enemy.specialAttack(player));
            } else {
                System.out.println(enemy.support());
            }

            if (player.getHP() <= 0) {
                System.out.println(player.getName() + " has been defeated! Game over.");
                break;
            }
        }

        System.out.println("Game Over!");
    }
}
