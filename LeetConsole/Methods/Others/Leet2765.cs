using System;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method2765
    /// </summary>
    public class Leet2765
    {
        public int Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            var n = new int[] { 2, 3, 4, 3, 4 };
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
            //var head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
            return AlternatingSubarray2(n);
        }

        public int AlternatingSubarray(int[] n)
        {
            var r = 0;
            var l = new List<int>();
            for (int i = 0; i < n.Length - 1; i++)
            {
                l.Add(n[i] - n[i + 1]);
            }
            var s = 0;
            var e = 0;
            var f = false;
            for (int i = 0; i < l.Count; i++)
            {
                var tr = l[i];
                var t = 0;
                for (int j = i + 1; j < l.Count; j++)
                {
                    if (tr + l[j] == 0)
                    {
                        t++;
                        tr += l[j];
                    }
                }

                r = Math.Max(r, t);
            }
            return r;
        }

        public int AlternatingSubarray2(int[] nums)
        {
            int res = -1;
            int n = nums.Length;
            for (int firstIndex = 0; firstIndex < n; firstIndex++)
            {
                for (int i = firstIndex + 1; i < n; i++)
                {
                    int length = i - firstIndex + 1;
                    if (nums[i] - nums[firstIndex] == (length - 1) % 2)
                    {
                        res = Math.Max(res, length);
                    }
                    else
                    {
                        break;
                    }
                }
            }
            return res;
        }
    }
}