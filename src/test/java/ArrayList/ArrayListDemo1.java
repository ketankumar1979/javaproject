package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>(); //creating Arraylist
        //Add items
        cars.add("volvo"); //0 index
        cars.add("BMW");//1 index
        cars.add("Ford"); //2 index
        System.out.println(cars);
        System.out.println(cars.get(0)); //print car by index

        //use for each loop to print all cars
        for (String car : cars){
            System.out.println(car);
        } //for each loop end

    } //main method end
} //class end

//Example of declaring wrapper class in list
class ArrayListDemo2{
    public static void main(String[] args){

        //Using Wrapper class to declare list
        ArrayList<Byte> numbers = new ArrayList<>();
        ArrayList<Short> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Long> numbers3 = new ArrayList<>();
        ArrayList<Float> numbers4 = new ArrayList<>();
        ArrayList<Double> numbers5 = new ArrayList<>();
        ArrayList<Character> numbers6 = new ArrayList<>();
        ArrayList<Boolean> numbers7 = new ArrayList<>();
    }
}

//Example of sorting array in alphabatical order
class ArraListDemo3{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>(); //creating Arraylist
        //Add items
        cars.add("volvo"); //0 index
        cars.add("BMW");//1 index
        cars.add("Ford"); //2 index

        Collections.sort(cars); //sort cars

        for (String i : cars){
            System.out.println(i);
        }
    }
}

//sort numbers in Ascending orders and Descending orders

class ArraListDemo4 {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(); //creating Arraylist
        //Add items
        numbers.add(15); //0 index
        numbers.add(26);//1 index
        numbers.add(8); //2 index

        //Collections.sort(numbers); //sort numbers in Ascending orders
        Collections.sort(numbers,Collections.reverseOrder()); //sort numbers in Descending orders

        for (int number : numbers){
            System.out.println(number);
        }//for each loop end

    }//main method end
}//class end
