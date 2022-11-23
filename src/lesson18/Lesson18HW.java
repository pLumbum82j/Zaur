package lesson18;

public class Lesson18HW {

    public static int[] sortirovka1(int[] array) {
        int m;
        for (int j = 0; j < array.length; j++) {
            int min = array[j];
            int index = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            if (j != index){
                m = array[j];
                array[j]= min;
                array[index] = m;
            }
        }

        return array;
    }

    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1){
                    System.out.print(array[i][j] + ",");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length -1){
                System.out.print("], ");
            } else {
                System.out.println("]");
            }
        }
        System.out.println(" }");
    }

}

class testhw {
    public static void main(String[] args) {
        Lesson18HW lesson18HW = new Lesson18HW();
        int[] array1 = {3, 7, 5, 12, 7, 8, 0, 87};
        int[] array2 = Lesson18HW.sortirovka1(array1);
        for (int a = 0; a < array2.length; a++) {
            System.out.print(array2[a] + ", ");
        }
        String[][] array3 = {{"hello", "bye"}, {"good", "job"}, {"people"}};
        Lesson18HW.showArray(array3);
    }
}
