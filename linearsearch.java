public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,16,18};
        int key =10;
        int index = linear_search(arr, key);
        if(index==-1){
            System.out.print("Not found");
        }else{
            System.out.print("The No is present at : "+index);
        }
    }
    public static int linear_search(int arr[],int key) {
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
