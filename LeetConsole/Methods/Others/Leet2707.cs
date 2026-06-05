using System;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method447
    /// </summary>
    public class Leet2707
    {
        public int Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8,new ListNode(15))))));
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
            var arr = new string[] { "leet", "code", "leetcode" };
            //var head = new int[] { 5, 1, 2, 3, 10 };
            var s = "leetscode";
            return MinExtraChar(s, arr);
        }

        public int MinExtraChar(string s, string[] dictionary)
        {
            int n = s.Length;
            int[] d = new int[n + 1];
            Array.Fill(d, int.MaxValue);
            IDictionary<string, int> dic = new Dictionary<string, int>();
            foreach (string str in dictionary)
            {
                dic.TryAdd(str, 0);
                dic[str]++;
            }
            d[0] = 0;
            for (int i = 1; i <= n; i++)
            {
                d[i] = d[i - 1] + 1;
                for (int j = i - 1; j >= 0; j--)
                {
                    if (dic.ContainsKey(s.Substring(j, i - j)))
                    {
                        d[i] = Math.Min(d[i], d[j]);
                    }
                }
            }
            return d[n];
        }
    }
}