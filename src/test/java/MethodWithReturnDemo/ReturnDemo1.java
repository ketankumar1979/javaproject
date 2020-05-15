package MethodWithReturnDemo;

//Example of return user defined method with
public class ReturnDemo1 {

    public int demo1(){ //user defined method with retun data type int
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    public static void main(String[] args){
        ReturnDemo1 obj = new ReturnDemo1();
        int c =  obj.demo1();
        System.out.println(c);
    }
}

// Example of return data type method with arguments.
class ReturnDemo2{
 public String demo1(String surname, String name){ //userdefine method with argument with String return data type
        String c = surname +" " + name;
        return c;
    }

    public static void main(String[] args){
        ReturnDemo2 obj = new ReturnDemo2();
        String c = obj.demo1("Patel", "Ketan");
        System.out.println(c);
    }
}

/* Homework
1. print 21.2 + 25.6 = 46.8 by using return data type method with arguments
2. print 500/100 = 5 by using return daty type method with arguments.
 */

