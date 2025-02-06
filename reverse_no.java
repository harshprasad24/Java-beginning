
import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 125478;
        reverse(x);
        System.out.println();
        reverse_given(x);
    }
    public static void reverse(int x) {
        while(x>0){
            int a = x%10;
            System.out.print(a);
            x/=10;
        }
    }
    public static void reverse_given(int x) {
        int rev =0;
        while(x>0){
            int lastdigit = x%10;
            rev = (rev*10)+lastdigit;
            x/=10;
        }
        System.out.println(x+","+rev);
    }
}
