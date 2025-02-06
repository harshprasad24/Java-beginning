import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("The no is prime");
        }else{
            System.out.println("No is not prime ");
        }
    }
}
