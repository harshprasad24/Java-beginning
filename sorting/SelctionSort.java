public class SelctionSort {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        Selection_Sort(arr);
    }
    public static void Selection_Sort(int arr[]){
        for(int i=0;i<arr.length-1 ;i++){
            int Smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[Smallest]>arr[j]){
                    Smallest=j;
                }
            }
            int temp =arr[Smallest];
            arr[Smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
