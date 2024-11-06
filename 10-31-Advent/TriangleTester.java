import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
    
    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Part A
    public static int countTrianglesA(String filename) {
        int count = 0;

        try {
            Scanner sc = new Scanner(new File(filename));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] sides = line.split(" ");
                int side1 = Integer.parseInt(sides[0]);
                int side2 = Integer.parseInt(sides[1]);
                int side3 = Integer.parseInt(sides[2]);

                // Check if valid triangle
                if (isValidTriangle(side1, side2, side3)) {
                    count++;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }

        return count;
    }

    // Counts valid triangles by reading columns of data grouped in sets of three rows
    public static int countTrianglesB(String filename) {
        int count = 0;

        try {
            Scanner sc = new Scanner(new File(filename));
            String[][] rows = new String[3][]; // Array to store 

            while (sc.hasNextLine()) {
                for (int i = 0; i < 3; i++) {
                    if (sc.hasNextLine()) {
                        rows[i] = sc.nextLine().split(" "); 
                    }
                }

                for (int col = 0; col < 3; col++) {
                    int side1 = Integer.parseInt(rows[0][col]);
                    int side2 = Integer.parseInt(rows[1][col]);
                    int side3 = Integer.parseInt(rows[2][col]);
                    if (isValidTriangle(side1, side2, side3)) {
                        count++;
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }

        return count;
    }


}