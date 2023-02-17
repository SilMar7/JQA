package Homework5;

public class Person {

    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void showPersonInfo(){
        System.out.println("The Person's name is " + this.name + ", the person's age is " + this.age
               + ", the person is a man: " + this.isMan + "." );
    }
}
