package lesson12;

public class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;

    }

}

class StudetTest {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Shtepa", 1);
        Student student2 = new Student("Lena", "Popka", 2);
        sravnenie(student, student2);
        sravnenie2(student, student2);
    }

    public static void sravnenie(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.surname.equals(st2.surname) && st1.course == st2.course) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты разные");
        }
    }


    public static void sravnenie2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.surname.equals(st2.surname)) {
                if (st1.course == st2.course) {
                    System.out.println("Студенты совпадают по всем параметрам");
                } else {
                    System.out.println("У студентов не совпадает курс");
                }
            } else {
                System.out.println("У студентов не совпадают фамилии");
            }
        } else {
            System.out.println("У студентов не совпадают имена");
        }
    }

}
