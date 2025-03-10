import java.util.Arrays;

public class inbuitSort {
    public static void main(String[] args) {
        int arr[] ={2,7,6,3,9,1,0,5};
        Inbuilt_Sort(arr);
    }
    public static void Inbuilt_Sort(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
