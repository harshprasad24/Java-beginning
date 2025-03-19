public class SearchInSortedMatrix {
    public static int Search_In_Sorted_Matrix(int grid[][],int key) {
        int row=0,col=grid[0].length-1;
        while( row <grid.length && col>=0){
            if(grid[row][col]==key){
                return row;
            }else if(key<grid[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int grid [][]= {{1,  2,  3,  4},
                        {5,  6,  7,  8},
                        {9,  10, 11, 12},
                        {13, 14, 15, 16}
                    };
        int key = 10 ;
        int ans = Search_In_Sorted_Matrix(grid, key);
        System.out.println(ans);
    }
    
}
