package ArraySingleDimension;

import java.util.Arrays;
import java.util.Collections;

//Example of single dimension array
public class SingleDimension1 {

    public static void main(String[] args){
        int arr[] = new int[5]; //declaration and instantiation of array
        arr[0] = 10; //initialization
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //arr[5] = 60; //Array index out of bounds exception
        System.out.println(arr.length);
        System.out.println(arr[0]);//arr of 0
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //for (int i = 0;i<arr.length;i++) {
           // System.out.println(arr[i]);
       // }
        //for each loop
        for (int i : arr){ //i of arr
            System.out.println(i);
        } //for each loop end

    } //main method end
}

//Declaratio, Instantiation and initialization of array
class SingleDimension2{
    public static void main(String[] args){
        int arr[] = {33,3,4,40}; //declaration,instantiation and initialization
        for (int i : arr){
           System.out.println(i);
        }

    }
}








//Example of multidimension array
class Multidimension1{
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;


        for (int i = 0;i<arr.length;i++){//1st for loop start

           for (int j = 0;j<arr.length;j++) {//2nd for loop start
                System.out.println(arr[i][j]);
            }//2nd for loop end

        }//1st for loop end
    }
}

//Example of finding odd and even numbers from array
class OddEvenNumber {
    public static void main(String[] args){

        int arr[] = {2,5,55,89,60,50}; //declaration,instantiation and initialization

        for (int i : arr){ //for each loop start

            if (i%2!=0){ //if block start
                System.out.println(i);
            } //if block end

        } //for each loop end

    } //main method is end
} //class is end


//sorting array in ascending orders
class AscendingOrder {
    public static void main(String[] args){
        int arr[] = {33,3,4,40,50,35,69}; //declaration,instantiation and initialization

        Arrays.sort(arr); //sort array in ascending orders

        for (int i : arr){
            System.out.println(i);
        }

    }
}


//find minimum and maximum number from array
class MinMax{

    public static void main(String[] args){
        int[] arr = {-6,-4,30,8,50,10};

        Arrays.sort(arr);//sort method to sort the array into ascending order

        System.out.println(arr[0]); //min number

        System.out.println( arr[arr.length-1]); //max number
    }
}

//we will learn in Arraylist
//example of sorting array in Descanding order
class SingleDimension5{

    public static void main(String[] args){
        int arr[] = {33,3,4,40,50,35,69}; //declaration,instantiation and initialization

        //covert int into Integer (Wrapper class)
        Integer a[] = new Integer[] {33,3,4,40,50,35,69};
        Arrays.sort(a,Collections.reverseOrder()); //sort array in descanding order

        for (int i : a){
            System.out.println(i);
        }

    }
}