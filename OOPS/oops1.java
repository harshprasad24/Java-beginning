public class oops1{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // create a pen object called p1
        p1.setcolor("SAFFRON");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setcolor("Yellow");
        System.out.println(p1.getColor());
        BankAccount myAcc = new BankAccount();
        myAcc.username = "HARSH PRASAD";
        // myAcc.password ="Harsh@2408"; // not accesable as it is private 
        myAcc.setpassword("Harsh@2408");
        System.out.println(myAcc);
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }
}

class Pen{
    //prop + funx
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    
    int getTip(){
        return this.tip;
    }

    void setcolor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}