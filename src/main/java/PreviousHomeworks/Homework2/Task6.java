package PreviousHomeworks.Homework2;

public class Task6 {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};

        //calling the method and checking if our arrays are equals
        if (compareArrays(firstArray, secondArray)) {
            System.out.println("The arrays are equal.");
        }else{
            System.out.println("The arrays are not equal.");
        }
    }

    //creating a method that compares 2 arrays
    public static boolean compareArrays(int array1[], int array2 []){
        //checking if the arrays have the same length
        if(array1.length != array2.length){
            return false;
        }
        //comparing each element from the arrays
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        //return true if none of the above checks returned false
        return true;
    }
}
