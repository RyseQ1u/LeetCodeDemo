using System;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 2595
    /// </summary>
    public class Leet2595
    {
        public int[] EvenOddBit(int n)
        {
            int[] res = new int[2];
            //转换为二进制
            string str = Convert.ToString(n, 2);
            int l = str.Length - 1;
            for (int i = l; i >= 0; i--)
            {
                if (str[i] == '1')
                {
                    if (((l - i) & 1) == 0)
                    {
                        res[0]++;
                    }
                    else
                    {
                        res[1]++;
                    }
                }
            }
            return res;
        }
    }
}