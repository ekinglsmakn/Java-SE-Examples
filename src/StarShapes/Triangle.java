package StarShapes;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        /*
         *   *
         *   **
         *   ***
         *   ****
         *   *****
         *   ******
         *
         * */

        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Height: ");
        int height = scanner.nextInt();

        while (i < height) {

            int j = 0;
            System.out.print("*");

            while (j < i) {

                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;
        }
    }
}
