public class increasing {
    public static void main(String[] args) {
        int n=15;
        increas(n);
    }
    public static void increas(int n) {
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        increas(n-1);
        System.out.print(n+" ");
    }
}
