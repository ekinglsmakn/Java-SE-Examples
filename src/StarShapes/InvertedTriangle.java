package StarShapes;

import java.util.Scanner;

public class InvertedTriangle {
    /*
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     * ******
     *
     * */

    public static void main(String[] args) {

        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Height: ");
        int height = scanner.nextInt();

        int size = height;

        while (i < height) {

            int j = 0;
            int l = 0;

            i++;

            while (j < size) {
                System.out.print(" "); //boşluk
                j++;

            }


            while (l < i) {
                System.out.print("*");
                l++;

            }


            size--;
            System.out.println();

        }

    }

}
