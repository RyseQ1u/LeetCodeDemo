package leet.methods._10_Dynamic.review.L64;

public class Leet64_r2 {
    public int minPathSum(int[][] grid) {
        //从左上到右下 只能往下和往右移动
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //第一位不用处理
                if(i==0&&j==0)continue;
                //第一行处理 只能往右移动
                if(i==0)grid[i][j]+=grid[i][j-1];
                //第一列处理 只能往下移动
                else if(j==0)grid[i][j]+=grid[i-1][j];
                //中间元素处理 可以往右和下移动 取最小值
                else grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
