public class perifix_subarray_sum {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int sum = max_subarray_sum(arr);
        System.out.println("The max sum of subarray is : "+sum);
    }
    public static int max_subarray_sum(int arr[]) {
        int sum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix [0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        for(int i=0;i<arr.length;i++){T
            int subarray_sum=0;
            for(int j=i;j<arr.length;j++){
                subarray_sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                System.out.println(subarray_sum);
                if(sum<subarray_sum){
                    sum = subarray_sum;
                }
            }
        }
        return sum;
    }
}
