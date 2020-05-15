package LoopDemo;

public class ForLoopDemo1 {

    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}

class ForLoopDemo2{
    public static void main(String[] args){
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println(i+j);
            }
        }
    }
}
class ForLoopDemo3{
    public static void main(String[] args){
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println(i+" "+j);
                //for (int k=1;k<=3;k++){
                    //System.out.println(i+" "+j+" "+k);
                //}
            }
        }
    }
}
//use for loop to print 1 to 10 number
// use two loop to print numbers within 1 and 3
//use three loop to print numbers within 1 and 3

class WhileDemo1{
    public static void main(String[] args){
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }
    }
}
// home work to print 10 numbers by using while loop.

class DoWhileDemo{
    public static void main(String[] args){
        int i=1;
        do{
            System.out.println(i);
            i++;

        }
        while (i<=5);
    }

}
//homework to print 1 to 8 numbers by using do-while loops.

class BreakWithForLoop{
    public static void main(String[] args){
        for (int i=1;i<=10;i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
class BreakWithWhileLoop{
    public static void main(String[] args){
        int i=1;
        while (i<=5){
            if (i==3){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
class BreakWithDoWhileLoop{
    public static void main(String[] args){
        int i=1;
        do{
            if (i==3){
                break;
            }
            System.out.println(i);
            i++;

        }while (i<=5);
    }

}
/* when you use continue then it will continue to print all the number as per condition it will not break

 */