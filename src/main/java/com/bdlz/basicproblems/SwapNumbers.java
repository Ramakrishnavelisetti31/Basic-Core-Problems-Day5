package com.bdlz.basicproblems;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int value1, value2, temp;
        System.out.println("enter 2 Numbers to Swap");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");
        value1 = scanner.nextInt();
        System.out.println("Enter the number 2");
        value2 = scanner.nextInt();
        scanner.close();
        System.out.println("the given input Numbers are Number1 is : " + value1 + "  Number2 is : " + value2);
        temp = value1;
        value1 = value2;
        value2 = temp;
        System.out.println("numbers after Swapping number1 is : " + value1 + "  number2 is : " + value2);
    }
}
