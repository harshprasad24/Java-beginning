import java.util.Scanner;

public class problem43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the value of elements: ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int count = sorted(arr);
        if(count>0){
            System.out.println("Not Sorted");
        }else{
            System.out.println("Sorted");
        }
    }
    public static int sorted(int[] arr) {
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        return count;
    }
}
