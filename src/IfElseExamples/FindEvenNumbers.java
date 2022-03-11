package IfElseExamples;

import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int numbers = scanner.nextInt();

        String isEven = (numbers % 2 == 0)? "Even Number !" : "Odd Number !";
        System.out.println(isEven);
    }
}
