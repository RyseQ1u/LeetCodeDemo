using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3297
    /// </summary>
    public class Leet3297
    {
        public long ValidSubstringCount(string word1, string word2)
        {
            long res = 0;
            //遍历word2统计字母个数
            var cnt = new int[26];
            var cnt2 = new int[26];
            foreach (var word in word2)
            {
                cnt2[word - 'a']++;
            }
            var l = 0;
            for (int i = 0; i < word1.Length; i++)
            {
                cnt[word1[i] - 'a']++;
                while (check(cnt, cnt2))
                {
                    res += word1.Length - i;
                    cnt[word1[l++] - 'a']--;
                }
            }
            return res;
        }

        /// <summary>
        /// 检查是否满足题目要求
        /// </summary>
        /// <param name="w1"></param>
        /// <param name="w2"></param>
        /// <returns></returns>
        public bool check(int[] cnt1, int[] cnt2)
        {
            for (int j = 0; j < 26; j++)
            {
                if (cnt2[j] > cnt1[j])
                {
                    return false;
                }
            }
            return true;
        }
    }
}