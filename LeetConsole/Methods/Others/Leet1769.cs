using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1769
    /// </summary>
    public class Leet1769
    {
        public int[] Action()
        {
            string s = "001011";
            return Function2(s);
        }

        public int[] Function1(string s)
        {
            var arr = new int[s.Length];

            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == '1')
                {
                    for (int j = 0; j < arr.Length; j++)
                    {
                        arr[j] = arr[j] + Math.Abs(j - i);
                    }
                }
            }
            return arr;
        }

        public int[] Function2(string s)
        {
            var arr = new int[s.Length];
            for (int j = 0; j < arr.Length; j++)
            {
                for (int i = 0; i < s.Length; i++)
                {
                    if (s[i] == '1')
                    {
                        arr[j] = i >= j ? arr[j] += i - j : arr[j] += j - i;
                    }
                }
            }
            return arr;
        }
    }
}