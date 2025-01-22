
import java.util.Scanner;

public class problem34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int x = sc.nextInt();
        prime(x);
    }
    public static int prime(int x) {
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime no");
        }else{
            System.out.println("not a Prime no");
        }
        return x;
    }
}
