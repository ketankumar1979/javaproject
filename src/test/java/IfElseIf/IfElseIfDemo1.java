package IfElseIf;

public class IfElseIfDemo1 { //class starts
    public static void main(String[] args){ //main method starts

        double time = 15.00; // local variable

        if (time>=06.00 && time<=12.00){ // if condition - 1 start
            System.out.println("its morning");
        } // if condition - 1 finished

        else if (time>=12.00 && time<=17.00){ // if condition - 2 start
            System.out.println("its afternoon");
        } // if condition - 2 finished

        else if (time>=17.00 && time<=20.00){ // if condition - 3 start
            System.out.println("its evening");
        } // if condition - 3 finished

        else{ // else block start

            System.out.println("its night");
        } //else block is finished
    } //main method is finished
} // class is finished


// Home work - Create if-else-if condition statement when 1. Marks in between 35 and 60 then "its A grade"
//2. Marks in between 60 and 70 then "its First class"
//3. Marks above 70 then "Its Distinction"
