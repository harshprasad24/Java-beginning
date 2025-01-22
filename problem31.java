
import java.util.Scanner;

public class problem31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no");
        int x = sc.nextInt();
        int sum = sumofdigits(x);
        System.out.println("The sum is : "+sum);
        
    }
    public static int sumofdigits(int x){
        int sum =0;
        while(x>0){
            int a=x%10;
            sum+=a;
            x/=10;
        }
        return sum;
    }
}
