import java.util.Random;

public class ColorDemo {
    public static void main(String[] args) {
        
        System.out.print("\u001b[2J\u001b[H");

        System.out.print("\u001b[31mRed hello ");
        System.out.print("\u001b[32mGreen hello ");
        System.out.print("\u001b[34mBlue hello ");
        System.out.println("\u001b[33mYellow hello");

        for (int row = 0; row < 35; row++) {
            if (row % 2 == 0) {
                System.out.print("\u001b[41m");
            } else {
                System.out.print("\u001b[44m");
            }
            for (int col = 0; col < 100; col++) {
                System.out.print("  ");
            }
            System.out.println("\u001b[0m");
        }

        Random rand = new Random();

        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 40; col++) {
                int color = 41 + rand.nextInt(6); 
                System.out.print("\u001b[" + color + "m  ");
            }
            System.out.println("\u001b[0m"); 
        }

        System.out.print("\u001b[0m");
    }
}
