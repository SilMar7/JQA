package Homework2;

public class Task5 {

    public static void main(String[] args) {

        //creating the array
        int[] myArray = new int []{10, 12, 1, 8, 4};

        //creating an empty array with the length of the 1st array
        int[] myNewArray = new int[myArray.length];

        //copying the values of the 1st array to the 2nd array
        for(int i = 0; i < myArray.length; i ++){
            myNewArray[i] =myArray[i];
            //printing the values of the 2nd array
            System.out.print(myNewArray[i] + " ");
        }
    }
}
