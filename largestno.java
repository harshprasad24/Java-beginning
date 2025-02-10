public class largestno {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-6,-3,-5};
        int large = Largest_no(arr);
        System.out.print("Largest no is  : "+large);
    }
    public static int Largest_no(int arr[]) {
        int large_no=Integer.MIN_VALUE;
        int small_no =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large_no<arr[i]){
                large_no=arr[i];
            }if(small_no>arr[i]){
                small_no=arr[i];
            }
        }
        //return large_no;
        return small_no;
    }
}
