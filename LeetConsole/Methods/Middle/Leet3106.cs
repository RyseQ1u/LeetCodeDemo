using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3106
    /// </summary>
    public class Leet3106
    {
        public string GetSmallestString(string s, int k)
        {
            //字典需小就需要排前的字母最小 最接近a
            char[] ans = s.ToCharArray();
            for (int i = 0; i < s.Length; ++i)
            {
                //循环所以只计算一半
                int dis = Math.Min(s[i] - 'a', 'z' - s[i] + 1);
                if (dis <= k)
                {
                    ans[i] = 'a';
                    k -= dis;
                }
                else
                {
                    ans[i] = (char)(ans[i] - k);
                    break;
                }
            }
            return new string(ans);
        }
    }
}