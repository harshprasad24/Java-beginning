public class Shortest_Path {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestpath(path));
    }
    public static int shortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)) {
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                default:
                    y--;
                    break;
            }
        }
        int ans = x*x+y*y;
        return (int) Math.sqrt(ans);
    }
}
