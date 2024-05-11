using System;
using System.Collections.Generic;

namespace ConsoleApp1.Methods
{
    public class Leet2391
    {
        public int Action()
        {
            var r = 0;
            //string[] garbage = new string[] { "G", "P", "GP", "GG" };
            string[] garbage = new string[] { "MMM", "PGM", "GP" };
            int[] travel = new int[] { 3, 10 };
            r = GarbageCollection(garbage, travel);
            return r;
        }

        public int GarbageCollection(string[] garbage, int[] travel)
        {
            var r = 0;
            int m = 0;
            int g = 0;
            int p = 0;
            //倒序查找终点位置
            for (int i = garbage.Length - 1; i >= 0; i--)
            {
                r += garbage[i].Length;
                if (m != 0 && p != 0 && g != 0) continue;
                if (m == 0 && garbage[i].Contains("M"))
                {
                    m = i;
                }
                if (g == 0 && garbage[i].Contains("G"))
                {
                    g = i;
                }
                if (p == 0 && garbage[i].Contains("P"))
                {
                    p = i;
                }
            }
            // 初始化前缀和数组，长度比原数组多1，因为前缀和数组的第一个元素通常是0
            int[] prefixTravel = new int[travel.Length + 1];

            // 计算前缀和
            for (int i = 1; i <= travel.Length; i++)
            {
                prefixTravel[i] = prefixTravel[i - 1] + travel[i - 1];
            }
            r += prefixTravel[m];
            r += prefixTravel[g];
            r += prefixTravel[p];

            return r;
        }
    }
}