public class sortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i=0;
        System.out.println(issorted(arr, i));
    }
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        } 
        return issorted(arr, i+1);
    }
}
