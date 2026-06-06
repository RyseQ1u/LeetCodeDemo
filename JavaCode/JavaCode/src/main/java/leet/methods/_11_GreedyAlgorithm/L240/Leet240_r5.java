package leet.methods._11_GreedyAlgorithm.L240;

public class Leet240_r5 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length-1,m=matrix[0].length-1;
        int  a=0,b=m;
        while (a<=n && b>=0){
            int cur = matrix[a][b];
            if(cur==target){
                return true;
            }else if(cur>target){
                b--;
            }else{
                a++;
            }
        }
        return false;
    }
}
