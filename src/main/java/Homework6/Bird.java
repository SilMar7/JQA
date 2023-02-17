package Homework6;

public class Bird extends Animal implements IAnimal{

    public void fly(){
        System.out.println("The bird is flying.");
    }

    public void sing(Bird bird){
        System.out.println("The bird is singing.");
    }

    public void sing(Bird birdOne, Bird birdTwo){
        System.out.println("The birds are singing louder.");
    }

    @Override
    void play() {
        System.out.println("The bird is playing around.");

    }

    @Override
    void greet() {
        System.out.println("The bird whistles.");
    }

    @Override
    void move() {
        System.out.println("The bird jumps.");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The bird chirps.");
    }
}
