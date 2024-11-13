using System.Collections.Generic;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3142
    /// </summary>
    public class Leet3142
    {
        public bool Action()
        {
            var input1 = new int[][] { new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 }, new int[] { 3, 5, 3 } };
            var input2 = new int[][] { new int[] { 1, 0, 2 }, new int[] { 1, 0, 2 } };
            return SatisfiesConditions(input2);
        }

        public bool SatisfiesConditions(int[][] grid)
        {
            var r = true;
            //判断行 两两不一样
            for (int i = 0; i < grid[0].Length - 1; i++)
            {
                if (grid[0][i] == grid[0][i + 1])
                {
                    r = false; break;
                }
            }
            //判断列 完全相同

            for (int i = 0; i < grid[0].Length; i++)
            {
                var hash = new HashSet<int>
                {
                    grid[0][i]
                };

                for (int j = 0; j < grid.Length; j++)
                {
                    if (hash.Add(grid[j][i]))
                    {
                        r = false; break;
                    }
                }
            }
            return r;
        }
    }
}