package lesson18;

public class Lesson18HW {

    public static int[] sortirovka1(int[] array) {
        int tempVlaue;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];  //3
            int index = i; //1
            for (int j = i + 1; j < array.length; j++) { //2
                if (array[j] < min) { // 5 < 3 not
                    min = array[j]; // min = 0
                    index = j; // 1
                }
            }
            if (i != index){ // 1 != 1 yes
                tempVlaue = array[i];  //temp = 3
                array[i]= min; // array[0] = 0
                array[index] = tempVlaue; // array[1] = 3
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
        int[] array1 = {3, 0, 5, 12};
        for (int a = 0; a < array1.length; a++) {
            System.out.print(array1[a] + ", ");
        }
        String[][] array3 = {{"hello", "bye"}, {"good", "job"}, {"people"}};
        Lesson18HW.showArray(array3);
    }
}
