using System;
using System.Linq;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// 3261
    /// </summary>
    public class Leet3261
    {
        /// <summary>
        /// 滑动窗口 双指针
        /// </summary>
        /// <param name="s"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public long[] CountKConstraintSubstrings(string s, int k, int[][] queries)
        {
            var res = new long[queries.Length];

            for (int i = 0; i < queries.Length; i++)
            {
                int n = queries[i][1];
                int left = queries[i][0], right = queries[i][0];
                int curRes = 0;
                //用于统计0/1
                int[] cnt = new int[2];
                for (; right <= n; right++)
                {
                    //&1 判断奇偶
                    cnt[s[right] & 1]++;
                    //不满足条件
                    while (cnt[0] > k && cnt[1] > k)
                    {
                        //排除左端点统计
                        cnt[s[left] & 1]--;
                        //移动左端点
                        left++;
                    }
                    curRes += right - left + 1;
                }
                res[i] = curRes;
            }
            return res;
        }
    }
}