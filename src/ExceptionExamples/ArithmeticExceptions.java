package ExceptionExamples;

import java.util.Scanner;

//If less than 18; throw exception

public class ArithmeticExceptions {
    public ArithmeticExceptions(String s) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        int age = scanner.nextInt();


        try {

            method(age);

        } catch (java.lang.ArithmeticException e){ //metodun içindeki exceptionu burda tuttuk

            e.printStackTrace();
            System.out.println("Catch Block");

        }
        System.out.println("Finish");
    }

    private static void method(int age) {

        if (age < 18) {

          throw new java.lang.ArithmeticException("*********   AUTHORIZED LOGIN !!!!!   *********");
          //exception attık ve exception açıklaması yaptık

        } else
            System.out.println("unauthorized access!!");
    }
}
