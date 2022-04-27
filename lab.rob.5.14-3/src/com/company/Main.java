package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first fractional number :");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
            System.out.print("Enter a second fractional number :");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                System.out.print("Enter a third fractional number :");
                if (scanner.hasNextDouble()) {
                    num3 = scanner.nextDouble();
                    if (num1 > num2 && num1 > num3) {
                        System.out.println("first largest numder ");
                    }
                    if (num2 > num1 && num2 > num3) {
                        System.out.println("second largest number");
                    }
                    if (num3 > num2 && num3 > num1) {
                        System.out.println("third largest number ");
                    }
                    if (num1 > num2 && num1 == num3) {
                        System.out.println("first and third largest number");
                    }
                    if (num1 > num3 && num1 == num2) {
                        System.out.println("first and second largest number");
                    }
                    if (num2 > num1 && num2 == num3) {
                        System.out.println("second and third largest number");
                    }
                    if (num1 > num2 && num2 == num3) {
                        System.out.println("all number are equal");
                    }

                } else {
                    System.out.println("You didn`t wrote any number");
                }
            } else {
                System.out.println("You didn`t wrote any number");
            }
        } else {
            System.out.println("You didn`t wrote any number");
        }
    }
}