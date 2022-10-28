package lesson6;

public class OverLoadingMethod {
    int sum() {
        int result = 0;
        System.out.println("summa " + result);
        return result;
    }

    int sum(int a) {
        int result2 = a;
        System.out.println("summa " + result2);
        return result2;
    }

    int sum(int a, int b) {
        int result3 = a + b;
        System.out.println("summa " + result3);
        return result3;
    }

    int sum(int a, int b, int c) {
        int result4 = a + b + c;
        System.out.println("summa " + result4);
        return result4;
    }

    int sum(int a, int b, int c, int d) {
        int result5 = a + b + c + d;
        System.out.println("summa " + result5);
        return result5;
    }
}

class OverLoadingMethodTest {
    public static void main(String[] args) {
        OverLoadingMethod overLoadingMethod = new OverLoadingMethod();
        overLoadingMethod.sum();
        overLoadingMethod.sum(3);
        overLoadingMethod.sum(3, 5);
        overLoadingMethod.sum(3, 5, 7);
        overLoadingMethod.sum(3, 5, 7, 9);

    }
}
