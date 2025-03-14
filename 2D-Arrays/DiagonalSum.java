public class DiagonalSum {
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{14,12,13,14}};
        Diagonal_Sum(matrix);
    }
    public static void Diagonal_Sum(int matrix[][]) {
        int sum =0 ;
        // for(int i=0;i<matrix.length;i++){            // Complexity O(n^2)
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j || i+j== matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int j=0;j<matrix.length;j++){
            sum += matrix[j][j];
            if(j != matrix.length-1-j){                          // complexity O(n)
                sum += matrix[j][matrix.length-1-j];
            }
        }

        System.out.println(sum);
    }
}
