using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 1287
    /// </summary>
    public class Leet1287
    {
        public int FindSpecialInteger(int[] arr)
        {
            var res = arr[0];
            var max = Math.Ceiling(arr.Length * 0.25);
            int left = 0, right = 0;
            while (right < arr.Length)
            {
                if (left == right)
                {
                    right++;
                }
                else
                {
                    if (right - left + 1 > max)
                    {
                        res = arr[left];
                        break;
                    }
                }
            }
            return res;
        }

        public int FindSpecialInteger_V2(int[] arr)
        {
            int n = arr.Length;
            int cur = arr[0], cnt = 0;
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