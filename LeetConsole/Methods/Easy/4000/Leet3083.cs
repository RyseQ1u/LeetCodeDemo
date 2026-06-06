using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3038
    /// </summary>
    public class Leet3083
    {
        /// <summary>
        /// 1.获取反转字符串
        /// 2.遍历获取原字符串长度为2的子字符串
        /// 3.查询反转字符串中是否包含该子字符串
        /// 时间 n^2 空间 n
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public bool IsSubstringPresent(string s)
        {
            bool res = false;
            int length = 2;
            //反转字符串
            var reStr = new string(s.Reverse().ToArray());
            for (int i = 0; i < s.Length - length + 1; i++)
            {
                var temp = s[i].ToString() + s[i + 1];
                if (reStr.Contains(temp))
                {
                    res = true;
                    break;
                }
            }

            return res;
        }

        /// <summary>
        /// 优化：优化掉了生成反转字符串的操作
        /// 1.判断子串s[i]s[i+1]是否在反转字符串中，等于判断s[i+1]s[i]是否在原字符串中
        /// 时间 n^2 空间 1
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public bool IsSubstringPresent_V2(string s)
        {
            bool res = false;
            int length = 2;
            for (int i = 0; i < s.Length - length + 1; i++)
            {
                var temp = s[i + 1].ToString() + s[i];
                if (s.Contains(temp))
                {
                    res = true;
                    break;
                }
            }

            return res;
        }

        /// <summary>
        /// 优化：
        /// 1.优化掉了生成反转字符串的操作
        /// 2.使用二维数组表示子字符串
        /// 1.判断子串s[i]s[i+1]是否在反转字符串中，等于判断s[i+1]s[i]是否在原字符串中
        /// 时间 n+|E| 空间 |E| E=26
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public bool IsSubstringPresent_V3(string s)
        {
            bool res = false;
            var vis = new bool[26, 26];
            for (int i = 0; i < s.Length - 1; i++)
            {
                var temp = s[i + 1].ToString() + s[i];
                int x = s[i + 1] - 'a';
                int y = s[i] - 'a';
                vis[x, y] = true;
                if (vis[y, x])
                {
                    res = true;
                    break;
                }
            }

            return res;
        }
    }
}