package lesson10.p4;

import lesson10.p1.A;
import lesson10.p1.p2.p3.C;
import lesson10.p4.p5.E;

import static lesson10.p1.p2.B.b;

public class D {
    public int d = 4;

    public void abcdce(int a, int b, int c, int d,int e){
        System.out.println(a+b+c+d+e);
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);

        System.out.println(b);

        C c = new C();
        System.out.println(c.c);

        D d = new D();
        System.out.println(d.d);

        E e = new E();
        System.out.println(e.e);

        d.abcdce(a.a, b, c.c, d.d, e.e);
    }
}
