namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3216
    /// </summary>
    public class Leet3216
    {
        public string GetSmallestString2(string s)
        {
            //找到第一对奇偶相同的相邻数，比较大小 交换位置
            string r = string.Empty;
            var arr = s.ToCharArray();
            for (int i = 0; i < arr.Length - 1; i++)
            {
                var a = int.Parse(s[i] + "");
                var b = int.Parse(s[i + 1] + "");
                if (a > b)
                {
                    if (a % 2 == b % 2)
                    {
                        r += b;
                        r += a;
                        if (i + 1 != arr.Length)
                        {
                            r += s.Substring(i + 2);
                        }
                        break;
                    }
                }

                r += a;
                if (i == arr.Length - 2)
                {
                    r += b;
                }
            }

            return r;
        }

        /// <summary>
        /// 优化
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public string GetSmallestString(string s)
        {
            char[] t = s.ToCharArray();
            for (int i = 1; i < t.Length; i++)
            {
                char x = t[i - 1];
                char y = t[i];
                if (x > y && x % 2 == y % 2)
                {
                    t[i - 1] = y;
                    t[i] = x;
                    break;
                }
            }
            return new string(t);
        }
    }
}