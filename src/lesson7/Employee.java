package lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id, String surname, double salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

    private Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void printId() {
        System.out.println(id);
    }

    public void printSurname() {
        System.out.println(surname);
    }

    public void printSalaray() {
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee employee2 = new Employee(2, "Ivan", 18, 20.0); //private
        System.out.println(employee2.id); // default
        System.out.println(employee2.surname); // public
        System.out.println(employee2.salary); // private
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ivan", 20.0); //public
        System.out.println(employee.id); //default
        System.out.println(employee.surname); // public
        //System.out.println(employee.salaray); //private
        employee.printId();
        employee.printSurname();
        employee.printSalaray();

        Employee employee3 = new Employee(2, "Ivan", 18, 20.0, "Tatarka"); //default
        employee3.printId();
        employee3.printSurname();
        employee3.printSalaray();

    }
}
