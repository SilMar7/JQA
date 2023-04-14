package PreviousHomeworks.Homework2;

public class Task1 {

    public static void main(String[] args) {

        //Calling the method that sums 2 numbers
        sumTwoNumbers(2, 5);
    }


    public static void sumTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        System.out.printf("The sum of %d and %d is %d.", num1, num2, sum);
    }
}
