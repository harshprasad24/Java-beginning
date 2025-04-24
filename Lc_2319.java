public class Lc_2319 {
    public static void main(String[] args) {
        int grid[][] = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        boolean ans = checkXMatrix(grid);    
        System.out.print(ans);                              
    }
    public static boolean checkXMatrix(int[][] grid){
        int n = grid.length;
        int countNonZero = 0, countZero = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (grid[i][j] != 0) 
                        countNonZero++;
                } else {
                    if (grid[i][j] == 0) 
                        countZero++;
                }
            }
        }   
        return countNonZero == (2 * n - (n % 2)) && countZero == (n * n - (2 * n - (n % 2)));
    }
}
