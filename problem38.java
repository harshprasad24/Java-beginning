import java.util.Scanner;

public class problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        if (Palindrome(x)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean Palindrome(int x) {
        int original = x; 
        int reverse = 0;
        
        while (x > 0) {
            int a = x % 10;
            reverse = reverse * 10 + a;
            x /= 10;
        }
        
        return original == reverse;
    }
}
