
import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No:");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}
