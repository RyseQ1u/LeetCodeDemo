using System;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2287
    /// </summary>
    public class Leet2287
    {
        public int Action()
        {
            var s = "ilovecodingonleetcode";
            var target = "code";
            return Function1(s, target);
        }

        public int Function1(string s, string target)
        {
            IDictionary<char, int> sCounts = new Dictionary<char, int>();
            IDictionary<char, int> targetCounts = new Dictionary<char, int>();
            foreach (var c in target)
            {
                targetCounts.TryAdd(c, 0);
                targetCounts[c]++;
            }
            foreach (var c in s)
            {
                if (targetCounts.ContainsKey(c))
                {
                    sCounts.TryAdd(c, 0);
                    sCounts[c]++;
                }
            }
            int ans = int.MaxValue;
            foreach (var pair in targetCounts)
            {
                char c = pair.Key;
                int count = pair.Value;
                int totalCount = sCounts.ContainsKey(c) ? sCounts[c] : 0;
                ans = Math.Min(ans, totalCount / count);
                if (ans == 0) return 0;
            }
            return ans;
        }
    }
}