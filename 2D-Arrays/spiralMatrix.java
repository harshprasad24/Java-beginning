public class spiralMatrix {
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Spiral_matix(matrix);
    }
    public static void Spiral_matix(int matrix[][]) {
        int startRow = 0;
        int startCol =0 ;
        int EndRow = matrix.length-1;
        int EndCol = matrix[0].length-1;
        while(startCol<=EndCol && startRow<=EndRow){
            for(int i=startCol;i<=EndCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            for(int j = startRow+1 ; j<=EndRow ; j++){
                System.out.print(matrix[j][EndCol]+" ");
            }
            for(int i=EndCol-1;i>=startCol;i--){
                if(startRow == EndRow){
                    break;
                }
                System.out.print(matrix[EndRow][i]+" ");
            }
            for(int j = EndRow-1 ; j>=startRow+1 ; j--){
                if(startCol == EndCol){
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }
            startCol++;
            startRow++;
            EndCol--;
            EndRow--;
        }  
        System.out.println();
    }
}
