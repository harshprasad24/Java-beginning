import java.util.Scanner;

public class problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int x = sc.nextInt();
        int sum = Armstrong(x);
        if(sum==x){
            System.out.print("The no is amstrong");
        }else{
            System.out.print("Not amstrong");
        }
    }
    public static int length(int x){
        int length=0;
        while(x>0){
            x/=10;
            length++;
        }
        return length;
    }
    public static int Armstrong(int x) {
        int sum =0;
        int length=length(x);
        while(x>0){
            int a = x%10;
            sum +=(int)Math.pow(a,length);
            x/=10;
        }
        return sum;
    }
}
