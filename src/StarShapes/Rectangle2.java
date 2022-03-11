package StarShapes;

import java.util.Scanner;

public class Rectangle2 {
    /*
     *
     *   *************
     *   *************
     *   *************
     *   *************
     *
     * Drawing Rectangle with "For"
     * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Height: ");
        int height = scanner.nextInt();
        System.out.println("Width: ");
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
