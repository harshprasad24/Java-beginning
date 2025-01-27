
import java.util.Scanner;

public class problem44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the value of elements: ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        delete(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }
    public static int[] delete(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to delete: ");
        int y = sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==y){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        return arr;
    }
}
