package oops;

class enpdemo {

    public String name;
    private int balance;
    protected int ac_no;

    void setname(int balance)
    {
        this.balance=balance;

    }
    int getBalance() {
        return balance;

    }
    public void details() {
        System.out.println("name"+this.name);
        System.out.println("ac_no"+ac_no);
        System.out.println("balance"+balance);
    }
}

public class Demoencap{

    public static void main(String[] args) {
        enpdemo e = new enpdemo();
        e.name = "rajiv";
        e.ac_no = 19009281;
        e.setname(3000);
        e.getBalance();
        e.details();


    }
}
