package Practice;

public class PracticeDemo { //start of PracticeDemo class

    int a = 10;
    int b = 20;
    int c = a+b;

    public void demo1(){//demo1 method start

        System.out.println(c);
    }//demo1 is finished

    public static void main(String[] args){//main method start

        PracticeDemo obj = new PracticeDemo();
        obj.demo1();
    }//main method finished

}//End of PracticeDemo class

class Parent{//Parent class start

    public void property(){//property method start

        System.out.println("This is my parent property");
    }//property method finished

}//Parent class finished

class Children extends Parent{//Children class start

    public static void main(String[] args){//main method start

        Children obj = new Children();
        obj.property();
    }//main method finished
}//children class finished
