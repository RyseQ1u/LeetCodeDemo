using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3148
    /// </summary>
    public class Leet3148
    {
        public int Action()
        {
            var input1 = new int[][] { new int[] { 9, 5, 7, 3 }, new int[] { 8, 9, 6, 1 }, new int[] { 6, 7, 14, 3 }, new int[] { 2, 5, 3, 1 } };

            return MaxScore(input1);
        }

        public int MaxScore(IList<IList<int>> grid)
        {
            int res = int.MinValue;
            //假设点移动步骤 gride[x1][y1] -> gride[x2][y2] ->gride[x3][y3]
            //分数公式 score = (grid[x2][y2] - gride[x1][y1]) +(grid[x3][y3] - grid[x2][y2])
            //整理可得 score = grid[x3][y3] - gride[x1][y1]
            //所以分数只和起点终点坐标相关
            //设终点为 i,j
            //枚举 i,j 找出左上区域的最小值
            int c = grid.Count;
            int r = grid[0].Count;
            //建立一个二维数组维护最小值
            int[][] f = new int[c + 1][];

            for (int i = 0; i < c + 1; i++)
            {
                f[i] = new int[r + 1];
            }

            Array.Fill(f[0], int.MaxValue);
            for (int i = 0; i < c; i++)
            {
                f[i + 1][0] = int.MaxValue;
                for (int j = 0; j < r; j++)
                {
                    int rc = Math.Min(f[i + 1][j], f[i][j + 1]);
                    int x = grid[i][j];
                    res = Math.Max(res, x - rc);
                    f[i + 1][j + 1] = Math.Min(rc, x);
                }
            }

            return res;
        }
    }
}