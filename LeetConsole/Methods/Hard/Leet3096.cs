using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// 3096
    /// </summary>
    public class Leet3096
    {
        public int MinimumLevels(int[] possible)
        {
            var r = -1;
            //计算前缀和
            var prefixsum = new int[possible.Length + 1];
            for (int i = 0; i < possible.Length; i++)
            {
                prefixsum[i + 1] = prefixsum[i] + (possible[i] == 0 ? -1 : 1);
            }
            for (int i = 1; i < prefixsum.Length; i++)
            {
                if (2 * prefixsum[i] > prefixsum[prefixsum.Length - 1])
                {
                    return i;
                }
            }
            return r;
        }
    }
}