import java.util.Scanner;

public class problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        left_triangle(x);
        System.out.println();
        upper_left_triangle(x);
        System.out.println();
        right_triangle(x);
    }
    public static void left_triangle(int x) {
        for (int i =0;i<=x;i++){
            for(int j =0;j<=i;j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
    public static void upper_left_triangle(int x) {
        for (int i =0;i<=x;i++){
            for(int j =5;j>=i;j--){
                System.out.print("x");
            }
            System.out.println();
        }
    }
    public static void right_triangle(int x) {
        for (int i =0;i<=x;i++){
            for(int j =5;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
