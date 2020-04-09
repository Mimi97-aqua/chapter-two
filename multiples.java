package com.trial;

import java.util.Scanner;
public class uhuh {
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        if ( a % b == 0) {
            System.out.print("a is a multiple of b");
        }
        else
            System.out.print("a is not a multiple of b");

    }
}

//ex 2.26