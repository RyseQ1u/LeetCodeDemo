using System;
using System.Collections.Generic;
using System.Linq;
using System.Security;
using System.Threading.Tasks;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 826
    /// </summary>
    public class Leet826
    {
        public long Action()
        {
            var difficulty = new int[] { 68, 35, 52, 47, 86 };
            var profit = new int[] { 67, 17, 1, 81, 3 };
            var worker = new int[] { 92, 10, 85, 84, 82 };

            return MaxProfitAssignment2(difficulty, profit, worker);
        }

        /// <summary>
        /// 时间慢
        /// </summary>
        /// <param name="difficulty"></param>
        /// <param name="profit"></param>
        /// <param name="worker"></param>
        /// <returns></returns>
        public int MaxProfitAssignment2(int[] difficulty, int[] profit, int[] worker)
        {
            var r = 0;
            //报酬排序 冒泡效率低
            //for (int i = 0; i < difficulty.Length - 1; i++)
            //{
            //    for (int j = 0; j < difficulty.Length - 1; j++)
            //    {
            //        var tmp = 0;
            //        if (difficulty[j] > difficulty[j + 1])
            //        {
            //            tmp = difficulty[j];
            //            difficulty[j] = difficulty[j + 1];
            //            difficulty[j + 1] = tmp;
            //            tmp = profit[j];
            //            profit[j] = profit[j + 1];
            //            profit[j + 1] = tmp;
            //        }
            //    }
            //}
            //合并数组后排序
            var jobs = difficulty.Zip(profit, (d, p) => (d, p)).OrderBy(x => x.d).ToArray();

            Array.Sort(worker);
            //从小到大 前面员工能完成的任务 后面的员工也能完成
            int max = 0, k = 0;
            foreach (var w in worker)
            {
                while (k < jobs.Length && w >= jobs[k].d)
                {
                    max = Math.Max(max, jobs[k].p);
                    k++;
                }
                r += max;
            }

            return r;
        }

        /// <summary>
        /// 时间慢
        /// </summary>
        /// <param name="difficulty"></param>
        /// <param name="profit"></param>
        /// <param name="worker"></param>
        /// <returns></returns>
        public int MaxProfitAssignment(int[] difficulty, int[] profit, int[] worker)
        {
            var r = 0;
            //报酬排序
            for (int i = 0; i < profit.Length - 1; i++)
            {
                for (int j = 0; j < profit.Length - 1; j++)
                {
                    var tmp = 0;
                    if (profit[j] > profit[j + 1])
                    {
                        tmp = profit[j];
                        profit[j] = profit[j + 1];
                        profit[j + 1] = tmp;

                        tmp = difficulty[j];
                        difficulty[j] = difficulty[j + 1];
                        difficulty[j + 1] = tmp;
                    }
                }
            }
            Array.Sort(worker);
            //从能力最强的一个开始
            var wIndex = worker.Length - 1;
            //优先报酬最高的
            for (int i = difficulty.Length - 1; i >= 0; i--)
            {
                while (wIndex >= 0 && difficulty[i] <= worker[wIndex])
                {
                    r += profit[i];
                    wIndex--;
                }
            }

            return r;
        }
    }
}