using System;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    public class Leet904
    {
        public int Action()
        {
            int[] fruits = new int[] { 1, 2, 3, 2, 4 };
            return Function1(fruits);
        }

        /// <summary>
        /// 904
        /// </summary>
        /// <returns></returns>
        public int Function1(int[] fruits)
        {
            IDictionary<int, int> cnt = new Dictionary<int, int>();
            int l = 0, a = 0;
            for (int r = 0; r < fruits.Length; r++)
            {
                cnt.TryAdd(fruits[r], 0);
                ++cnt[fruits[r]];
                while (cnt.Count > 2)
                {
                    --cnt[fruits[l]];
                    if (cnt[fruits[l]] == 0)
                        cnt.Remove(fruits[l]);
                    ++l;
                }
                a = Math.Max(a, r - l + 1);
            }
            return a;
        }
    }
}