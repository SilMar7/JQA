package PreviousHomeworks.Homework1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Asking the user to enter 4 numbers
        System.out.println("Please enter an integer: ");
        int num1 = scan.nextInt();

        System.out.println("Please enter a 2nd integer: ");
        int num2 = scan.nextInt();

        System.out.println("Please enter a floating point number: ");
        double num3 = scan.nextDouble();

        System.out.println("Please enter a 2nd floating point number: ");
        double num4 = scan.nextDouble();

        //swapping the values of the first 2 numbers (integers)
        int tempInt = num1;
        num1 = num2;
        num2 = tempInt;

        //swapping the values of number 3 and number 4 (doubles)
        double tempDouble = num3;
        num3 = num4;
        num4 = tempDouble;

        //printing the values of the first pair of swapped numbers
        System.out.println("After swapping the values of the first 2 numbers, their values are:");
        System.out.println("Number 1 is now : " + num1);
        System.out.println("Number 2 is now : " + num2);

        //printing the values of the second pair of swapped numbers
        System.out.println("After swapping the values of the second pair of numbers, their values are:");
        System.out.println("Number 3 is now : " + num3);
        System.out.println("Number 4 is now : " + num4);

        //casting the first 2 numbers from int to double
        double numOneDouble = num1;
        double numTwoDouble = num2;

        //printing out the sum of the 2 numbers
        System.out.println("THe sum of the first two numbers is: " + (numOneDouble + numTwoDouble));


        //casting the second pair of numbers from double to int
        int numThreeInt = (int) num3;
        int numFourInt = (int) num4;

        //printing out the sum of the second pair of numbers
        System.out.println("THe sum of the second pair of numbers is: " + (numThreeInt + numFourInt));

    }

}
