namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 522
    /// </summary>
    public class Leet3128
    {
        public long Action()
        {
            //var input = new string[] { "aba", "cdc", "eae" };
            //var input = new int[][] { new int[] { 1, 0, 0, 0 }, new int[] { 0, 1, 0, 1 }, new int[] { 1, 0, 0, 0 } };
            //var input = new int[][] { new int[] { 1 }, new int[] { 1 } };
            //var input = new int[][] { new int[] { 1, 1 }, new int[] { 1, 0 }, new int[] { 0, 1 } };
            var input = new int[][] { new int[] { 1, 1, 1 }, new int[] { 1, 0, 1 }, new int[] { 1, 0, 1 } };
            return NumberOfRightTriangles(input);
        }

        public long NumberOfRightTriangles(int[][] grid)
        {
            long r = 0;
            //
            var col = new int[grid[0].Length];
            //
            var row = new int[grid.Length];
            //记录行列1个个数
            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[i].Length; j++)
                {
                    if (grid[i][j] == 1)
                    {
                        col[j]++;
                        row[i]++;
                    }
                }
            }
            //1数量大于等于2的列才有可能构成直角三角
            for (int i = 0; i < col.Length; i++)
            {
                if (col[i] >= 2)
                {
                    for (int j = 0; j < row.Length; j++)
                    {
                        if (grid[j][i] == 1)
                        {
                            if (row[j] >= 2)
                            {
                                r += (col[i] - 1) * (row[j] - 1);
                            }
                        }
                    }
                }
            }
            return r;
        }
    }
}