using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3099
    /// </summary>
    public class Leet3033
    {
        public int[][] Action()
        {
            int[][] num = new int[][] { new int[] { 1, 2, -1 }, new int[] { 4, -1, 6 }, new int[] { 7, 8, 9 } };
            return ModifiedMatrix2(num);
        }

        public int[][] ModifiedMatrix(int[][] matrix)
        {
            //列
            var c = matrix.Length;
            //行
            var r = matrix[0].Length;

            var max = new int[r];

            for (int i = 0; i < r; i++)
            {
                var t = new List<(int x, int y)>();
                for (int j = 0; j < c; j++)
                {
                    if (matrix[j][i] == -1)
                    {
                        t.Add((j, i));
                    }
                    else
                    {
                        max[i] = Math.Max(max[i], matrix[j][i]);
                    }
                }
                if (t.Count > 0)
                {
                    foreach (var e in t)
                    {
                        matrix[e.x][e.y] = max[i];
                    }
                }
            }
            return matrix;
        }

        public int[][] ModifiedMatrix2(int[][] matrix)
        {
            //列
            var c = matrix.Length;
            //行
            var r = matrix[0].Length;

            for (int i = 0; i < r; i++)
            {
                int max = 0;
                for (int j = 0; j < c; j++)
                {
                    max = Math.Max(max, matrix[j][i]);
                }
                for (int j = 0; j < c; j++)
                {
                    if (matrix[j][i] == -1)
                    {
                        matrix[j][i] = max;
                    }
                }
            }
            return matrix;
        }
    }
}