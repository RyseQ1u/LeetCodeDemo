using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3164
    /// </summary>
    public class Leet3164
    {
        public long NumberOfPairs(int[] nums1, int[] nums2, int k)
        {
            long r = 0;
            var l1 = nums1.Length;
            var l2 = nums2.Length;
            // 枚举因子
            Dictionary<int, int> cnt = new Dictionary<int, int>();
            for (int i = 0; i < l1; i++)
            {
                var n = nums1[i];
                if (n % k != 0)
                {
                    continue;
                }
                n /= k;
                for (int d = 1; d * d <= n; d++)
                {
                    if (n % d > 0)
                    {
                        continue;
                    }
                    // cnt[n]++
                    if (cnt.ContainsKey(d))
                    {
                        cnt[d]++;
                    }
                    else
                    {
                        cnt.Add(d, 1);
                    }
                    if (d * d < n)
                    {
                        // cnt[n/d]++
                        var n2 = n / d;
                        if (cnt.ContainsKey(n2))
                        {
                            cnt[n2]++;
                        }
                        else
                        {
                            cnt.Add(n2, 1);
                        }
                    }
                }
            }

            foreach (int n in nums2)
            {
                if (cnt.ContainsKey(n))
                {
                    r += cnt[n];
                }
            }
            return r;
        }

        public long NumberOfPairs2(int[] nums1, int[] nums2, int k)
        {
            long r = 0;
            var l1 = nums1.Length;
            var l2 = nums2.Length;
            //统计个数

            var n2Dict = new Dictionary<int, long>();

            for (int i = 0; i < l2; i++)
            {
                if (n2Dict.ContainsKey(nums2[i]))
                {
                    n2Dict[nums2[i]]++;
                }
                else
                {
                    n2Dict.Add(nums2[i], 1);
                }
            }
            var dict = new Dictionary<int, long>();

            for (int i = 0; i < l1; i++)
            {
                if (nums1[i] % k != 0) continue;
                nums1[i] /= k;
                if (dict.ContainsKey(nums1[i]))
                {
                    r += dict[nums1[i]];
                    continue;
                }
                foreach (var k2 in n2Dict.Keys)
                {
                    if (nums1[i] % k2 == 0)
                    {
                        r += n2Dict[k2];
                        if (dict.ContainsKey(nums1[i]))
                        {
                            dict[nums1[i]] += n2Dict[k2];
                        }
                        else
                        {
                            dict.Add(nums1[i], n2Dict[k2]);
                        }
                    }
                }
            }

            return r;
        }
    }
}