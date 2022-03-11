package IfElseExamples;

import java.util.Scanner;

public class FindGreaterNumber {
    public static void main(String[] args) {
        int greaterNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number 1 :");
        int number1 = scanner.nextInt();

        System.out.print("enter number 2 :");
        int number2 = scanner.nextInt();

        System.out.print("enter number 3 :");
        int number3 = scanner.nextInt();

        greaterNumber = number1 > number2 ? (number1 > number3 ? number1 : number3) :
                (number2 > number3 ? number2 : number3);


        System.out.println("Greater Number Is : " + greaterNumber);
    }
}
