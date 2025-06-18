public class fibonaci {
    public static void main(String[] args) {
        int n =20;
        System.out.println(fibboseries(n));
    }
    public static int fibboseries(int n) {
        if(n==0 || n==1){
            return n;
        }
        int a = fibboseries(n-1);
        int b = fibboseries(n-2);
        int fibn = a+b;
        return fibn;
    }
}
