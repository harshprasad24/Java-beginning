import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the DEGREE in FAHRENHEIT:");
        float f = sc.nextFloat();
        double c = (f-32)*5/9;
        System.out.println("DEGREE IN CELSIUS:"+c);
    }
}
