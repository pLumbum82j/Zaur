package lesson14;

public class Time {
    public static void main(String[] args) {
        timeAttack();
    }

    public static void timeAttack() {
        CHAS:
        for (int i = 0; i < 6; i++) {

            MINUTA:
            for (int j = 0; j < 60; j++) {
                if (i > 1 && j % 10 == 0) {
                    break CHAS;
                }
                SECUNDA:
                for (int k = 0; k < 60; k++) {
                    if ((k * i) > j) {
                        continue MINUTA;
                    }
                    System.out.println(i + ":" + j + ":" + k);
                }

            }

        }

    }

}
}
