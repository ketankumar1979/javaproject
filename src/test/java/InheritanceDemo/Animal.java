package InheritanceDemo;

//Example of Single inheritance
public class Animal { // super class start

    public void eat(){
        System.out.println("eating");
    }
} // super class finished

class Dog extends Animal{ // subclass extends the superclass

    public void bark(){ //define mathod start
        System.out.println("barking");
    } //define method finished

    public static void main(String[] args) { //main method start
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    } //main method finished
} //subclass is finished
