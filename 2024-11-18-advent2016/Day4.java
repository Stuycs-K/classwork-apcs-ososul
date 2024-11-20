import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day4 {

    public static String[] getInput(String fileName) {
        String[] output = new String[0];
        try {
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
            String total = "";
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                total = total + line + "\n";
            }
            output = total.split("\n");
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        return output;
    }
    
    public static int getSum(String[] rooms) {

        return 0;
    }


    public static void main(String[] args) {
        String fileName = "input.txt";
        String[] outAry = getInput(fileName);
        int sum = getSum(outAry);
        System.out.println(sum);
    }
}
