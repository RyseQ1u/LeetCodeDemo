using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// 2713 todo
    /// </summary>
    public class Leet2713
    {
        public int Action()
        {
            //2
            int[][] data = new int[][]
            {
                            new int[] {3,1,6},
                            new int[] {-9,5,7},
            };

            return MaxIncreasingCells(data);
        }

        //倒序查找 从最大的开始
        public int MaxIncreasingCells(int[][] mat)
        {
            Dictionary<(int, int), int> keyValues = new Dictionary<(int, int), int>();
            for (int i = 0; i < mat.Length; i++)
            {
                for (int j = 0; j < mat[i].Length; j++)
                {
                    keyValues.Add((i, j), mat[i][j]);
                }
                Array.Sort(mat[i]);
            }

            return 0;
        }
    }
}