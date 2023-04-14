package PreviousHomeworks.Homework1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number of working hours for today: ");
        int workingHours = scan.nextInt();

        System.out.println("Enter amount of money available: ");
        double money = scan.nextDouble();

        System.out.println("Is it a working day (true / false): ");
        boolean isWorkingDay = scan.nextBoolean();

        //checking if it's a working day or not
        if(isWorkingDay == true){
            System.out.printf("Today I will work for %d hours.%n", workingHours);
        }
        else{
            if(money == 0){
                System.out.println("I will stay at home and watch TV.");
            }
            else if((money > 0) && (money < 10)){
                System.out.println("I will go out to buy an ice cream.");
            }
            else if(money >= 10){
                System.out.println("I will go to the cinema.");
            }
        }
    }
}
