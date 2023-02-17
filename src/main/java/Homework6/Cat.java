package Homework6;

public class Cat extends Animal implements IAnimal{


    public void climb(){
        System.out.println("The cat is climbing up a tree.");
    }

    @Override
    void play() {
        System.out.println("The cat is playing.");
    }

    @Override
    void greet() {
        System.out.println("The cat says MEOW.");
    }

    @Override
    void move() {
        System.out.println("The cat is walking.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The cat is meowing.");
    }
}
