public class StringCompresion {
    public static void main(String[] args) {
        String str = "aannssniiiyyittpptt";
        System.out.println(Compresion(str));

    }
    public static String Compresion(String str){
        String newstr = " ";

        //logic 1
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i)!=str.charAt(i+1)){
        //         newstr+=str.charAt(i);
        //     }
        // }

        //logic 2
        for(int i = 0; i < str.length(); i++){
            int count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count;
            }
        }
        return newstr;
    }
}
