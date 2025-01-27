
import java.util.Scanner;

public class problem46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int x = sc.nextInt();
        int arr[]= new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        boolean palindrome = palindrome(arr);
        if(palindrome){
            System.out.println(" Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }
    
    }
    public static boolean  palindrome(int arr[]) {
        int i=0;
        while(i<(arr.length-1)/2){
            if(arr[i]==arr[arr.length-i-1]){
                return false;
            }
            i++;
        }
        return false;
    }
}
