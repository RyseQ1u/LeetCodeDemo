package leet.methods._10_Dynamic.review.L64;

public class Leet64_r1 {
    public int minPathSum(int[][] grid) {
        //左上到左下的最短路径
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //第一个元素直接跳过
                if(i==0&&j==0)continue;
                //上边界 只能从左边来
                if(i==0)grid[i][j]+=grid[i][j-1];
                //左边界 只能从上边来
                else if(j==0)grid[i][j]+=grid[i-1][j];
                //中间元素 从左边和上边来 取左和上的最小值
                else grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
