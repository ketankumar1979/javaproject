package IfElse;

class ifElseDemo{

    public static void main(String [] args){
        int mark = 45;

        if(mark>=50){ // if block start
            System.out.println("pass");
        } //if block is finished
        else { // else block is start
            System.out.println("Fail");
        } //else block is finished
    }
}

public class IfDemo { //class bracket start

    public static void main(String[] args){ //Main method bracket start
        int age = 21; //local variable inside the main method

        if (age>=18){ //if block bracket start
            System.out.println("Eligible for vote");
        } //if block bracket finished

    } //Main method bracket finished
} //class bracket finished

class IfDemo1{
   static int marks = 35; //static variables
    public static void main(String[] args){
        if (marks<35){
            System.out.println("Fail");
        }
    }
}

//Homework of if condition. Execute three program with local, instance and static variable.

class IfElseDemo1{ //class bracket start
    static int marks = 50; //static variable inside the class and outside of main method

    public static void main(String[] args){ //Main method bracket start
        if (marks>=35){ //if block bracket start , and calling static variable marks inside main(static) method
            System.out.println("Pass");
        } //if block bracket finished
        else { //else block bracket start
            System.out.println("Fail");
        } //else block bracket finished
    } //Main method bracket finished
} //class bracket finished

class IfElseDemo2 {

    public static void main(String[] args) {
        float sugarlevel = 6.5f; // local variables

        if (sugarlevel >= 6.5 || sugarlevel>=10.00) { // use of logical operator - OR  - ||   )
            System.out.println("Type-1 Diabetes"); // code to execute when one condition is true
        } // if block is completed
        else {
            System.out.println("No Diabetes"); // code to execute when no of the condition is true
        }
    }
}

class IfElseDemo3{

    public static void main(String[] args){
        float sugarlevel = 6.5f; //local variable

        if (sugarlevel>=6.5 && sugarlevel<=7.5){ // use of logical operator -  AND  -  &&
            System.out.println("Type-1 Diabetes"); // code to execute when both condition are true
        }
        else {
            System.out.println("No Diabetes"); // code to execute when none or one of the condition is true
        }
    }
}

//example of calling user define method in main method by object
class IfElseDemo4{ // class is start

    public void demo4(){ // user define method start
        float sugarlevel = 6.5f; // local variable
        if (sugarlevel>6.0 && sugarlevel !=6.5){ //if block is start
            System.out.println("Type-1 Diabetes");
        } //if block is finished
        else { //else block is start
            System.out.println("No Diabetes");
        } //else block is finished
    } //user define method is finished

    public static void main(String[] args){ //main method is start
        IfElseDemo4 obj = new IfElseDemo4(); //creating the object = obj
        obj.demo4(); //calling user define method by object = obj
    } //main method is finished
}//class is finished

class IfElseDemo5{
    public static void main(String[] args){
        float sugarlevel = 6.5f; // local variable
        if (sugarlevel>6.5 || sugarlevel==6.5){
            System.out.println("Type-1 Diabetes");
        }else {
            System.out.println("No Diabetes");
        }
    }
}
class IfElseDemo6{
    public static void main(String[] args){
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Its Leap year");
        }else {
            System.out.println("Its not leap year");
        }
    }
  }
class IfElseDemo7{
    public static void main(String[] args){
        int year = 2020;
        if (year % 4 == 0 || year % 100 == 0){
            System.out.println("Its Leap year");
        }else {
            System.out.println("Its not leap year");
        }
    }
}




//Home work 1. use if else condition to print whether it is even number or odd number where int number = 78;
//2. create if-else blood pressure in between 50 and 100 then "its low blood pressure"
// if blood pressure in between 100 and 200 then "its high blood pressure"
