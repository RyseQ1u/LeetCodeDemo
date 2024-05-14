using System;
using System.Collections.Generic;

namespace LeetCode.Methods
{
    public class Leet994
    {
        public int Action()
        {
            var r = 0;
            var grid = new int[][] { new int[] { 2, 1, 1 }, new int[] { 1, 1, 0 }, new int[] { 0, 1, 1 } };
            //var grid = new int[][] { new int[] { 1 }, new int[] { 2 } };
            r = OrangesRotting2(grid);
            return r;
        }

        /// <summary>
        /// BFS
        /// </summary>
        /// <param name="grid"></param>
        /// <returns></returns>
        public int OrangesRotting(int[][] grid)
        {
            var r = -1;
            var badQ = new Queue<int[]>();
            var goodN = 0;
            var badN = 0;

            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[i].Length; j++)
                {
                    if (grid[i][j] == 2)
                    {
                        badQ.Enqueue(new int[] { i, j });
                    }
                    else if (grid[i][j] == 1)
                    {
                        goodN++;
                    }
                }
            }
            if (goodN == 0)
            {
                //没有新鲜的橘子，返回0
                return 0;
            }
            else if (badQ.Count == 0)
            {
                //没有腐烂的橘子无法传染,返回-1
                return -1;
            }
            var t = 0;
            while (badQ.Count > 0)
            {
                var c = badQ.Count;
                var l = 0;
                var f = false;
                while (l < c)
                {
                    l++;
                    var s = badQ.Dequeue();
                    //上
                    if (s[0] - 1 >= 0 && grid[s[0] - 1][s[1]] == 1)
                    {
                        badN++;
                        grid[s[0] - 1][s[1]] = 2;
                        badQ.Enqueue(new int[] { s[0] - 1, s[1] });
                        f = true;
                    }
                    //下
                    if (s[0] + 1 < grid.Length && grid[s[0] + 1][s[1]] == 1)
                    {
                        badN++;
                        grid[s[0] + 1][s[1]] = 2;
                        badQ.Enqueue(new int[] { s[0] + 1, s[1] });
                        f = true;
                    }
                    //左
                    if (s[1] - 1 >= 0 && grid[s[0]][s[1] - 1] == 1)
                    {
                        badN++;
                        grid[s[0]][s[1] - 1] = 2;
                        badQ.Enqueue(new int[] { s[0], s[1] - 1 });
                        f = true;
                    }
                    if (s[1] + 1 < grid[s[0]].Length && grid[s[0]][s[1] + 1] == 1)
                    {
                        badN++;
                        grid[s[0]][s[1] + 1] = 2;
                        badQ.Enqueue(new int[] { s[0], s[1] + 1 });
                        f = true;
                    }
                }
                if (f)
                    t++;
            }
            if (goodN == badN)
            {
                r = t;
            }
            return r;
        }

        /// <summary>
        /// DFS
        /// </summary>
        /// <param name="grid"></param>
        /// <returns></returns>
        public int OrangesRotting2(int[][] grid)
        {
            var r = -1;
            var badQ = new Queue<int[]>();
            var goodN = 0;
            var badN = 0;
            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[i].Length; j++)
                {
                    if (grid[i][j] == 2)
                    {
                        badQ.Enqueue(new int[] { i, j });
                    }
                    else if (grid[i][j] == 1)
                    {
                        goodN++;
                    }
                }
            }
            if (goodN == 0)
            {
                //没有新鲜的橘子，返回0
                return 0;
            }
            else if (badQ.Count == 0)
            {
                //没有腐烂的橘子无法传染,返回-1
                return -1;
            }
            //第二次遍历找出腐烂的橘子
            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[0].Length; j++)
                {
                    //找出腐烂的橘子
                    if (grid[i][j] == 2)
                    {
                        //烂橘子开始传染，调用传染方法s
                        dps(i, j, 2, grid);
                    }
                }
            }
            int max = 0;
            //第三次遍历，找出腐烂指数最高的橘子
            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[0].Length; j++)
                {
                    //判断是否有新鲜的橘子
                    if (grid[i][j] == 1)
                    {
                        return -1;
                    }
                    //找到腐烂指数最大的橘子,max>2
                    max = Math.Max(grid[i][j], max);
                }
            }
            return max - 2; ;
        }

        public void dps(int i, int j, int val, int[][] grid)
        {
            //列数
            int r = grid.Length;
            //行数
            int l = grid[0].Length;

            grid[i][j] = val;

            //传染是向上下左右个方向同时发生的

            //向上判断
            //先判断是否为空，再判断当前列向上一个元素是好橘子或是一个腐烂的更晚的橘子
            if (i > 0 && (grid[i - 1][j] == 1 || grid[i - 1][j] - grid[i][j] > 1))
            {
                //该位置的值+1，相当于腐烂指数+1，递归判断
                dps(i - 1, j, val + 1, grid);
            }

            //向下判断
            //先判断是否为空，再判断当前行向下一个元素是好橘子或是一个腐烂的更晚的橘子
            if (i < r - 1 && (grid[i + 1][j] == 1 || grid[i + 1][j] - grid[i][j] > 1))
            {
                dps(i + 1, j, val + 1, grid);
            }

            //向左判断
            //先判断是否为空，再判断当前行向左一个元素是好橘子或是一个腐烂的更晚的橘子
            if (j > 0 && (grid[i][j - 1] == 1 || grid[i][j - 1] - grid[i][j] > 1))
            {
                dps(i, j - 1, val + 1, grid);
            }

            //向右判断
            //先判断是否为空，再判断当前行向右一个元素是好橘子或是一个腐烂的更晚的橘子
            if (j < l - 1 && (grid[i][j + 1] == 1 || grid[i][j + 1] - grid[i][j] > 1))
            {
                dps(i, j + 1, val + 1, grid);
            }
        }
    }
}