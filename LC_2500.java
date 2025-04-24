import java.util.Arrays;

public class LC_2500 {
    public static void main(String[] args) {
        int grid[][] = {{1,2,4},{3,3,1}};
        System.out.println(deleteGreatestValue(grid));
    }
    public static int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for (int[] row : grid) {
            Arrays.sort(row); 
        }
        for (int j = grid[0].length - 1; j >= 0; j--) {
            int maxInColumn = Integer.MIN_VALUE;
            for (int i = 0; i < grid.length; i++) {
                maxInColumn = Math.max(maxInColumn, grid[i][j]);
            }
            sum += maxInColumn;
        }
        return sum;
    }
}
