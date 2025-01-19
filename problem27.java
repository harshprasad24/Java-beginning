
import java.util.Scanner;

public class problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. to check :");
        int x = sc.nextInt();
        if ((x & 1) == 1){
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }
    }
}
