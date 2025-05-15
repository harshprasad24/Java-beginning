public class palindrome_string {
    public static void main(String[] args) {
        String name = "madam";
        System.out.println(palindrome(name));
    }
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
