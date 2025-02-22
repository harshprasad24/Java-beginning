public class subarray_sum {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int sum = max_subarray_sum(arr);
        System.out.println("The max sum of subarray is : "+sum);
    }
    public static int max_subarray_sum(int arr[]) {
        int sum=Integer.MIN_VALUE; 
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int subarray_sum=0;
                for(int k=i;k<=j;k++){
                    subarray_sum+=arr[k];
                    System.out.println(subarray_sum);
                }
                if(sum<subarray_sum){
                    sum = subarray_sum;
                }
            }
        }
        return sum;
    }
}
