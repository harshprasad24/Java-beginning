public class firstoccurennce {
    public static void main(String[] args) {
        int n =7;
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i=0;
        System.out.println(fstoccurence(arr, n, i));
    }

    public static int fstoccurence(int arr[],int n,int i) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return fstoccurence(arr, n, i+1);
    }
}
