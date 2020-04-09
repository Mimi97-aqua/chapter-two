package com.trial;
import java.util.Scanner;
public class emma {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int num, rem, res, rem1, res1, rem2, res2, rem3, res3;
        System.out.print("ENTER A 5 DIGIT INTEGER: ");
        num = input.nextInt();
        rem = num % 10;
        res = num / 10;
        rem1 = res % 10;
        res1 = res / 10;
        rem2 = res1 % 10;
        res2 = res1 / 10;
        rem3 = res2 % 10;
        res3 = res2 / 10;
        System.out.println(res3 + "\t\t\t" + rem3 + "\t\t\t" + rem2 + "\t\t\t" +  rem1 + "\t\t\t" + rem);
    }
}

//ex 2.30

