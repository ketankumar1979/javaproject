package InheritanceDemo;

//Example of Hierarchical inheritance
public class MainBank {
    public void mainBranch(){
        System.out.println("This is the main bank");
    }
}
class Hsbc extends MainBank{
    public void branch(){
        System.out.println("This is the hsbc bank");
    }
}
class Lloyds extends MainBank{
    public void subBranch(){
        System.out.println("This is the Lloyds bank");
    }
    public static void main(String[] args){
        Lloyds obj = new Lloyds();
        obj.mainBranch();
        obj.subBranch();
        // you can not able to call Hsbc bank method
    }
}
