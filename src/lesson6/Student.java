package lesson6;

public class Student {
    int studentNumberId;
    String name;
    String surname;
    int course;
    double mathAvg;
    double economicsAvg;
    double languageAvg;

    public Student(int studentNumberId, String name, String surname, int course, double mathAvg, double economicsAvg, double languageAvg) {
        this.studentNumberId = studentNumberId;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.mathAvg = mathAvg;
        this.economicsAvg = economicsAvg;
        this.languageAvg = languageAvg;
    }

    public Student(int studentNumberId, String name, String surname, int course) {
        this(studentNumberId, name, surname, course, 0.0, 0.0, 0.0);
    }

    public Student() {
    }

}

class StudetTest {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", "Shtepa", 1, 3.5, 2.0, 3.3);
        Student student2 = new Student(2, "Lena", "Popka", 2);
        Student student3 = new Student();
    }


}
