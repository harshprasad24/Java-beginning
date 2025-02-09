public class Allpattern {
    public static void main(String[] args) {
        int n=6;
        Numer_piramid_invertes(n);
        System.out.println();
        inverted_left_piramid(n);
        System.out.println();
        rectangle(n);
        System.out.println();
        Floyds_triangle(n);
        System.out.println();
        Zero_one_halfpiramid(n);
        System.out.println();
    }
    public static void Numer_piramid_invertes(int n) {
        for(int i =n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void inverted_left_piramid(int n) {
        for(int i =1;i<=n;i++){
            for(int j =n;j>=i-1;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rectangle(int n) {
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void Floyds_triangle(int n) {
        int a = 1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(" "+a);
                a++;
            }
            System.out.println();
        }
    }
    public static void Zero_one_halfpiramid(int n) {
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
