package com.trial;

import java.util.Scanner;
public class not {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c ;
        System.out.print("Enter a digit: ");
        a = input.nextInt();
        System.out.print("Enter another digit: ");
        b = input.nextInt();
        c = a + b;
        System.out.print("The sum of these 2 digits are: ");
        System.out.print(c);
    }
}
