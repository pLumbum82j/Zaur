package lesson7.doubletest;

import lesson7.Employee;

public class TestModifire {
    public static void main(String[] args) {
      //  Employee employee = new Employee(3,"Serg",33,2000,"IT"); //default

        Employee employee2 = new Employee(1, "Ivan",20.0); // piblic
        System.out.println(employee2.surname);
        //System.out.println(employee2.id); //default
        //System.out.println(employee2.salaray); //private
        employee2.printId();
        employee2.printSurname();
        employee2.printSalaray();

    }
}
