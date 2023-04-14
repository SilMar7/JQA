package PreviousHomeworks.Homework2;

public class Task4 {

    public static void main(String[] args) {

        //creating an array with 10 numbers
        int[] intArray = new int[] {1, 6, 3, 5, 2, 7, 4, 8, 0, 9};

        int index = 0;

        //looping through the array using while loop and printing the array elements
        while(index < intArray.length){
            System.out.print(intArray[index] + " ");
            index++;
        }

        System.out.println("\n");

        //looping through the array using for loop and printing the array elements
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
