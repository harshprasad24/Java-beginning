import java.util.Scanner;

public class problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int x = sc.nextInt();
        fibonacci(x);
    }
    public static void fibonacci(int x) {
        int a =0;
        int b= 1;
        System.out.print(a);
        System.out.print(",");
        System.out.print(b);
        for(int i=0;i<=x;i++){
            int c = a+b;
            System.out.print(",");
            System.out.print(c);
            a=b;
            b=c;
        }
    }
}
