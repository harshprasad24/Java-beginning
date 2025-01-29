
import java.util.Scanner;

public class problem48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row : "); 
        int x = sc.nextInt();
        System.out.print("Enter the size of column : "); 
        int y = sc.nextInt();
        int arr[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Enter the value {"+i+j+"}:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the element to search : "); 
        int k = sc.nextInt();
        search(arr, x, y, k);
    }
    public static void search(int arr[][],int x, int y,int k) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(arr[i][j]==k){
                    System.out.print("The address is : {"+i+j+"}");
                }
            }
        }
    }
}
