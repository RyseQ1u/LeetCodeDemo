using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 90
    /// </summary>
    public class Leet90
    {
        public IList<IList<int>> SubsetsWithDup(int[] nums)
        {
            List<IList<int>> res = new List<IList<int>>();

            //集合长度
            int n = nums.Length;
            //判断是否重复
            HashSet<long> repeat = new HashSet<long>();

            //子集总数 2^n
            int subsetCout = 1 << n;
            for (int i = 0; i < subsetCout; i++)
            {
                var subset = new List<int>();
                long tmp = 0;
                for (int j = 0; j < n; j++)
                {
                    if ((i & (1 << j)) > 0)
                    {
                        subset.Add(nums[j]);
                        tmp += 1 << nums[j] + 1;
                    }
                }
                if (repeat.Add(tmp))
                {
                    res.Add(subset);
                }
            }
            return res;
        }
    }
}