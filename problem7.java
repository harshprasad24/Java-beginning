
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st No:");
        int x= sc.nextInt();
        System.out.print("Enter the 2nd No:");
        int y = sc.nextInt();
        System.out.println("first no:"+x+"\nSecond no:"+y);
        int z = x;
        x = y;
        y = z;
        System.out.println("Afer swaping");
        System.out.println("first no:"+x+"\nSecond no:"+y);
    }
}
