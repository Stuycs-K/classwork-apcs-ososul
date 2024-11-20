import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
    
     public static String[] getInput(String fileName) {
        String[] lines = new String[0];
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            String allLines = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                allLines = allLines + line + "\n";
            }
            lines = allLines.split("\n");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        return lines;
    }




    public static void main(String[] args) {
        
    }
}
