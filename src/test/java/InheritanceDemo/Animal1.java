package InheritanceDemo;
//Example of Multilevel inheritance
public class Animal1 { //superclass (parentclass)
    public void eat(){
        System.out.println("eating");
    }
}
class Dog1 extends Animal1{
    public void barking() {
        System.out.println("barking");
    }
}
class BabyDog1 extends Dog1{

    public void weep(){
        System.out.println("wheeping");
    }
    public static void main(String[] args){
        BabyDog1 obj = new BabyDog1();
        obj.weep();
        obj.barking();
        obj.eat();
    }
        }



