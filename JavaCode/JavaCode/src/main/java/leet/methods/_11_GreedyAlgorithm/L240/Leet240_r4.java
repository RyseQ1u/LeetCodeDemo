package leet.methods._11_GreedyAlgorithm.L240;

public class Leet240_r4 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //将右上角作为树的根节点
        int row=0,col=matrix[0].length-1;
        while (row < matrix.length && col>=0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col]> target){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
