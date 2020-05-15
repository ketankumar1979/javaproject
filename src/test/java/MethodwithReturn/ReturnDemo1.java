package MethodwithReturn;

//Example of Return method with arguments
public class ReturnDemo1 {

    public int demo1(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        ReturnDemo1 obj = new ReturnDemo1();
        System.out.println(obj.demo1(30,50));

    }
}




//Example of return method
class Return1{

    public String  demo2(){
        String fname = "Ketan";
        String lname = "Patel";
        return fname + " " + lname;
    }

    public static void main(String[] args){
        Return1 obj = new Return1();
       System.out.println(obj.demo2());

    }
}

// if you can not declare return word then you can not able to print in main method.
//only you can able to call that method.