package com.trial;

import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.print("Enter first digit: ");
        a = input.nextInt();
        System.out.print("Enter second digit: ");
        b = input.nextInt();
        System.out.print("Enter third digit: ");
        c = input.nextInt();
        System.out.print("Enter fourth digit: ");
        d = input.nextInt();
        System.out.print("Enter fifth digit: ");
        e = input.nextInt();
        System.out.print("The largest number is ");
        if (a > b && a > c && a > d && a > e)
            System.out.println(a);
        else if (b > a && b > c && b > d && b > e)
                System.out.println(b);
            else if (c > a && c > b && c > d && c > e)
                    System.out.println(c);
                else if (d > a && d > b && d > c && d > e)
                        System.out.println(d);
                    else
                        if (e > a && e > b && e > c && e > d)
                            System.out.println(e);
      System.out.print("The smallest number is ");

     if (a < b && a < c && a < d && a < e)
         System.out.println(a);
     else
         if (b < a && b < c && b < d && b < e)
             System.out.println(b);
         else
             if (c < a && c < b && c < d && c < e)
                 System.out.println(c);
             else
                 if (d < a && d < b && d < c && d < e)
                     System.out.println(d);
                 else
                     if (e < a && e < b && e < c && e < d)
                         System.out.println(e);

                    }
             }

//2.24//