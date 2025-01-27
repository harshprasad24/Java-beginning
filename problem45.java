import java.util.Scanner;

public class problem45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the value of elements: ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int[] reversedArr = returnarray(arr, x);
        System.out.print("The reverse array is: ");
        for (int value : reversedArr) {
            System.out.print(value + " ");
        }
    }
    public static int[] returnarray(int[] arr, int x) {
        int[] arr1 = new int[x];
        for (int i = 0; i < x; i++) {
            arr1[i] = arr[x - 1 - i];
        }
        return arr1;
    }
}
