package leet.methods._11_GreedyAlgorithm;

/**
 * 搜索二维矩阵 II
 */
public class Leet240 {

    /**
     * 当做二叉搜索树做
     * 树节点在右上
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i>=0 && j<matrix[0].length){
            if(matrix[i][j] > target){
                i--;
            }else if(matrix[i][j]<target){
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
}
