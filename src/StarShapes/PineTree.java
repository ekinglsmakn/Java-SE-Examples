package StarShapes;

import java.util.Scanner;

public class PineTree {

    /*
    *
    *      *
    *     ***
    *    *****
    *   *******
    *  *********
    * ***********
    *
    * Drawing a pine tree with "while"
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
            int l = 1;
            int m = 0;

            i++;

            while (j < size) {
                System.out.print(" "); //boşluk
                j++;

            }


            while (l < i) {
                System.out.print("*");
                l++;

            }

            while (m < i) {
                System.out.print("*");
                m++;

            }

            size--;
            System.out.println();

        }
    }
}
