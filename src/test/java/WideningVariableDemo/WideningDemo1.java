package WideningVariableDemo;

public class WideningDemo1 {
    public static void main(String[] args){
        //local variables
        //Widening from byte to float
        //from small to big data type
        byte b = 100;
        float f = b;
        System.out.println(b);
        System.out.println(f);
    }
}

class WideningDemo2{
    public static void main(String[] args) {

   // local variables
   //Widening from long to double
    long l = 2568;
    double d = l;

        System.out.println(l);
        System.out.println(d);
    }
}

class WideningDemo3{
    public static void main(String[] args) {

        // local variables
        //Widening from byte to int
        byte b = 105;
        int  a = b;

        System.out.println(a);
        System.out.println(b);
    }
}

