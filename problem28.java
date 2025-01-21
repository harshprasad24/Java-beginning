
import java.util.Scanner;

public class problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int x = sc.nextInt();
        table(x);
    }
    public static void table(int x) {
        for(int i=1;i<=10;i++){
            System.out.println(x+"*"+i+"="+(x*i));
        }
    }
}
