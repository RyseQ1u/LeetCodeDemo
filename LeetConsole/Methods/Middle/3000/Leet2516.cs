using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2516
    /// </summary>
    public class Leet2516
    {
        /// <summary>
        /// 正难则反 求剩下的数组
        /// </summary>
        /// <param name="s"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int TakeCharacters(string s, int k)
        {
            int[] cnt = new int[3];
            int len = s.Length;
            int ans = len;
            foreach (char c in s)
            {
                cnt[c - 'a']++;
            }
            if (cnt[0] < k || cnt[1] < k || cnt[2] < k)
            {
                return -1;
            }

            int l = 0;
            //左右指针重0开始
            for (int r = 0; r < len; r++)
            {
                cnt[s[r] - 'a']--;
                while (l < r && (cnt[0] < k || cnt[1] < k || cnt[2] < k))
                {
                    cnt[s[l] - 'a']++;
                    l++;
                }
                if (cnt[0] >= k && cnt[1] >= k && cnt[2] >= k)
                {
                    ans = Math.Min(ans, len - (r - l + 1));
                }
            }

            return ans;
        }
    }
}