import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        int width = 80;
        int height = 30;


        drawBorder(width, height); // Border
        int[] randomNumbers = generateRand(); // Random 
        displayRand(randomNumbers, width); // Display 
        drawSeparator(3, width); //  separator
        drawCenter(width, height); // Center 

        Text.go(31, 1);
        System.out.println(Text.RESET);
    }

    private static void drawBorder(int width, int height) {
        for (int col = 1; col <= width; col++) { // Top 
            Text.go(1, col);
            Text.color(Text.BRIGHT, Text.RED);
            System.out.print("#");
        }
        for (int col = 1; col <= width; col++) { // Bottom 
            Text.go(height, col);
            System.out.print("#");
        }
        for (int row = 2; row < height; row++) { // Left 
            Text.go(row, 1);
            Text.color(Text.BRIGHT, Text.BLUE);
            System.out.print("#");
        }
        for (int row = 2; row < height; row++) { // Right 
            Text.go(row, width);
            System.out.print("#");
        }
    }

    private static int[] generateRand() {
        Random rand = new Random();
        int[] randomNumbers = new int[3];
        randomNumbers[0] = rand.nextInt(100);
        randomNumbers[1] = rand.nextInt(100);
        randomNumbers[2] = rand.nextInt(100);
        return randomNumbers;
    }

    private static void displayRand(int[] numbers, int width) {
        int spacing = width / 4;
        for (int i = 0; i < 3; i++) {
            int col = (i + 1) * spacing;
            Text.go(2, col);
            if (numbers[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (numbers[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.BRIGHT, Text.WHITE);
            }
            System.out.print(numbers[i]);
        }
    }

    private static void drawSeparator(int row, int width) {
        Text.go(3, 1);
        Text.color(Text.BRIGHT, Text.YELLOW);
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
    }

    private static void drawCenter(int width, int height) {
        int centerX = width / 2;
        int centerY = height / 2;
        Text.go(centerY, centerX - 10); // Adjusted for length
        Text.color(Text.BRIGHT, Text.MAGENTA);
        System.out.print("Hello this is the center :>");
    }
}
