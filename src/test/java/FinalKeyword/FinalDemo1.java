package FinalKeyword;

//Example of final variable value can not be changed
public class FinalDemo1 {
  final int number = 10;
   //int number = 10;

    public void demo1(){
         //number = 20; // you can not change the value of final variable
        System.out.println(number);
    }
    public static void main(String[] args){
         FinalDemo1 obj = new FinalDemo1();
         obj.demo1();
    }
}



//Example of final method can not be override
class Bike{

   final public void run(){
        System.out.println("Bike is running");
    }
} //Bike class end

class Splendor extends Bike{
     //public void run(){     // final run method can not be overriden
       //System.out.println("Splendor is running");
    //}
    public static void main(String[] args){
         Splendor obj = new Splendor();
         obj.run();
    }
}

//example of final method inheritance is possible
class Ketan{
   final public void demo1(){
        System.out.println("Ketan property");
    }
}
class Tia extends Ketan{
    public static void main(String[] args) {
        Tia obj = new Tia();
        obj.demo1();
    }
}

//Example of final class can not be able to extend.
 final  class Parent{
    public void property(){
        System.out.println("It is my parent property");
    }
}

//class Children extends Parent