
import java.util.Scanner;

public class problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd no: ");
        int y = sc.nextInt();
        int lcm = lcm(x,y);
        System.out.println("The lcm is : "+lcm);
    }
    public static int lcm(int x,int y) {
        int i = 1;
        while(true){
            int lcm = x*i;
            if(lcm%y==0){
                return lcm;
            }
            i++;
        }
    }
}
