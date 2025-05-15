public class substring {
    public static void main(String[] args) {
        String str = "Harsh Prasad";
        int si=3;
        int ei=11;
        System.out.println(substring(str, ei, si));
    }
    public static String substring(String str,int ei,int si){
        String substr ="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
}


//inbuilt function to find substring is 
//str.substring(0,5);//range