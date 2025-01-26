
import java.util.Scanner;

public class problem40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the value of elements: ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int sum = sum(arr);
        int average = average(arr);
        System.out.println("The sum is : "+sum+"\nAverage is : "+average);
    }
    public static int sum(int[] arr) {
        int sum =0;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int average(int[] arr) {
        int average =0;
        int x = sum(arr);
        average = x/arr.length;
        return average;
    }
}
