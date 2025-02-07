import java.util.*;
public class jp6 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1: Hello");
        System.out.println("2: Namaste");
        System.out.println("3: Bhonjour");
        int button =sc.nextInt();
        switch (button) {
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
             break;
            case 3:
            System.out.println("Bhonjour");
            break;        
            default:
            System.out.println("Invalid");
            break;
        }
    }
}
 