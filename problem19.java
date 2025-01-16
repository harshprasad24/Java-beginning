import java.util.Scanner;

public class problem19 {
        public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the MARKS to get Grade:");
        int x = sc.nextInt();
        if(x >90){
            System.out.println("GRADE A");
        }else if(x >75){
            System.out.println("GRADE B");
        }else if (x>60) {
            System.out.println("GRADE C");
        }else if(x>30){
            System.out.println("GRADE D");
        }else{
            System.out.println("GRADE F");
        }
    }
}
