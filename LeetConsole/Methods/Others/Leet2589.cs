using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2589
    /// </summary>
    public class Leet2589
    {
        public int Action()
        {
            //var tasks = new int[][] { new int[] { 2, 3, 1 }, new int[] { 4, 5, 1 }, new int[] { 1, 5, 2 } };
            var tasks = new int[][] { new int[] { 1, 3, 2 }, new int[] { 2, 5, 3 }, new int[] { 5, 6, 2 } };
            //var tasks = new int[][] { new int[] { 2, 3, 2 } };

            return FindMinimumTime2(tasks);
        }

        /// <summary>
        /// 贪心
        /// </summary>
        /// <param name="tasks"></param>
        /// <returns></returns>
        public int FindMinimumTime(int[][] tasks)
        {
            var r = 0;
            //排序 end由小到大
            Array.Sort(tasks, (a, b) => a[1] - b[1]);
            //右边界
            int left = tasks[tasks.Length - 1][1];
            //记录某个moment是否在运行
            bool[] runing = new bool[left + 1];
            for (int i = 0; i < tasks.Length; i++)
            {
                int s = tasks[i][0];
                int e = tasks[i][1];
                int d = tasks[i][2];
                for (int j = s; j <= e; j++)
                {
                    //判断区间内是否有运行moment 有则d-1
                    if (runing[j])
                    {
                        d--;
                    }
                }
                //剩余的d 优先从后往前
                for (int k = e; d > 0; k--)
                {
                    if (!runing[k])
                    {
                        runing[k] = true;
                        d--;
                        r++;
                    }
                }
            }

            return r;
        }

        /// <summary>
        /// 扫描
        /// </summary>
        /// <param name="tasks"></param>
        /// <returns></returns>
        public int FindMinimumTime2(int[][] tasks)
        {
            int r = 0;
            //从1开始遍历
            for (int i = 0; ; i++)
            {
                bool f = true, run = false;
                //遍历任务判断是否需要在i时间点运行
                foreach (var t in tasks)
                {
                    //t[end] - i +1 时就是最后必选要执行的时刻
                    if (t[2] > 0 && t[1] - i + 1 == t[2])
                    {
                        run = true;
                    }
                    //判断i是否到大边界 没有比t[end]大的值时认为已经到达边界
                    if (i <= t[1])
                    {
                        f = false;
                    }
                }
                //没有比t[end]大的值跳出循环
                if (f)
                {
                    break;
                }
                if (run)
                {
                    //同时执行在i时间区间内的任务
                    foreach (var t in tasks)
                    {
                        if (t[2] > 0 && i >= t[0] && i <= t[1])
                        {
                            t[2]--;
                        }
                    }
                    r++;
                }
            }

            return r;
        }
    }
}