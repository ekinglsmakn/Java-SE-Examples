package ExceptionExamples;

import java.io.IOException;

public class MultiplyTryCatch {
    public static void main(String[] args) {


        try {
            try {

                fractions();

            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("CATCH BLOCK 1 - NULL POINTER EXCEPTION ");
            }

            System.out.println("TRY BLOCK 1 ");

        } catch (ArithmeticException e) {

            e.printStackTrace();
            System.out.println("CATCH BLOCK 2 -  ARITHMETIC EXCEPTION ");

        } finally {

            System.out.println("FINALLY BLOCK ");
            //Eğer Catch'ler exceptionları tutsalar da tutmasalar da  Finally çalışır. Ve alt satıra geçer
            //Ancak Catch'ler tutamazlarsa Finally çalışır, program biter ve finally altındaki  satır çalışmaz

        }
        System.out.println("FINISHH!!!!!");

    }

    private static void fractions() {
        int denominator =0;
        int numerator = 38;
        int division = numerator / denominator;
    }
}
