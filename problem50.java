import java.util.Scanner;

public class problem50 {
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
        int a = diagonalsum(arr, x, y);
        System.out.print("The sum of diagonal is : "+a);
    }
    public static int diagonalsum(int arr[][],int x,int y) {
        int sum =0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(i==j || i+j==x-1){
                    sum=sum +arr[i][j];
                }
            }
        }
        return sum;
    }
}
