using System;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// Leet2981
    /// </summary>
    public class Leet2981
    {
        public int Action()
        {
            //4 2
            var s = "cbc";
            // 3 4
            //var rolls = new int[] { 1, 5, 6 };
            //5,3
            //var rolls = new int[] { 3, 5, 3 };

            return MaximumLength(s);
        }

        public int MaximumLength(string s)
        {
            var r = -1;
            Dictionary<char, List<int>> keyValuePairs = new Dictionary<char, List<int>>();
            //相同字符串分组 记录长度
            var l = 1;
            for (int i = 0; i < s.Length; i++)
            {
                if (i + 1 != s.Length && s[i] == s[i + 1])
                {
                    l++;
                }
                else
                {
                    keyValuePairs.TryAdd(s[i], new List<int>());
                    keyValuePairs[s[i]].Add(l);
                    l = 1;
                }
            }

            foreach (var k in keyValuePairs.Keys)
            {
                keyValuePairs[k].Sort((x, y) => y.CompareTo(x));
                //加入两个空数组补长
                keyValuePairs[k].Add(0);
                keyValuePairs[k].Add(0);
                //第一种情况 从最长的字符串中切割可以得到length[0] - 2
                var one = keyValuePairs[k][0] - 2;

                //第二种情况 从最长的字符串和第二长的字符串中获取
                var two = -1;
                //如果第一第二字符串长度相同 则至少可以得到四个长度length[0] - 1的子串
                if (keyValuePairs[k][0] == keyValuePairs[k][1])
                {
                    two = keyValuePairs[k][0] - 1;
                }
                //如果第二字符串长度较小 则可以得到三个长度为length[0]的子串 length[0]中两个 length[1]本身一个
                else if (keyValuePairs[k][0] > keyValuePairs[k][1])
                {
                    two = keyValuePairs[k][1];
                }

                //第三种情况 从length[0] length[1]中至少可以取三个长度为length[2]的子串
                var three = keyValuePairs[k][2];

                //结果取最大值
                var max = Math.Max(one, Math.Max(two, three));
                r = Math.Max(r, max == 0 ? -1 : max);
            }

            return r;
        }
    }
}