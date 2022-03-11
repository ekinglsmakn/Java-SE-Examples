package StarShapes;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        /*
        *
        *   *************
        *   *************
        *   *************
        *   *************
        *
        * Drawing Rectangle with "While"
        *
        * */

        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Height: ");
        int height = scanner.nextInt();
        System.out.println("Width: ");
        int width = scanner.nextInt();

        while (i < height) {

           int  j=0; //while for'dan farklı olarak döngüden çıktıktan sonra sayacı sıfırlamaz. Bu nedenle burada j'yi sıfırladık
            System.out.print("*");

            while (j < width) {

                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;
        }

    }
}
