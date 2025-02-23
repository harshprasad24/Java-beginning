public class kades_subarray {
    public static void main(String[] args) {
        ///int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int arr[]={-3,-2,-1,-4,-5,-8};
        int sum = max_subarray_sum(arr);
        System.out.println("The max sum of subarray is : "+sum);
    }
    public static int max_subarray_sum(int arr[]) {
        int ms=Integer.MIN_VALUE;
        int cs =0;
        int no=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(0<arr[i] ){
                cs+=arr[i];
                if(cs<0){
                    cs=0;
                }ms = Math.max(cs,ms);
            }if(no<arr[i]){
                no=arr[i];
            }
        }
        return ms;
    }
}


