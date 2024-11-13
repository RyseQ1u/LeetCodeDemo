using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3258
    /// </summary>
    public class Leet3258
    {
        /// <summary>
        /// 滑动窗口 双指针
        /// </summary>
        /// <param name="s"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int CountKConstraintSubstrings(string s, int k)
        {
            //var arr = s.ToArray();
            int n = s.Length, res = 0, left = 0;
            //用于统计0/1
            int[] cnt = new int[2];
            for (int right = 0; right < n; right++)
            {
                //&1 判断奇偶
                //cnt[arr[right] & 1]++;
                cnt[s[right] & 1]++;
                //不满足条件
                while (cnt[0] > k && cnt[1] > k)
                {
                    //排除左端点统计
                    //cnt[arr[left] & 1]--;
                    cnt[s[left] & 1]--;
                    //移动左端点
                    left++;
                }
                res += right - left + 1;
            }
            return res;
        }

        /// <summary>
        /// 枚举
        /// 遍历每个字符串开始的位置
        /// </summary>
        /// <param name="s"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int CountKConstraintSubstrings2(string s, int k)
        {
            //var arr = s.ToArray();
            int n = s.Length, res = 0;
            for (int i = 0; i < n; i++)
            {
                //用于统计0/1
                int[] count = new int[2];
                for (int j = i; j < n; j++)
                {
                    //count[arr[j] - '0']++;
                    count[s[j] - '0']++;
                    if (count[0] > k && count[1] > k) break;
                    res++;
                }
            }
            return res;
        }
    }
}