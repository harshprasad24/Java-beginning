
import java.util.Scanner;

public class calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no:");
        int x = sc.nextInt();
        System.out.print("Enter the first no:");
        int y = sc.nextInt();
        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.print(x+y);
                        break;
            case '-' : System.out.print(x-y);
                        break;
            case '*' : System.out.print(x*y);
                        break;
            case '/' : System.out.print(x/y);
                        break;
            case '%' : System.out.print(x%y);
                        break;
            default: System.out.println("Invalid Operator");
        }
    }
}
