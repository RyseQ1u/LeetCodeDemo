using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3066
    /// </summary>
    public class Leet3066
    {
        /// <summary>
        /// 使用优先队列
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int MinOperations_V2(int[] nums, int k)
        {
            int res = 0;
            PriorityQueue<long, long> pq = new PriorityQueue<long, long>();
            foreach (int num in nums)
            {
                pq.Enqueue(num, num);
            }
            while (pq.Peek() < k)
            {
                long x = pq.Dequeue(), y = pq.Dequeue();
                long a = (long)Math.Min(x, y) * 2 + Math.Max(x, y);
                pq.Enqueue(a, a);
                res++;
            }
            return res;
        }

        /// <summary>
        /// 超时
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int MinOperations(int[] nums, int k)
        {
            var res = 0;
            var l = new List<long>();
            var r = new List<long>();
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] < k)
                {
                    l.Add(nums[i]);
                }
                else
                {
                    r.Add(nums[i]);
                }
            }
            l.Sort();
            r.Sort();
            while (l.Count > 1)
            {
                long t = l[0] * 2 + l[1];
                l.RemoveAt(0);
                l.RemoveAt(0);
                if (t < k)
                {
                    l.Add(t);
                    l.Sort();
                }
                else
                {
                    r.Add(t);
                    r.Sort();
                }
                res++;
            }
            if (l.Count == 1)
            {
                res++;
            }

            return res;
        }
    }
}