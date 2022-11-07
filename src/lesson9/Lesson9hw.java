package lesson9;

public class Lesson9hw {
    public static void abc() {
        String s1 = new String("ABC");
        String s2 = new String("DEF");

    }

    public static void main(String[] args) {
        Lesson9hw lesson9hw = new Lesson9hw();
        abc();
        abc();
        String s1 = new String("ABC");
        abc();
        System.out.println();
        System.out.println();
        Test1 test1 = new Test1();
        test1.abc(3);
        System.out.println();
        Test2.abc(5);
        System.out.println();
        Test3 test3 = new Test3();
        test3.abc(4);


    }
}

class Test1 {
    int a = 1;
    //  static int a = 2;

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }
}

class Test2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }
}

class Test3 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }
}