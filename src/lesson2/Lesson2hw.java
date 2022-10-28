package lesson2;

public class Lesson2hw {
    public static void main(String[] args) {
        byte b1 = 0b1100;
        byte b2 = 014;
        byte b3 = 12;
        byte b4 = 0xC;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        short s1 = -0b0101_0001_0100;
        short s2 = -1300;
        short s3 = -02424;
        short s4 = -0x514;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        int i1 = 0b0;
        int i2 = 0;
        int i3 = 00;
        int i4 = 0x0;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

        long l1 = 0b0111010110111100110100010101L;
        long l2 = 123456789L;
        long l3 = 0726746425L;
        long l4 = 0x75BCD15L;
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

        float f1 = 3.22f;
        System.out.println(f1);
        double d1 = 3.33;
        System.out.println(d1);
        boolean boo1 = true;
        System.out.println(boo1);

        char c1 = 300;
        System.out.println(c1);
        char c2 = '\u012C';
        System.out.println(c2);
        char c3 = 'Ĭ';
        System.out.println(c3);


    }
}
