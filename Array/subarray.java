public class subarray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        print_subarray(arr);
    }
    public static void print_subarray(int arr[]){
        int ts =0;
        for(int i=0;i<=arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    ts++;
                }
                System.out.print("]");
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.print("Total subarrays : "+ts);
    }
}
