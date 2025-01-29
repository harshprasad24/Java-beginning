import java.util.Scanner;

public class problem49 {
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
        int a = arraysum(arr, x, y);
        double b = arrayaverage(arr, x, y);
        System.out.print("The sum of array is: "+a+"\nThe average is : "+b);
    }
    public static int arraysum(int arr[][],int x,int y) {
        int sum =0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) { 
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
    public static double arrayaverage(int arr[][],int x,int y) {
        double average =1;
        int z = x*y;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int a = arraysum(arr, x, y);
                average = a/z;
            }
        }
        return average;
    }
}
