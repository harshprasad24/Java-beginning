public class ToUppercase {
    public static void main(String[] args) {
        String ch = "My name,harsh prasad , a b-tech student";
        System.out.println(touppercase(ch));
    }
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); 
                // we have taken out the charecter then chage toupper case then added the charecter
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
