package ObjectDemo;

//Example of object initialization by reference variable.
//Example of instance variable access in main method.
public class Student {
    int id = 10;
    String name = "Rohit";

    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s1.id);
        System.out.println(s1.name);

    }

}

//Example of multiple objects and initialization by variable
class Student1{
    int id;
    String name;
    public static void main(String[] args){
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student1 s3 = new Student1();
        s1.id = 20;
        s1.name = "Ketan";
        s2.id = 30;
        s2.name = "Saj";
        s3.id = 40;
        s3.name = "Mike";
        System.out.println(s1.id +" "+ s1.name);
        System.out.println(s2.id +" "+ s2.name);
        System.out.println(s3.id +" "+ s3.name);

    }
}

//Example of accessability of instance variable
class ObjectDemo{
    int a = 10;
    int b = 20;
    int c = a+b;
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo();
        System.out.println(obj.c);

    }

}

//Example of calling method by object.
class ObjectDemo1{
    int a = 10;
    int b = 20;
    int c = a+b;

    public static void main(String[] args){
        ObjectDemo1 obj = new ObjectDemo1(); //This is a cration of object by classname
        obj.Demo1();
        obj.Demo3();
    }
    public void Demo1(){  //This is a user define  method
        System.out.println(c);
    }
    public void Demo3(){
        System.out.println(b/a);
    }
}

//Example of calling method with arguments by object.
class ObjectDemo2{
    public static void main(String[] args){
        ObjectDemo2 obj = new ObjectDemo2();
        obj.demo2(20,10);
        obj.demo2(30,40);
        obj.demo2(50,60);
    }
    public void demo2(int a, int b){
        //System.out.println(a);
        //System.out.println(b);
        System.out.println(a+b);
    }
}


