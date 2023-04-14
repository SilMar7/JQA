package PreviousHomeworks.Homework2;

public class Task2 {
    public static void main(String[] args) {

        //calling the calculateAverage method
        System.out.println("The average of the two numbers is: " + calculateAverage(5, 10));
    }

    public static double calculateAverage(int num1, int num2){
        double averageOfTwoNumbers = (double)(num1 + num2) / 2;
        return averageOfTwoNumbers;
    }
}
