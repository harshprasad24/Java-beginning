
import java.util.Scanner;

public class types {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float f = input.nextFloat();
        double d = input.nextDouble();
        boolean b =input.nextBoolean();
        input.next();
        String s = input.nextLine();
        System.out.println("Integer "+n);
        System.out.println("Float "+ f);
        System.out.println("double "+d);
        System.out.println("bollean "+b);
        System.out.println("String "+s);
    }
}
