using System;

namespace LeetCode.Methods
{
    /// <summary>
    /// leetcode 1598
    /// </summary>
    public static class Leet1598
    {
        /// <summary>
        ///
        /// </summary>
        /// <param name="logs"></param>
        /// <returns></returns>
        public static int Method1(string[] logs)
        {
            int depth = 0;
            int n = logs.Length;
            for (int i = 0; i < n; i++)
            {
                String cur = logs[i];
                if (cur.StartsWith('.'))
                {
                    if (cur.StartsWith("..") && depth != 0)
                    {
                        depth--;
                    }
                }
                else
                {
                    depth++;
                }
            }
            return depth;
        }

        /// <summary>
        /// 速度最快
        /// </summary>
        /// <param name="logs"></param>
        /// <returns></returns>
        public static int Method2(string[] logs)
        {
            int depth = 0;
            int n = logs.Length;
            for (int i = 0; i < n; i++)
            {
                String cur = logs[i];
                if (cur.IndexOf('.') == 0)
                {
                    if (cur.IndexOf('.', 1) == 1 && depth > 0)
                    {
                        depth--;
                    }
                }
                else
                {
                    depth++;
                }
            }
            return depth;
        }
    }
}