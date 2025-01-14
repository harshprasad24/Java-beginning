
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st side of :");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd side of :");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd side of :");
        int c = sc.nextInt();
        System.out.print("Enter the 4th side of :");
        int d = sc.nextInt();
        int p = a+b+c+d;
        System.out.println("PERIMETER:"+p);
    }
}
