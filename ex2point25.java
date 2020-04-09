

import java.util.Scanner;
public class ex2point25 {
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter any integer: ");
        a = input.nextInt();
        if ( a % 2 == 0) {
            System.out.println(a);
            System.out.println("It is even");
        }
        else
            System.out.println("It is odd");


    }
}
// ex 2.25