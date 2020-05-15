package StringMethods;

public class StringDemo1 {
    public static void main(String[] args){
        char[] ch = {'k','e','t','a','n'};
        String s = new String(ch);
        System.out.println(s);
    }
}

class StringDemo2{
    public static void main(String[] args){
        String s1 = "ketan";
        String s2 = "patel";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());//it will eliminate white spaces before and after string
        System.out.println(s1.startsWith("ket"));
        System.out.println(s1.endsWith("an"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s1.replace("ketan"," Saran"));
        System.out.println(s1.contains("ta"));
        System.out.println(s1.concat(s2));
    }
}
//venus patel
//tia patel
//ketan patel
