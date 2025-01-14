
import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the no to check:");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("POSITIVE");
        }else if(x<0){
            System.out.println("NEGATIVE");
        }else{
            System.out.println("ZERO");
        }
    }
}
