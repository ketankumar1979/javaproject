package Abstract;

//Example of abstract class and abstract method inside.
public abstract class Bike { //abstract class start

   public abstract  void run();// abstract method without body

} //abstract class finished

class Splendor extends Bike { // you will get red line. pls continue

    public void run(){
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Splendor obj = new Splendor();
        obj.run();
    }
}


//Example of abstract class and user define method inside.
abstract class Parent{ //Parent class start

  public abstract void property(); //abstract method

  public void balance(){ //user defined method start
      System.out.println("Parent balance");
  } //user defined method finished

} //Parent class finished
class Childrent extends Parent{

    public void property(){
        System.out.println("This is parent property");
    }

    public static void main(String[] args){
        Childrent obj = new Childrent();
        obj.property();
        obj.balance();
    }
}
//Interface
//ketan
//patel

