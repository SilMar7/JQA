package Homework5;

public class Employee extends Person {

    private double daySalary;


    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours){
        if(this.getAge() < 18){
            System.out.print("The money to be paid to the employee for the overtime is: ");
            return 0;
        } else{
            System.out.print("The money to be paid to the employee for the overtime is: ");
            return hours * ((daySalary / 8) * 1.5);
        }
    }

    @Override
    public void showPersonInfo(){
        System.out.println("The Employee's name is " + getName() + ", the employee's age is " + getAge()
                + ", the employee is a man: " + isMan() + ". The Employee's daily salary is: " + this.daySalary);
    }
}
