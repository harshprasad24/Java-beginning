import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st No:");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd No:");
        int y = sc.nextInt();
        System.out.print("Enter the 3rd No:");
        int z = sc.nextInt();
        if(x>y){
            if(x>z){
                System.out.println(x+"is greater.");
            }else{
                System.out.println(z+"is Greater.");
            }
        }else{
            if(y>z){
                System.out.println(y+"is Greater");
            }else{
                System.out.println(z+"is Greater");
            }
        }
    }
}
