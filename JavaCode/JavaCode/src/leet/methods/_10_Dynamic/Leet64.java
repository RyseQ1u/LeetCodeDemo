package leet.methods._10_Dynamic;

/**
 * 最小路径和
 */
public class Leet64 {

    /**
     * 最小路径和
     */
    public int minPathSum(int[][] grid) {
        //维护每一格的最小值
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //原点不用处理
                if (i == 0 && j == 0) {
                    continue;
                }
                //第一行 只能从左边过来
                else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                    //第一列 只能从上边过来
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                    //中间的数据 可以从上和左过来 比较取最小
                } else {
                    grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}
