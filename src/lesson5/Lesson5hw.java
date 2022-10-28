package lesson5;

public class Lesson5hw {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.id = 1;
        bankAccount.name = "Ivan";
        bankAccount.balance = 100;
        bankAccount.popolnenieScheta(200);
        bankAccount.snatieSoScheta(37.22);

        Student student1 = new Student();

        student1.studentNumberId = 1;
        student1.name = "Ivan";
        student1.surname = "Shtepa";
        student1.course = 2;
        student1.mathAvg = 3.3;
        student1.economicsAvg = 4.0;
        student1.languageAvg = 3.7;

        StudetTest st = new StudetTest();
        System.out.println("средняя оценка студента" + student1.name + " ровна " + st.avg(student1));

        Employee employee1 = new Employee(1, "Filatov", 13, 100, "kolhoz");
        System.out.println("Новая зарплата работника " + employee1.surname + " ровна " + employee1.bonus());

        Employee employee2 = new Employee(2, "Babarov", 18, 200, "bank");
        System.out.println("Новая зарплата работника " + employee2.surname + " ровна " + employee2.bonus());
    }
}

class BankAccount {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double popolnenie) {
        System.out.println("Сумма на вашем балансе " + balance);
        balance += popolnenie;
        System.out.println("После пополнения на вашем балансе " + balance);
    }

    void snatieSoScheta(double snatie) {
        System.out.println("Сумма на вашем балансе " + balance);
        balance -= snatie;
        System.out.println("После снятия со счёта средств на вашем балансе " + balance);
    }
}

class Student {
    int studentNumberId;
    String name;
    String surname;
    int course;
    double mathAvg;
    double economicsAvg;
    double languageAvg;

}
class StudetTest{
    double avg(Student student) {
        double avg = 0;
        return avg = (student.mathAvg + student.economicsAvg + student.languageAvg) / 3;
    }
}

class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double bonus() {
        return salary *= 2;
    }
}