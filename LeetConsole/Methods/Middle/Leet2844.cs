using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// Leet2844
    /// </summary>
    public class Leet2844
    {
        public int Action()
        {
            //var input = new string[] { "aba", "cdc", "eae" };
            var input = "2908305";
            return MinimumOperations(input);
        }

        public int MinimumOperations(string num)
        {
            //从后往前找 00 50 75 25
            int n = num.Length;
            bool find0 = false, find5 = false;
            for (int i = n - 1; i >= 0; --i)
            {
                if (num[i] == '0' || num[i] == '5')
                {
                    if (find0)
                    {
                        return n - i - 2;
                    }
                    if (num[i] == '0')
                    {
                        find0 = true;
                    }
                    else
                    {
                        find5 = true;
                    }
                }
                else if (num[i] == '2' || num[i] == '7')
                {
                    if (find5)
                    {
                        return n - i - 2;
                    }
                }
            }
            if (find0)
            {
                return n - 1;
            }
            return n;
        }
    }
}