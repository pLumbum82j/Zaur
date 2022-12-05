package lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println(e.name + " из департамента " + e.department + " с зарплатой " + e.salary);
    }

    void filtraciaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> emp) {
        for (Employee e : aL) {
            if (emp.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Serg", "IT", 100);
        Employee e2 = new Employee("Jeka", "IT", 750);
        Employee e3 = new Employee("Eerec", "Kaka", 270);
        Employee e4 = new Employee("Masko", "Pepsic", 1000);
        Employee e5 = new Employee("Britany", "Britany", 22);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        TestEmployee t1 = new TestEmployee();
        t1.filtraciaRabotnikov(list, employee -> employee.department == "IT" && employee.salary > 200);
        t1.filtraciaRabotnikov(list, employee -> employee.name.startsWith("E") && employee.salary == 270);
        t1.filtraciaRabotnikov(list, employee -> employee.name == employee.department);



    }
}
