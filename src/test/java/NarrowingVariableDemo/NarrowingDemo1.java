package NarrowingVariableDemo;

public class NarrowingDemo1 {
    public static void main(String[] args) {

        //Narrowing from float to int
        float f = 25.3f;
        int a = (int) f;
        System.out.println(f);
        System.out.println(a);

    }
}

class NarrowingDemo2 {
    public static void main(String[] args) {

        //Narrowing from double to int
        double d = 25.3;
        byte b = (byte) d;
        System.out.println(d);
        System.out.println(b);

    }
}

