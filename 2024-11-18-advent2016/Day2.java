import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
    
     public static String[] getInput(String fileName) {
        String[] output = new String[0];
        try {
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
            String total = "";
            while (scan.hasNextLine()) {
                String line  = scan.nextLine();
                total = total + line + "\n";
            }
            output = total.split("\n");
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        return output;
    }

    public static String findBathroomCode(String[] instructions) {
        int[][] keypad = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = 1; // Starting at 5
        int col = 1;
        String code = "";

        for (int i = 0; i < instructions.length; i++) {
            String line = instructions[i];
            for (int j = 0; j < line.length(); j++) {
                char move = line.charAt(j);

                if (move == 'U') {
                    if (row > 0) {
                        row = row - 1;
                    }
                } else if (move == 'D') {
                    if (row < 2) {
                        row = row + 1;
                    }
                } else if (move == 'L') {
                    if (col > 0) {
                        col = col - 1;
                    }
                } else if (move == 'R') {
                    if (col < 2) {
                        col = col + 1;
                    }
                }
            }
            int number = keypad[row][col];
            code = code + number;
        }

        return code;
    }

    public static void main(String[] args) {
        String name = "input.txt";
        String [] out = getInput(name);
        String result = findBathroomCode(out);
        System.out.println(result);
    }
}
