public class operation {
    public static void main(String[] args) {
        int n =10;
        int i = 1;
        System.out.println(getithbit(n, i));
        System.out.println(setithbit(n, i));
        System.out.println(clearithbit(n, i));
    }
    public static int getithbit(int n,int i) {
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setithbit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearithbit(int n, int i) {
        int bitmask = 1<<i;
        return  n & ~(bitmask);
    }
    public static int updateith(int n,int i,int newbit) {
        if(newbit == 0){
            return clearithbit(n, i);
        }else{
            return setithbit(n, i);
        }
    }
}      
