package lesson20;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hw20 {
    private ArrayList<String> abc(String... s) {
        ArrayList<String> valueMethod = new ArrayList<>();
        for (String str : s){
            if (!valueMethod.contains(str)){
                valueMethod.add(str);
            }
        }
        Collections.sort(valueMethod);
        return valueMethod;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "My Darling";
        String s3 = "Pretty";
        String s4 = "Crazy";
        ArrayList<String> value = new ArrayList<>();
        Hw20 hw20 = new Hw20();
        value = hw20.abc(s3, s1, s4, s2, s4);
        System.out.println(value.toString());
    }
}
