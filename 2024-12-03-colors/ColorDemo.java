public class ColorDemo {
    public static void main(String[] args) {
        // Clear screen and move cursor to top-left
        System.out.print("\u001b[2J\u001b[H");

        // Print colorful text
        System.out.print("\u001b[31mRed Text ");
        System.out.print("\u001b[32mGreen Text ");
        System.out.print("\u001b[34mBlue Text ");
        System.out.println("\u001b[33mYellow Text");

        // Reset terminal to defaults
        System.out.print("\u001b[0m");
    }
}
