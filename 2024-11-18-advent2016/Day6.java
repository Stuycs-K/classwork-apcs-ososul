import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day6 {
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

    public static String message(String[] m){
        if (m.length == 0) {
            return "";
        }

        int length = m[0].length();
        String result = "";

        // make array of the freqs
        for (int i = 0; i < length; i++) {
            int[] freq = new int[26]; 

            for (int j = 0; j < m.length; j++) {
                char ch = m[j].charAt(i);
                freq[ch - 'a']++;
            }

            int maxFreq = 0;
            char mostCommon = ' ';
            for (int k = 0; k < 26; k++) {
                if (freq[k] > maxFreq) {
                    maxFreq = freq[k];
                    mostCommon = (char) (k + 'a');
                }
            }

            result = result + mostCommon;
        }

        return result;
    }
    


    public static void main(String[] args) {
        String fileName = "input.txt";
        String[] outAry = getInput(fileName);
        String answer = message(outAry);
        System.out.println(answer);
    }
}
