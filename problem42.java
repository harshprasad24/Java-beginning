import java.util.Scanner;

public class problem42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the value of elements: ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int max = maximum(arr);
        int min = minimum(arr);
        System.out.print("The max no is: "+max+"\nThe min no is: "+min);
    }
    public static int maximum(int[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] arr) {
        int min=arr[0] ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
