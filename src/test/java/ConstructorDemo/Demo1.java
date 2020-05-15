package ConstructorDemo;

//Example of default constructor
public class Demo1 {


  public  Demo1(){  //Default constructor
        System.out.println("constructor demo");
    }

    public static void main(String[] args){
        Demo1 obj = new Demo1();   //when we create object the constructor construct the value.
    }
}





// Example of parameterised constructor
class Demo2{

   public Demo2(int a, int b){  // parameterised constructor
        System.out.println(a/b);
    }
    public static void main(String[] args){
        //creating object and constructor construct the value.
        Demo2 obj = new Demo2(100,20);
        Demo2 obj1 = new Demo2(200,40);
    }

}






// Example of access instance variable by this keyword  with parameterise construction
class Demo3{
    int a;
    int b;

   public Demo3(int c, int d){
        this.a=c;
        this.b=d;
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Demo3 obj = new Demo3(30,40);
    }
}



class Demo4{
    int a;
    int b;

    public Demo4(int a, int b){
        a=a;
        b=b;
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Demo4 obj = new Demo4(50,60);
    }
}





/*homework for constructor
1. write one programme to explain default constructor
2. print age = 18 and  name = Rohit and class = physics
    print age = 20 and name = Raj and class = chemistry
    print age = 30 and name = Mohan and class = maths
    by using parameterisation constructor
 3. write one program to explain the accessibility of instance variable by parameterisation constructor.
 */


