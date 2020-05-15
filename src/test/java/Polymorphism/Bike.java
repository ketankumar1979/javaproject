package Polymorphism;

public class Bike {

    public void run(){
        System.out.println("Bike is running");
    }
}//Bike class end

class Splendor extends Bike{
    public  void run(){
        System.out.println("Splendor is running");
    }

    public static void main(String[] args){
        Bike obj = new Splendor();//Up casting
        obj.run();
    }
}
//Abstract class in java
//abstract
//extends
