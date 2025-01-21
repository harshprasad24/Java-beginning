
import java.util.Scanner;

public class problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last no: ");
        int n = sc.nextInt();
        factorial(n);
    }
    public static void factorial(int n) {
        int mul=1;
        for(int i = 1;i<=n;i++){
            mul*=i;
        }
        System.out.println(mul);
    }
}
