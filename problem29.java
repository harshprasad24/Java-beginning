
import java.util.Scanner;

public class problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last no: ");
        int n = sc.nextInt();
        add(n);
    }
    public static void add(int n) {
        int sum = 0;
        for(int i =0;i<=n;i++){
            sum=+i;
        }
        System.out.println(sum);
    }
}
