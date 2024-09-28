using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// LCP2073
    /// </summary>
    public class Leet2073
    {
        public int TimeRequiredToBuy(int[] tickets, int k)
        {
            int n = tickets[k];
            var r = n;
            for (int i = 0; i < tickets.Length; i++)
            {
                if (i < k)
                {
                    if (tickets[i] < n)
                    {
                        r += tickets[i];
                    }
                    else
                    {
                        r += n;
                    }
                }
                else if (i > k)
                {
                    if (tickets[i] < n - 1)
                    {
                        r += tickets[i];
                    }
                    else
                    {
                        r += n - 1;
                    }
                }
            }
            return r;
        }
    }
}