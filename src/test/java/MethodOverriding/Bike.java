package MethodOverriding;

//Example of method overriding
public class Bike {

    public void run(){
        System.out.println("Bike is running safely");
    }

}//Bike class end

class Splendor extends Bike {
    public void run(){
        System.out.println("Splendor is running safely");
    }
    public static void main(String[] args) {
        Splendor obj = new Splendor();// child class ref variable refer child class object
       // Bike obj = new Splendor();
        //Bike obj = new Bike();
        obj.run();
    }
}//Splendor class end

//Method overriding is not possible by static method
class Parent{

    public static void property(){
        System.out.println("This is my parent property");
    }
}

class Children extends Parent{

    public static void property(){

        System.out.println("This is children  property");
    }

    public static void main(String[] args)
    {
        property();
    }
}

class Ketan{

    public void property(int a, int b){
    System.out.println(a+b);
    }
}
class Tia extends Ketan{
    public void property(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args){
        Tia obj = new Tia();
        obj.property(20,30);
    }
}

class Bank{
    public void getRateOfInterest(){
        System.out.println("Main bank rate of interest");
    }
}
class HSBC extends Bank{
    public void getRateOfInterest(){
        System.out.println( "Interest is = " + 1.6);
    }
    public static void main(String[] args){
        HSBC obj = new HSBC();
        obj.getRateOfInterest();
    }
}//HSBC CLASS IS END
class Barclay extends Bank{
    public void getRateOfInterest(){
        System.out.println("Interest is = " + 1.8);
    }
    public static void main(String[] args){
        Barclay obj = new Barclay();
        obj.getRateOfInterest();
    }
}//Barclay class is end
//Polymorphisam
