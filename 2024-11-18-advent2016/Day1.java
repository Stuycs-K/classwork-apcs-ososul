import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

  public static String[] toArray(String filename) {
    String[] output = new String[0];
    try {
        File file = new File(filename);
        Scanner scan = new Scanner(file);
        if (scan.hasNextLine()) {
            String line = scan.nextLine();
            output = line.split(", ");
        }
        scan.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error: File not found");
    }
    return output;
}

public static int distance(String[] data) {
  int[][] directions = new int[4][2];
  directions[0][0] = 0; directions[0][1] = 1; // North
  directions[1][0] = 1; directions[1][1] = 0; // East
  directions[2][0] = 0; directions[2][1] = -1; // South
  directions[3][0] = -1; directions[3][1] = 0; // West

  int x = 0;
  int y = 0;
  int current = 0;

  for (int i = 0; i < data.length; i++) {
      String step = data[i];
      char turn = step.charAt(0);
      int distance = Integer.parseInt(step.substring(1));

      if (turn == 'L') {
          current = (current + 3) % 4;
      } else if (turn == 'R') {
          current = (current + 1) % 4;
      }

      x = x + directions[current][0] * distance;
      y = y + directions[current][1] * distance;
  }

  return Math.abs(x) + Math.abs(y);
} 


  public static void main (String[] args) {
    String file = "input.txt";
    String [] dataArray = toArray(file);
    int x = distance(dataArray);
    System.out.println(x);

  }


}

