package com.trial;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Carpool {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // this is a carpool savings calculator

        //part one begins here
        // I am assuming that the driver drives for 8 hours straight each day at 60mph
        // distance covered in 8 hours is 60x8=480Km in a day
        // the distance covered is the speed times the time

        int a, b, c;
        System.out.print("Enter speed covered in a day in miles: ");
        a = input.nextInt();
        System.out.print("Enter amount of time you cover in a day in hours: ");
        b = input.nextInt();
        c = a * b;
        System.out.print("The distance you cover in a day is: ");
        System.out.print(c);
        System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        //part b begins here
        // this it to calculate the cost per gallon of gasoline
        // the cost per gallon of gasoline in XAF is 1385.5
        // assuming the driver uses 3 gallons of gasoline each day
        // this means that the cost for 3 would be 3 x the unit price

        int x;
        double y = 1385.5, z;
        System.out.print("How many gallons of gasoline do you use in a day: ");
        x = input.nextInt();
        System.out.print("The cost of gallons you use per day is: ");
        z = y * x ;
        System.out.print(z);

        // part c begins here
        // we would be calculating the average miles per gallon
        // average miles per gallon = number of miles covered / number of gallons used

        int s, g, k;
        s = c;
        g = x;
        k = s / g;
        System.out.print("Average miles per gallon is : " );
        System.out.print(k);

    }
}
