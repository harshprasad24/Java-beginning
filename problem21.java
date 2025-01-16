
import java.util.Scanner;

public class problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st No.");
        int x = sc.nextInt();
        System.out.print("Enter the 1st No.");
        int y = sc.nextInt();
        int result = x & y;
        System.out.println("RESULT:" + result);
    }
}
