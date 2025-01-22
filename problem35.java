import java.util.Scanner;

public class problem35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int x = sc.nextInt();
        int reverse = reverse(x);
        System.out.println("The Reverse of no is : " + reverse);
    }
    public static int length(int x) {
        int length = 0;
        while (x != 0) {
            x /= 10;
            length++;
        }
        return length;
    }
    public static int reverse(int x) {
        int reverseno = 0;
        int length = length(x);
        while(x>0){
            int a = x%10;
            reverseno = reverseno + a*(int)Math.pow(10,length-1);
            x/=10;
            length--;
        }
        return reverseno;
    }
}
