package com.bdlz.basicproblems;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int dividend, divisor, quotient, remainder;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dividend");
        dividend = scanner.nextInt();

        System.out.println("Enter the divisor");
        divisor = scanner.nextInt();
        scanner.close();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
