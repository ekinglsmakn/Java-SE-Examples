package IfElseExamples;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Grade : ");
        int grade = scanner.nextInt();

        if (grade == 0) {
            System.out.println(0);
        } else if (grade > 0 && grade < 50) {
            System.out.println("grade: " + 1.5);

        } else if (grade >= 50 && grade < 60) {
            System.out.println("grade: " + 2.60);

        } else if (grade >= 60 && grade < 70) {
            System.out.println("grade: " + 3.70);

        } else if (grade >= 70 && grade < 85) {
            System.out.println("grade: " + 4.85);

        } else if (grade >= 85 && grade <= 100) {

            System.out.println("grade: " +5);
        } else {
            System.out.println("warning! Incorrect entry!");
        }
    }
}
