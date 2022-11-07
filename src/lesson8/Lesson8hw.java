package lesson8;

public class Lesson8hw {
    public static int umnojenie(int a, int b, int c) {
        return a * b * c;
    }

    public static void delenit(int a, int b) {
        System.out.println("Результат деления первого числа на второе будет: " + a / b);
        System.out.println("Остаток равен: " + a % b);
    }

    final static double pi = 3.14;

    void ploshadCrug(double r) {
        double s = pi * r * r;
        System.out.println(s);
    }

    static void dlidaCruga(double r) {
        double s = 2 * pi * r;
        System.out.println(s);
    }

   void info(double r){
        System.out.println("Радиус равен: " + r);
        ploshadCrug(r);
        dlidaCruga(r);
    }

 }

class Lesson8Test {
    public static void main(String[] args) {
        System.out.println(Lesson8hw.umnojenie(5, 6, 12));
        Lesson8hw.delenit(10, 5);

        Lesson8hw lesson8hw = new Lesson8hw();
        lesson8hw.info(10);
        lesson8hw.ploshadCrug(12);

        Lesson8hw.dlidaCruga(14);

    }

}
