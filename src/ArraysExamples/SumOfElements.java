package ArraysExamples;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Element Size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Sum Of Elements (Array1) : " + sum(array));
         //***********************************************************************

        int [] array2 = new int[] {7, 8, 9, 10};
        System.out.println("Sum Of Elements (Array2) :  " +sum(array2));

    }

    private static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
