package leet.methods._11_GreedyAlgorithm.L240;

public class Leet240_r3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //将二维数组看成树，根节点在右上角
        int n = matrix[0].length,m=matrix.length;
        int row =0,col = n-1;
        while (col>=0 && row < m ){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col]>target){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
