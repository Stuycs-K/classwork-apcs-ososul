import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

  public static String [] toArray (String filename){
    try {
        Scanner sc = new Scanner(new File(filename));
        String [] output = sc.split(", ");
        return output;

        }
        sc.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error: File not found");
    }
  }

  public static 


  public static void main(String[] args) {
    String file = "input.txt";
    String [] dataArray = toArray(file);

  }
}
