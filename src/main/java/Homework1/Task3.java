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

        //printing out the swapped numbers
        System.out.println("After swapping the values of the three numbers: ");
        System.out.println("Number 1 is now: " + num1);
        System.out.println("Number 2 is now: " + num2);
        System.out.println("Number 3 is now: " + num3);

        //Summing number 1 and number 2
        int sum = num1 + num2;
        System.out.println("The sum of number 1 and number 2 is: " + sum);

        //Subtracting the sum of number 1 and number 2, from number 3
        int result = num3 - sum;
        System.out.println("The result from subtracting the sum of numbers 1 and 2, from number 3 is: " + result);

    }
}
