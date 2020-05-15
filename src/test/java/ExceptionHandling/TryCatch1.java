package ExceptionHandling;

import java.util.ArrayList;

public class TryCatch1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0 index
        numbers.add(20); //1 index
        numbers.add(30); //2 index

       try { //try block start
            System.out.println(numbers.get(3));
        } //try block end

       catch (Exception e){ //catch block start
            System.out.println("Something went wrong");
       }//catch block end

        System.out.println(numbers.get(2));
    }
}

class FinallyException{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        try {
            System.out.println(numbers.get(3));
        }//try end
        catch (Exception e){
            System.out.println("Something went wrong");
        }//catch end

        finally {
            System.out.println("try catch block is finished");
        }//finally end

        System.out.println("Rest of the code is executed");
    }
}

