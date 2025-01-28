import java.util.Scanner;

public class problem47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st length: ");
        int x = sc.nextInt();
        System.out.print("Enter the 2nd length: ");
        int y = sc.nextInt();
        int[] arr = new int[x];
        int[] arr1 = new int[y];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < y; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] mergedArray = Mergearray(arr, arr1, x, y);
        System.out.println("Merged array:");
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
    }
    public static int[] Mergearray(int[] arr,int[] arr1,int x ,int y) {
        int arr2[]= new int[x+y];
        int i = 0, j = 0, k = 0;
        while(i<x && j<j){
            if(arr[i]<arr1[j]){
                arr2[k]=arr[i];
                k++;
                i++;
            }else{
                arr2[k]=arr1[j];
                j++;
                k++;
            }
        }
        while (i < x) {
            arr2[k++] = arr[i++];
        }
        while (j < y) {
            arr2[k++] = arr1[j++];
        }
        return arr2;
    }
}
