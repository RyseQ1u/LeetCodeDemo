using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.WebSockets;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3238
    /// </summary>
    public class Leet3238
    {
        public int WinningPlayerCount(int n, int[][] pick)
        {
            var res = 0;
            int[,] tmp = new int[n, 11];
            foreach (var p in pick)
            {
                tmp[p[0], p[1]]++;
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j <= 10; j++)
                {
                    if (tmp[i, j] > i)
                    {
                        res++;
                        break;
                    }
                }
            }

            return res;
        }
    }
}