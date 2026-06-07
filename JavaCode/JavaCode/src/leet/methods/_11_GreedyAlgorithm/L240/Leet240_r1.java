package leet.methods._11_GreedyAlgorithm.L240;

public class Leet240_r1 {
    private int[][] Matrix ;
    private int Target;
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        this.Matrix = matrix;
        this.Target = target;
        int n = matrix.length-1,m=matrix[0].length-1;
        return dfs(0,m);
    }

    boolean dfs(int x,int y ){
        if(Matrix[x][y]== Target)return true;
        if(Matrix[x][y] > Target){
            if(y<1)return false;
            return dfs(x,y-1);
        }else {
            if(x+1>Matrix.length-1)return false;
            return dfs(x+1,y);
        }
    }

    public boolean searchMatrix_V2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        //从右上出发
        int m = matrix.length,n=matrix[0].length;
        int row = 0;
        int col = n-1;
        while (row<m && col>=0){
            if(matrix[row][col]==target){
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
