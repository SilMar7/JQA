package PreviousHomeworks.Homework4;

public class ComputerPrices {

    public static void main(String[] args) {

        //creating the 1st object of type Computer with the no args constructor
        Computer comp1 = new Computer();
        //setting the price of the 1st computer by using price's set method
        comp1.setPrice(2100);

        //creating a 2nd object of type Computer by setting values for its arguments
        Computer comp2 = new Computer(2020, 1850, "Windows");

        //comparing the prices of both objects and printing out the result
        System.out.println(comp1.comparePrice(comp2));
    }
}
