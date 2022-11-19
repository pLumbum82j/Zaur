package lesson15;

public class Time3 {
    public static void main(String[] args) {
        TimePause();
    }

    public static void TimePause() {
        int i = 0;
        CHAS:
        while (i < 6) {
            int j = 0;
            MINUTA:
            do {
                if (i > 1 && j % 10 == 0) {
                    break CHAS;
                }
                int k = 0;
                SECUNDA:
                while (k < 60) {
                    if ((k * i) > j) {
                        j++;
                        continue MINUTA;
                    }
                    System.out.println(i + ":" + j + ":" + k);
                    k++;
                }
                j++;
            } while (j < 60);
            i++;
        }
    }
}
