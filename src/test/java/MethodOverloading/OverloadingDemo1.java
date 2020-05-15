package MethodOverloading;

//Example of method oveloading by changing arguments
public class OverloadingDemo1 {

    public void demo1(int a, int b){
        System.out.println(a+b);
    }
    public void demo1(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        OverloadingDemo1 obj = new OverloadingDemo1();
        obj.demo1(10,20);
        obj.demo1(10,20,50);
    }

}//class end

//Example of method overloading by changing the data type
class OverloadingDemo2{

    public void demo2(int a, int b){
        System.out.println(a+b);
    }
    public void  demo2(float a, float b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        OverloadingDemo2 obj = new OverloadingDemo2();
        obj.demo2(30,50);
        obj.demo2(50.6f,80.8f);
    }
}




//Example of method overloading by static method
class Overloading4{

    public static void demo4(int a, int b){
        System.out.println(a+b);
    }

    public static void demo4(int a, int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args){
        demo4(30,50);
        demo4(50,80,40);
    }
}