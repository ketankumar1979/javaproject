package InheritanceDemo;

public class VariableAction {

     int a = 10;
     int b = 20;

    public void demo1(){
        System.out.println(a+b);
    }
}

class MultiplyAction extends VariableAction{
    public void demo2(){
        System.out.println(a*b);
    }
}

class MinusAction extends MultiplyAction{
    public void demo3(){
        System.out.println(a-b);
    }

    public static void main(String[] args){
        MinusAction obj = new MinusAction();
        obj.demo1();
        obj.demo2();
        obj.demo3();
    }
}

