using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3153
    /// </summary>
    public class Leet3153
    {
        public long Action()
        {
            var input = new int[] { 13, 23, 12 };

            return SumDigitDifferences(input);
        }

        public long SumDigitDifferences(int[] nums)
        {
            //统计位数上的数字
            long r = 0;
            var f = true;
            while (f)
            {
                Dictionary<int, long> dict = new Dictionary<int, long>();

                for (int i = 0; i < nums.Length; i++)
                {
                    var n = nums[i];
                    if (n == 0)
                    {
                        f = false;
                        break;
                    }
                    var quotient = n / 10;
                    var remainder = n % 10;
                    if (dict.ContainsKey(remainder))
                    {
                        dict[remainder]++;
                    }
                    else
                    {
                        dict.Add(remainder, 1);
                    }
                    nums[i] = quotient;
                }

                //计算当前位数的不同和 不同数字个数*其他不同个数种类 和
                var otherKind = dict.Keys.Count - 1;
                if (otherKind == 0) continue;
                var valueList = dict.Values.ToList();
                for (int i = 0; i < valueList.Count; i++)
                {
                    var cur = valueList[i];
                    for (int j = i + 1; j < valueList.Count; j++)
                    {
                        r += cur * valueList[j];
                    }
                }
            }
            return r;
        }

        /// <summary>
        /// 优化计算
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        public long SumDigitDifferences_V2(int[] nums)
        {
            //统计位数上的数字
            long r = 0;
            var f = true;
            int count = nums.Length;
            while (f)
            {
                Dictionary<int, long> dict = new Dictionary<int, long>();
                for (int i = 0; i < count; i++)
                {
                    var n = nums[i];
                    if (n == 0)
                    {
                        f = false;
                        break;
                    }
                    var quotient = n / 10;
                    var remainder = n % 10;
                    if (dict.ContainsKey(remainder))
                    {
                        dict[remainder]++;
                    }
                    else
                    {
                        dict.Add(remainder, 1);
                    }
                    nums[i] = quotient;
                }

                //计算当前位数的不同和 不同数字个数*其他不同个数种类 和

                foreach (var v in dict.Values)
                {
                    //本身 * 不同的数
                    r += (long)(count - v) * v;
                }
            }
            //由于重复计算 结果需要除以二
            return r / 2;
        }

        public long SumDigitDifferences_V3(int[] nums)
        {
            long res = 0;
            int n = nums.Length;
            while (nums[0] > 0)
            {
                int[] cnt = new int[10];
                for (int i = 0; i < n; i++)
                {
                    cnt[nums[i] % 10]++;
                    nums[i] /= 10;
                }
                for (int i = 0; i < 10; i++)
                {
                    res += (long)(n - cnt[i]) * cnt[i];
                }
            }
            return res / 2;
        }
    }
}