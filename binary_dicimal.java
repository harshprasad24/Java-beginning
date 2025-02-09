public class binary_dicimal {
    public static void main(String[] args) {
        int x =110101;
        int y = 15;
        int decimal = binaryTOdecimal(x);
        System.out.println("Binary to Decimal : "+decimal);
        int binary = decimalTObinary(y);
        System.out.println("Decimal to Binary :"+binary);
    }
    public static int binaryTOdecimal(int x) {
        int sum =0,pow=0;
        while(x>0){
            int rem = x%10;
            sum =sum+ rem*(int)Math.pow(2, pow);
            x/=10;
            pow++;
        }
        return sum;
    }
    public static int decimalTObinary(int y) {
        int binNo =0,pow=0;
        while(y>0){
            int rem = y%2;
            binNo=binNo+(rem*(int)Math.pow(10, pow));
            y/=2;
            pow++;
        }
        return binNo;
    }
}
