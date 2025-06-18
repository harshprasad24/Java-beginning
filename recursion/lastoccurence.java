public class lastoccurence {
    public static void main(String[] args) {
        int n =5;
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i=0;
        System.out.println();
    }
    public static int lstoccurence(int arr[],int n,int i) {
        if(i==arr.length-1){
            return -1;
        }
        int min=0;
        if(arr[i]==n){
            min=i;
        }
        return Math.min(a,min);
        return lstoccurence(arr, n, i+1);
    }
}
