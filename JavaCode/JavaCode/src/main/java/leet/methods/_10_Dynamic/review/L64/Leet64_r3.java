package leet.methods._10_Dynamic.review.L64;

public class Leet64_r3 {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i==0&&j==0)continue;
                else if(i==0){
                    //第一行处理
                    grid[i][j] +=grid[i][j-1];
                }else if(j==0){
                    //第一列处理
                    grid[i][j]+=grid[i-1][j];
                }
                else {
                    grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
