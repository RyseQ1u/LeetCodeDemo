using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// Leet699
    /// </summary>
    public class Leet699
    {
        public IList<int> Action()
        {
            int[][] data = new int[][]
{
            new int[] { 1, 2 },
            new int[] { 2, 3 },
            new int[] { 6, 1 }
};
            return FallingSquares2(data);
        }

        //内存超了
        public IList<int> FallingSquares(int[][] positions)
        {
            var result = new List<int>();
            //记录某个位置的高度
            Dictionary<int, int> heighs = new Dictionary<int, int>();
            var heightMax = 0;
            for (int i = 0; i < positions.Length; i++)
            {
                //计算方块占用位置高度 从起点到宽度
                var maxHeigh = positions[i][1];
                for (int j = positions[i][0]; j < positions[i][0] + positions[i][1]; j++)
                {
                    if (heighs.ContainsKey(j))
                    {
                        maxHeigh = Math.Max(heighs[j] + positions[i][1], maxHeigh);
                    }
                }
                for (int j = positions[i][0]; j < positions[i][0] + positions[i][1]; j++)
                {
                    heighs[j] = maxHeigh;
                }
                heightMax = Math.Max(heightMax, maxHeigh);
                result.Add(heightMax);
            }

            return result;
        }

        //内存超了
        public IList<int> FallingSquares2(int[][] positions)
        {
            int n = positions.Length;
            IList<int> heights = new List<int>();
            for (int i = 0; i < n; i++)
            {
                int left1 = positions[i][0], right1 = positions[i][0] + positions[i][1] - 1;
                heights.Add(positions[i][1]);
                for (int j = 0; j < i; j++)
                {
                    int left2 = positions[j][0], right2 = positions[j][0] + positions[j][1] - 1;
                    if (right1 >= left2 && right2 >= left1)
                    {
                        heights[i] = Math.Max(heights[i], heights[j] + positions[i][1]);
                    }
                }
            }
            for (int i = 1; i < n; i++)
            {
                heights[i] = Math.Max(heights[i], heights[i - 1]);
            }
            return heights;
        }
    }
}