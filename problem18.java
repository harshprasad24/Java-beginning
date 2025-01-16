import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the YEAR to check:");
        int x = sc.nextInt();
        if(x % 4==0){
            System.out.println("LEAP YEAR");
        }else if(x % 100 ==0){
            System.out.println("NON LEAP YEAR");
        }else if (x%400 ==0) {
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("NON LEAP YEAR");
        }
    }
}
