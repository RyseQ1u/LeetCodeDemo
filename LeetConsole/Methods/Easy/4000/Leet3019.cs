using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3019
    /// </summary>
    public class Leet3019
    {
        public int CountKeyChanges(string s)
        {
            //转换小写
            var ns = s.ToLower();
            //统计类型
            var last = ns[0];
            var res = 0;
            foreach (char c in ns)
            {
                if (c != last)
                {
                    res++;
                    last = c;
                }
            }
            return res;
        }

        /// <summary>
        /// 位运算优化 大小写ASCII码差值为32
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public int CountKeyChanges_V2(string s)
        {
            //统计类型
            var res = 0;
            for (int i = 0; i < s.Length; i++)
            {
                if (Math.Abs(s[i] - s[i - 1]) == 32 || s[i] == s[i - 1]) continue;
                res++;
            }
            return res;
        }
    }
}