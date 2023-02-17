package Homework5;

public class Main {

    public static void main(String[] args) {

        //creating an array of type Person with 10 elements
        Person [] personsArray = new Person[10];

        //adding objects of type Person, Student and Employee to the array
        personsArray[0] = new Person("Maria", 21,false);
        personsArray[1] = new Person("Ivan", 25,true);
        personsArray[2] = new Student("Petar", 18, true, 5.00);
        personsArray[3] = new Student("Anna", 19, false, 4.50);
        personsArray[4] = new Employee("Atanas", 17, true, 24.00);
        personsArray[5] = new Employee("Kristina", 35, false, 30.00);

        //looping through the array and printing out info about each object
        for(int i = 0; i < personsArray.length; i++){
            if(personsArray[i] != null) {
                if(personsArray[i] instanceof Student || personsArray[i] instanceof Employee || personsArray[i] instanceof Person) {
                    personsArray[i].showPersonInfo();
                }
           }
            else{
                continue;
            }
        }

        System.out.println("=======================");

        //looping through the array and showing the overtime amount that has to be paid to every employee
        for(int i = 0; i < personsArray.length; i++) {
            if (personsArray[i] != null) {
                if (personsArray[i] instanceof Employee) {
                    Employee employee = (Employee) personsArray[i];
                    System.out.println(employee.calculateOvertime(2));
                }
            } else {
                continue;
            }
        }
    }
}
