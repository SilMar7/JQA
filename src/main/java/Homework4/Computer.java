package Homework4;

public class Computer {

    int year;
    double price;
    String operationSystem;

    //creating a no args constructor
    public Computer(){

    }
    //creating a constructor with arguments
    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    //creating a method that compares the prices of 2 objects of type Computer
    int comparePrice(Computer compare){
        if(this.price > compare.price){
            return -1;
        }
        else if(this.price < compare.price){
            return 1;
        }
        else{
            return 0;
        }
    }

    //creating a setter for the price
    public void setPrice(double price) {
        this.price = price;
    }
}
