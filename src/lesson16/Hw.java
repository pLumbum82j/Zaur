package lesson16;

public class Hw {
    public static void main(String[] args) {
        String s1 = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        email(s1);

    }

    public static void email(String s1) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < s1.length() - 1){
            a = s1.indexOf('@', c);
            b = s1.indexOf('.', c);
            c = s1.indexOf(';', c +1);
            System.out.println(s1.substring(a + 1, b));
        }
    }


}
