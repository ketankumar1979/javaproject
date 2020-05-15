package StaticKeywordDemo;

//Example of calling static user define method without object
public class StaticKeywordDemo1 {

    public static void demo1() { //static user define method
        long a = 200;
        long b = 100;
        long c = 200/100;
        System.out.println(c);
    }
    public static void main(String[] args){
        demo1(); // calling static user define method without object
    }
}

//Example of calling static method with argument without object
class StaticKeywordDemo4{

    public static void demo4(int a , int b){  //static user define method with arguments
        System.out.println(a+b);
    }

    public static void main(String[] args){
        demo4(20,30); // calling static user define method with arguments in main method
    }
}

// Example of instance variable can not access in static user define method.
class StaticKeyworldDemo2{ //begining of the class

    //instance variables
    int a = 10;
    int b = 20;
    int c = a+b;

    public static void main(String[] args) { //main method. can not able to access instance variable
        StaticKeyworldDemo2 obj = new StaticKeyworldDemo2();
        obj.demo3();
     //System.out.println(c);
    }

        public static void demo2() { //static user define method. can not able to access instance variable
       //System.out.println(c);
    }

    public void demo3(){ //normal user define method. can able to access instance variable
        System.out.println(c);
    }

} // end of the class

//Example of static variable can be access from static user define method.
class StaticKeywordDemo3{

    //static variables
    static int a = 10;
    static int b = 20;
    static int c = a+b;

    public static void main(String[] args){ // main method can access the static variable as it is static method
        System.out.println(c);
    }

    public static void demo3(){ //static user define method can able to access static variable.
        System.out.println(c);
    }

    public void demo4(){ //normal user define method can access static variable as well.
        System.out.println(c);
    }

}
