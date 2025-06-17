public class fibonaci {
    public static void main(String[] args) {
        int n =10;
        System.out.println(fibboseries(n));
    }
    public static int fibboseries(int n) {
        if(n==3){
            return 2;
        }
        int a = fibboseries(n-1) + fibboseries(n);
        int b = a + n;
        return b;
    }
}
