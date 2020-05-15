package SuperKeyword;

//Example of super keyword referring parent class instance variable
public class Animal {
   String color = "White";
}//Animal end

class Dog extends Animal {
    String color = "Black";

   public void printColor(){
       System.out.println(color);
       System.out.println(super.color);
   }

   public static void main(String[] args){
       Dog obj = new Dog();
       obj.printColor();
   }
}
