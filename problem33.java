
import java.util.Scanner;

public class problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd no: ");
        int y = sc.nextInt();
        int gcd = GCD(x, y);
        System.out.println("The Greatest comon divisor is: "+ gcd);
    }
    public static int GCD(int x,int y) {
        int gcd;
        if(x>y){
            while(x%y!=0){
                gcd=x%y;
                x=y;
                y=gcd;
            }
        }else{
            x =x+y;
            y=x-y;
            x = x-y;
            while(x%y!=0){
                gcd=x%y;
                x=y;
                y=gcd;
            }
        }
        return y;
    }
}
