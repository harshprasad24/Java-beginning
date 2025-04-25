public class kthFactor1492 {
    public static void main(String[] args) {
        int n=12,k=3;
        System.out.println(kthFactor(n, k));
    }
    public static int kthFactor(int n, int k) {
        int[] temp = new int [n];
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                temp[count++]=i;
            }
        }
        if (k > count) return -1; 
        return temp[k-1]; 
    }
}
