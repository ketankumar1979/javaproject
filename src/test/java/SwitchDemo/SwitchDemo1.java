package SwitchDemo;

public class SwitchDemo1 {

    public static void main(String[] args) {
        int age = 18;
        switch(age) { // Switch block start
            case 16:
                System.out.println("you are under 18");
                break;
            case 18:
                System.out.println("you are eligible for vote");
                //break;
            case 25:
                System.out.println("you are above 18");
                //break;
            default:
                System.out.println("you are not eligible for vote");
        } // switch block is completed
    } // main method is finished
} // class finished
//without break example
class SwitchDemo2{
    public static void main(String[] args){
        int month = 6;
        switch (month){
            case 1:
                System.out.println("january month");
            case 2:
                System.out.println("february month");
            case 3:
                System.out.println("march month");
            case 4:
                System.out.println("april month");
            case 5:
                System.out.println("may month");
            case 6:
                System.out.println("june month");
            case 7:
                System.out.println("july month");
            case 8:
                System.out.println("august month");
            case 9:
                System.out.println("september month");
            case 10:
                System.out.println("october month");
                default:
                    System.out.println("Invalid  Month");

        }
    }
}
// home work in the class
//1. identify Vowel or Constant character
// include a,e,i,o,u as case value and create 4 switch programme
// Give variable value as a,e,i,o,u.
//Homework
//1. Marks = 30 then fail, Marks = 35 then pass, Marks = 60 then first class, Marks = 70 then distinction.
// include 30,35,60,70 as case value and create 4 switch programme.
// give variable value as 30,35,60,70.
