package com.bdlz.basicproblems;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number");
        num1 = scanner.nextInt();

        System.out.println("Enter the Second Number");
        num2 = scanner.nextInt();

        System.out.println("Enter the Third Number");
        num3 = scanner.nextInt();
        scanner.close();
        if (num1 > num2 && num1 > num3) {
            System.out.println("First Number is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second Number is greater");
        } else {
            System.out.println("Third Number is greater");
        }
    }
}
