package lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder podstava = new StringBuilder(name);
        return podstava;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 11) {
            this.grade = grade;
        }
    }

    void showInfo(){
        System.out.println(getName() + " учится на " +  getCourse() + " курсе с оценкой " + getGrade());
    }

}

class StudentTest{
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Malina"));
        st.setCourse(2);
        st.setGrade(7);
        st.showInfo();


    }

}
