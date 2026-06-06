package leet.methods._11_GreedyAlgorithm.L240;

public class Leet240_r6 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //将右上角作为树的起点
        int l = 0,r=matrix[0].length-1;
        while (l<matrix.length && r>=0){
            if(matrix[l][r] > target){
                r--;
            }else if(matrix[l][r]<target){
                l++;
            }else {
                return true;
            }
        }
        return false;
    }
}
