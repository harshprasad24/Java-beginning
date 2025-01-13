
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + " also tell me your age :");
        int age = sc.nextInt();
        System.out.print("Enter your income:");
        float income = sc.nextFloat(); 
        System.out.print("Hi,\n"+name+"\nYour age is:" + age+"\nYour income is:" + income);
        
    }
}
