using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 813
    /// </summary>
    public class Leet813_1
    {
        public int Action()
        {
            string s = "0100";
            //var words = new string[] { "zzyy", "zy", "zyy" };
            //int k = 3;
            //var nums = new int[] { 9, 1, 2, 3, 9 };
            return Function1(s);
        }

        public int Function1(string s)
        {
            int result = 0;
            for (int i = 0; i < s.Length; i++)
            {
                char c = s[i];
                if (c != (char)('0' + i % 2))
                {
                    result++;
                }
            }
            return Math.Min(result, s.Length - result);
        }
    }
}