public class Firstnsum {
    public static void main(String[] args) {
        int n =10;
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int a = sum(n-1);
        int b = a+n;
        return b;
    }
}
