package StarShapes;

import java.util.Scanner;

public class PineTree2 {
    /*
     *
     *      *
     *     ***
     *    *****
     *   *******
     *  *********
     * ***********
     *
     * Drawing a pine tree with "For"
     *
     * */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Height: ");
        int height = scanner.nextInt();
        int size = height;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < size; j++) {
                System.out.print(" ");
            }
            size--;

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
