package leet.methods._11_GreedyAlgorithm.L240;

public class Leet240_r7 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //从右上角开始，当做树搜索
        int i = 0,j=matrix[0].length-1;
        while (i<matrix.length&&j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}
