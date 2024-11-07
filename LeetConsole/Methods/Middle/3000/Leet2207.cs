using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2207
    /// </summary>
    public class Leet2207
    {
        public long MaximumSubsequenceCount(string text, string pattern)
        {
            long r = 0;

            var char1 = pattern[0];
            var char2 = pattern[1];
            //统计字符个数
            int c1n = 0;
            int c2n = 0;

            foreach (char c in text)
            {
                if (c == char1)
                {
                    c1n++;
                }
                else if (c == char2)
                {
                    c2n++;
                    //每遍历到一个c2n 结果加上c1n数量
                    r += c1n;
                }
            }
            //将字符插入最左或最右
            if (c1n > c2n)
            {
                r += c1n;
            }
            else
            {
                r += c2n;
            }

            //处理相同的情况 等差数列求和
            if (char1 == char2)
            {
                r = r * (1 + r) / 2;
            }
            return r;
        }
    }
}