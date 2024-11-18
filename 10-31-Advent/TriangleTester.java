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

            while (sc.hasNextInt()) {
                int side1 = sc.nextInt();
                int side2 = sc.nextInt();
                int side3 = sc.nextInt();

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

        try (Scanner sc = new Scanner(new File(filename))) {
            // Read groups of three lines at a time
            while (sc.hasNextLine()) {
                String[] row1 = sc.nextLine().trim().split("\\s+");
                String[] row2 = sc.nextLine().trim().split("\\s+");
                String[] row3 = sc.nextLine().trim().split("\\s+");
    
                // Check triangles formed by columns
                for (int col = 0; col < 3; col++) {
                    int side1 = Integer.parseInt(row1[col]);
                    int side2 = Integer.parseInt(row2[col]);
                    int side3 = Integer.parseInt(row3[col]);
    
                    // Check if the sides form a valid triangle
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

    // Main
    public static void main(String[] args) {
        String file = "inputTri.txt";

        // Part A
        int trianglesByRow = countTrianglesA(file);
        System.out.println(trianglesByRow);

        // Part B
        int trianglesByColumn = countTrianglesB(file);
        System.out.println(trianglesByColumn);
    }


}
