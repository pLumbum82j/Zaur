package lesson23;


public class Hw {
    public static void main(String[] args) {
        System.out.println();
        A c1= new C();
        c1.abc(new B());
    }
}
class A {
    public A() {
        System.out.println("Создается А");
    }

    void abc(A a){
        System.out.println("A");
    }
}
class B extends A{
    public B() {
        System.out.println("Создается В");
    }

    void abc(A b1){
        System.out.println("BBB");
    }

    void abc(B b1){
        System.out.println("B");
    }
}
class C extends B{
    public C() {
        System.out.println("Создается С");
    }

    @Override
    void abc(B b2){
        System.out.println("C");
    }
}