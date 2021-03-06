package Encapsulation;

public class EncapsulationDemo1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        EncapsulationDemo1 obj = new EncapsulationDemo1();
        obj.setName("Ketan");
        System.out.println(obj.getName());
    }
}

class EncapsulationDemo2{
     private int accountno;
     private int balance;

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public static void main(String[] args){
        EncapsulationDemo2 obj = new EncapsulationDemo2();
        obj.setAccountno(12345678);
        obj.setBalance(500000);

        System.out.println(obj.getAccountno());
        System.out.println(obj.getBalance());
    }
}
class EncapsulationDemo3{

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}