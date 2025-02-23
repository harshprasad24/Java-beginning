public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={7,1,5,3,6,4};
        Bubble_sort(arr);
    }
    public static void Bubble_sort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){ // NO OF Turns
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
