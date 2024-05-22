using System;
using System.Collections.Generic;
using System.Security;
using System.Threading.Tasks;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1542
    /// </summary>
    public class Leet1542
    {
        public long Action()
        {
            var s = "3242415";

            return LongestAwesome(s);
        }

        /// <summary>
        /// 需要练习状态转换
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public int LongestAwesome(string s)
        {
            var r = 0;
            var dict = new Dictionary<char, int>();
            foreach (var c in s)
            {
                dict.TryAdd(c, 0);
                dict[c]++;
            }
            int left = 0;
            int tight = 0;
            List<int> list = new List<int>();
            for (int i = 0; i < s.Length; i++)
            {
                if (dict[s[i]] == 1)
                {
                    list.Add(i);
                }
            }
            for (int i = 0; i < list.Count; i++)
            {
            }
            return r;
        }
    }
}