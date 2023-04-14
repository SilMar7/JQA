package PreviousHomeworks.Homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //asking user to enter an integer
        System.out.println("Please enter an integer: ");

        //checking if the user has entered a valid integer
        if(scan.hasNextInt()) {
            int firstNumber = scan.nextInt();
            System.out.printf("You have entered the number %d.%n", firstNumber);

            System.out.println("Please enter a second integer: ");
            int secondNumber = scan.nextInt();
            System.out.printf("You have entered the number %d.%n", secondNumber);

            System.out.println("Now please enter a 3d number: ");
            int thirdNumber = scan.nextInt();

            //checking if the first number is < than the second number
            if (firstNumber < secondNumber) {
                if ((thirdNumber > firstNumber) && (thirdNumber < secondNumber)) {
                    System.out.printf("The number %d is between number %d and number %d.%n", thirdNumber, firstNumber, secondNumber);
                } else {
                    System.out.printf("The number %d is NOT between number %d and number %d.%n", thirdNumber, firstNumber, secondNumber);
                }
                //checking if the first number is > than the second number
            } else if (firstNumber > secondNumber) {
                if ((thirdNumber < firstNumber) && (thirdNumber > secondNumber)) {
                    System.out.printf("The number %d is between number %d and number %d.%n", thirdNumber, secondNumber, firstNumber);
                } else {
                    System.out.printf("The number %d is NOT between number %d and number %d.%n", thirdNumber, secondNumber, firstNumber);
                }
            }
        }
        //printing an error message if the user hasn't entered a valid integer
        else{
            System.out.println("You have entered an invalid integer!");
        }

    }
}
