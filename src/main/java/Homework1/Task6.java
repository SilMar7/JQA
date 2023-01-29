package Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //asking for user's input
        System.out.println("Please enter a number from 1 to 7: ");
        int input = scan.nextInt();

        switch(input){
            case 1:
                System.out.println("The first day of the week is Monday!");
                break;
            case 2:
                System.out.println("The second day of the week is Tuesday!");
                break;
            case 3:
                System.out.println("The third day of the week is Wednesday!");
                break;
            case 4:
                System.out.println("The forth day of the week is Thursday!");
                break;
            case 5:
                System.out.println("The fifth day of the week is Friday!");
                break;
            case 6:
                System.out.println("The sixth day of the week is Saturday!");
                break;
            case 7:
                System.out.println("The seventh day of the week is Sunday!");
                break;
            default:
                System.out.println("You have entered an invalid number!");
                break;
        }
    }
}
