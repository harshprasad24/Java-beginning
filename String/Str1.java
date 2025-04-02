import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();  // Reads a single word
        System.out.println("You entered: " + name);

        sc.close(); // Closing the scanner
    }
}
