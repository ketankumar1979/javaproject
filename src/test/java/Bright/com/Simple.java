package Bright.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;

public class Simple {
    public static void main(String[] args){
        System.out.println("Hello world");
    }
    // Types of writing of normal Methods
    //1.  public void anyname()
    //2.  public static void anyname()
    //3. void anyname()
    //4. static void anyname()

    // Main method types of wrinting
   // 1.  public static void main(String []args)
    // 2. public static void main(String args[])
    //3. public static void main(String... args)


}
 class LocalDemo{
public static void main(String []args){
    int a = 10;
    int b = 20;
    int c = a+b;
    System.out.println(c);  
}
public void local(){
    //System.out.println(c);
    }
}

class InstanceVariableDemo{
    int d = 10;
    int e = 20;
    int f = d+e;

    public static void main(String args[]){
        //InstanceVariableDemo obj = new InstanceVariableDemo();
        //System.out.println(obj.f);
        //obj.instance();
        //System.out.println(f);

    }
    public void instance(){
        System.out.println(f);
    }
    //public void instance1(){
        //System.out.println(f);
    //}
}

class StaticVariableDemo{
  static int g = 10;
   static int h = 20;
   static int i = g+h;
   public static void main(String[] args){
       System.out.println(i);
       //staticdemo();
   }
   public  void staticdemo(){
       System.out.println(i);
    }
}
   class DatatypeDemo{

    public static void main(String []args){
        boolean b = true;
        boolean bool = false;
        char c = 'a';
        char ch = 'A';
        byte byt = -127;
        short sh = 14566;
        int in = 189;
        long lg = 5478954;
        long l = 587458L;
        long l1 = 5874589l;
        float f = 26.89589f;
        double d = 1589.254;
        double dou = 547821.589d;
        double d1 = 5246.3258D;
        String st = "name";
        //String s = name;
    }
  }
  class stringdemo{
    public static void main(String[] args){
        String firstname = "Ketan";
        String lastname = "Patel";
      System.out.println(firstname + "  " + lastname );
        System.out.println( "Ketan"   +   "Patel" );
        System.out.println(firstname + lastname);
        int a = 10;
        int b = 20;
        int c = a+b;
       System.out.println("total of a and b = " + c );
    }
  }





