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
        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error: File not found");
    }
    return output;
}

}

  public static 


  public static void main (String[] args) {
    String file = "input.txt";
    String [] dataArray = toArray(file);

  }
}
