package Interface;

//Example of interface with only abstract method
public interface Bike {

    public abstract void run();

}//end of Bike class

class Splendor implements Bike{
    public void run(){
        System.out.println("Running safely");
    }

    public static void main(String[] args){
        Splendor obj = new Splendor();
        obj.run();
    }
}
//Example of multiple inheritance by interface
interface GrandParent{
    public abstract void property();
}
interface Parent{
    public abstract void balance();
}
interface Children extends GrandParent,Parent{
    public abstract void account();
}
class Grandchildren implements Children{
    public void property(){
        System.out.println("This is Grandparent property");
    }
    public void balance(){
        System.out.println("This is Parent balance");
    }
    public void account(){
        System.out.println("This is Childrent account");
    }
    public static void main(String[] args){
        Grandchildren obj = new Grandchildren();
        obj.property();
        obj.balance();
        obj.account();
    }
}

interface animal{
    public abstract void demo1();
}
interface dog extends animal{
    public abstract void demo2();
}

class babydog implements dog{
    public void demo1(){
        System.out.println("hello");
    }
    public void demo2(){
        System.out.println("hello guys");
    }
}

//Encapsulation
//setter and getter