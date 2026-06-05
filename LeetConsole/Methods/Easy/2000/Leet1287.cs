using System;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 1287
    /// </summary>
    public class Leet1287
    {
        public int FindSpecialInteger(int[] arr)
        {
            int n = arr.Length;
            int cur = arr[0], cnt = 0;
            var max = Math.Ceiling(arr.Length * 0.25);
            for (int i = 0; i < n; ++i)
            {
                if (arr[i] == cur)
                {
                    ++cnt;
                    if (cnt * 4 > n)
                    {
                        return cur;
                    }
                }
                else
                {
                    cur = arr[i];
                    cnt = 1;
                }
            }
            return -1;
        }
    }
}