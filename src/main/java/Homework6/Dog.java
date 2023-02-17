package Homework6;

public class Dog extends Animal implements IAnimal{

    public void bringStick(){
        System.out.println("The dog is bringing the stick.");
    }

    @Override
    void play() {
        System.out.println("The dog is playing.");
    }

    @Override
    void greet() {
        System.out.println("The dog says BAW BAW.");
    }

    @Override
    void move() {
        System.out.println("The dog is running.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The dog is barking.");
    }
}
