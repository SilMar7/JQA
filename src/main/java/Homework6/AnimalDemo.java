package Homework6;

public class AnimalDemo {

    public static void main(String[] args) {

        //creating objects from every type of animal
        Cat theCat = new Cat();
        Dog theDog = new Dog();
        Bird birdOne = new Bird();
        Bird birdTwo = new Bird();

        //demonstrating the play() method for each type of animal
        theCat.play();
        theDog.play();
        birdOne.play();

        System.out.println("===============");

        //demonstrating the makeSomeNoise() method for each type of animal
        theCat.makeSomeNoise();
        theDog.makeSomeNoise();
        birdOne.makeSomeNoise();

        System.out.println("===============");

        //demonstrating the bird's overloaded method
        birdOne.sing(birdOne);
        birdOne.sing(birdOne, birdTwo);
    }
}
