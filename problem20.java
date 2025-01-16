import java.util.Scanner;

public class problem20 {
        public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the AGE to check:");
        int x = sc.nextInt();
        if(x >=60){
            System.out.println("SENIOR");
        }else if(x >=20){
            System.out.println("ADULT");
        }else if (x>=13) {
            System.out.println("TEEN");
        }else{
            System.out.println("CHILD");
        }
    }
}
