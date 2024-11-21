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
        int sum = 0;
    
        for (int i = 0; i < rooms.length; i++) {
            String room = rooms[i];
            int dash = room.lastIndexOf("-");
            int open = room.indexOf("[");
            int close = room.indexOf("]");
    
            String name = room.substring(0, dash).replace("-", "");
            int id = Integer.parseInt(room.substring(dash + 1, open));
            String check = room.substring(open + 1, close);
    
            // count freq
            int[] freq = new int[26];
            for (int j = 0; j < name.length(); j++) {
                char ch = name.charAt(j);
                freq[ch - 'a']++;
            }
    
            // put into array
            char[] letters = new char[26];
            for (int j = 0; j < 26; j++) {
                letters[j] = (char) ('a' + j);
            }
    
            // sort
            for (int j = 0; j < 25; j++) {
                for (int k = j + 1; k < 26; k++) {
                    if (freq[letters[j] - 'a'] < freq[letters[k] - 'a'] ||
                        (freq[letters[j] - 'a'] == freq[letters[k] - 'a'] && letters[j] > letters[k])) {
                        char temp = letters[j];
                        letters[j] = letters[k];
                        letters[k] = temp;
                    }
                }
            }
    
            String calc = "";
            for (int j = 0; j < 5; j++) {
                calc = calc + letters[j];
            }
    
            if (calc.equals(check)) {
                sum = sum + id;
            }
        }
    
        return sum;
    }
    
    public static void main(String[] args) {
        String fileName = "input.txt";
        String[] outAry = getInput(fileName);
        int sum = getSum(outAry);
        System.out.println(sum);
    }
}
