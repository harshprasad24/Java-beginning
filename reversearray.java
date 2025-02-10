public class reversearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        Reverse_Array(arr);
        for (int j = 0; j <arr.length; j++) {
            System.out.print(arr[j]+",");
        }
    }
    public static void Reverse_Array(int arr[]) {
        //logic 1
        // int reverse[] = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     reverse[i]=arr[arr.length-i-1];
        // }

        //logic 2
        int i =arr.length/2;
        while(i>=0){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            i--;
        }
    }
}
