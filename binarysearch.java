public class binarysearch {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12,14,16};
        int key =12;
        int no = Binary_search(arr, key);
        System.out.print("The no is at index : "+no);
    }
    public static int Binary_search(int arr[],int key) {
        //logic 1
        int start =0,end=arr.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }if(arr[mid]>key){
                end =mid-1;
            }else{
                start = mid+1;
            }
        }
        //logic 2
        // int a =arr.length/2;
        // if(arr[a]>key){
        //     for(int i=0;i<=a;i++){
        //         if(arr[i]==key){
        //             return i;
        //         }
        //     }
        // }else{
        //     for(int j=a;j<arr.length;j++){
        //         if(arr[j]==key){
        //             return j;
        //         }
        //     }
        // }
        return -1;
    }
}
