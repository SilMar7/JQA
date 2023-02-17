package Homework5;

public class Student extends Person {

    private double score;


    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }


    @Override
    public void showPersonInfo(){
        System.out.println("The Student's name is " + getName() + ", the student's age is " + getAge()
                + ", the student is a man: " + isMan() + ". The Student's score is: " + this.score );
    }


}
