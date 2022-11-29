package lesson19;

public class Hw {
    protected String[] abc(String[]... s) {
        int length = 0;
        for (String[] value : s) {
            length += value.length;
        }
        String[] sValue = new String[length];
        int count = 0;
        for (String[] value : s) {
            for (String str : value) {
                sValue[count] = str;
                count++;
            }
        }
        return sValue;
    }

}

class TestHw {
    public static void main(String[] args) {
        Hw hw = new Hw();
        String[] array1 = new String[]{"abc", "efg"};
        String[] array2 = new String[]{"zzz", "xxx"};
        String[] array3 = new String[]{"yaka", "tak"};
       for (String value : hw.abc(array1, array2, array3)){
            System.out.println(value);
        }



    }
}