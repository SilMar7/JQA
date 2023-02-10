package Homework3;

public class CarPerson {

    public static void main(String[] args) {

        //creating 2 new objects of class Car
        Car car1 = new Car();
        Car car2 = new Car();

        //setting the values of the properties of car1
        car1.year = 2004;
        car1.price = 9800.50;
        car1.fuelTankCapacity = 150;
        car1.freeFuel = 60.30;
        car1.engineFuelOperationSystem = "gasoline";
        car1.isSportCar = true;

        //setting the values of the properties of car1
        car2.year = 2010;
        car2.price = 12100.00;
        car2.fuelTankCapacity = 120;
        car2.freeFuel = 40.00;
        car2.engineFuelOperationSystem = "gasoline";
        car2.isSportCar = false;


        car2.useFuel(10.00);
        car2.changeEngineFuelOperationSystem("diesel");

        //printing both objects
        System.out.println("Car 1 info: " + car1);
        System.out.println("Car 2 info: " + car2);
    }
}
