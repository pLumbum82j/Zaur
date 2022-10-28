package lesson4;

public class Lesson4hw {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentNumberId = 1;
        student1.name = "Ivan";
        student1.surname = "Shtepa";
        student1.course = 2;
        student1.mathAvg = 3.3;
        student1.economicsAvg = 4.0;
        student1.languageAvg = 3.7;

        student2.studentNumberId = 2;
        student2.name = "Sergey";
        student2.surname = "Ymeraev";
        student2.course = 3;
        student2.mathAvg = 4.3;
        student2.economicsAvg = 3.2;
        student2.languageAvg = 3.5;

        student3.studentNumberId = 3;
        student3.name = "Valentin";
        student3.surname = "Pomeshkin";
        student3.course = 5;
        student3.mathAvg = 5.0;
        student3.economicsAvg = 4.4;
        student3.languageAvg = 2.2;

        System.out.println("Номер студенческого билета: " + student1.studentNumberId);
        System.out.println("Имя и фамилия стунедна: " + student1.name + " " + student1.surname);
        System.out.println("Курс студента: " + student1.course);
        System.out.println("Средняя оценка по всем трем предметам: " + ((student1.mathAvg + student1.economicsAvg + student1.languageAvg) / 3));
        System.out.println("Средняя оценка по математике: " + student1.mathAvg);
        System.out.println("Средняя оценка по экономике: " + student1.economicsAvg);
        System.out.println("Средняя оценка по инастранному языку: " + student1.languageAvg);
        System.out.println();
        System.out.println("Номер студенческого билета: " + student2.studentNumberId);
        System.out.println("Имя и фамилия стунедна: " + student2.name + " " + student2.surname);
        System.out.println("Курс студента: " + student2.course);
        System.out.println("Средняя оценка по всем трем предметам: " + ((student2.mathAvg + student2.economicsAvg + student2.languageAvg) / 3));
        System.out.println("Средняя оценка по математике: " + student2.mathAvg);
        System.out.println("Средняя оценка по экономике: " + student2.economicsAvg);
        System.out.println("Средняя оценка по инастранному языку: " + student2.languageAvg);
        System.out.println();
        System.out.println("Номер студенческого билета: " + student3.studentNumberId);
        System.out.println("Имя и фамилия стунедна: " + student3.name + " " + student3.surname);
        System.out.println("Курс студента: " + student3.course);
        System.out.println("Средняя оценка по всем трем предметам: " + ((student3.mathAvg + student3.economicsAvg + student3.languageAvg) / 3));
        System.out.println("Средняя оценка по математике: " + student3.mathAvg);
        System.out.println("Средняя оценка по экономике: " + student3.economicsAvg);
        System.out.println("Средняя оценка по инастранному языку: " + student3.languageAvg);

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
