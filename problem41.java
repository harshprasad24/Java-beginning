import java.util.Scanner;

public class problem41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the value of elements: ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter which no to search : ");
        int y =sc.nextInt();
        int count = occurence(arr, y);
        System.out.print("No of occurence is : "+count);
    }
    public static int occurence(int[] arr,int y) {
        int count =0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==y){
                count++;
            }
        }
        return count;
    }
}
