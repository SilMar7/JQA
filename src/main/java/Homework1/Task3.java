package Homework1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Asking the user to enter 3 numbers
        System.out.println("Please enter an integer: ");
        int num1 = scan.nextInt();

        System.out.println("Please enter a 2nd integer: ");
        int num2 = scan.nextInt();

        System.out.println("Please enter a 3d integer: ");
        int num3 = scan.nextInt();

        //printing the numbers
        System.out.println("Number 1 is: " + num1);
        System.out.println("Number 2 is: " + num2);
        System.out.println("Number 3 is: " + num3);

        //swapping the values of the numbers
        int swap = num1;
        num1 = num2;
        num2 = num3;
        num3 = swap;

        //printing out the swapped numbers
        System.out.println("After swapping the values of the three numbers: ");
        System.out.println("Number 1 is now: " + num1);
        System.out.println("Number 2 is now: " + num2);
        System.out.println("Number 3 is now: " + num3);

    }
}
