package Homework3;

public class Car {

    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem){
        engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    public void useFuel(double fuel){
        //if the passed parameter is bigger than the free fuel available, printing a message, and setting freeFuel to 0
        if(fuel > freeFuel){
            System.out.println("Not enough free fuel!");
            freeFuel = 0;
        }else{
            freeFuel -= fuel;
        }

    }


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", price=" + price +
                ", isSportCar=" + isSportCar +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", freeFuel=" + freeFuel +
                ", engineFuelOperationSystem='" + engineFuelOperationSystem + '\'' +
                '}';
    }
}
