public class Odd_even {
    public static void main(String[] args) {
        evenodd(78);
        evenodd(53);
        evenodd(47);
    }
    public static void evenodd(int n) {
        int bitmark = 1;
        if((n & bitmark) == 0){
            System.out.println("Even no");
        }else{
            System.out.println("Odd no");
        }
    }
}
