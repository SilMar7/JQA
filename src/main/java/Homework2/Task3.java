package Homework2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] myArray = new double[5];

        //asking the user to enter 5 numbers of type double
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Enter a floating point number: ");
            //saving the entered numbers in the array
            myArray[i] = scan.nextDouble();
        }

        //printing the array
        System.out.print("The numbers in the array are: ");
        for(int counter = 0; counter < myArray.length; counter++)
            System.out.print(myArray[counter] + " ");
        }
}
