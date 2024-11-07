using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// LCP40
    /// </summary>
    public class Leet40
    {
        public int MaxmiumScore2(int[] cards, int cnt)
        {
            Array.Sort(cards);

            int r = 0;
            int curSum = 0;
            //记录最后一个奇偶数 因为已经排序 得到的是当前数集合里小的奇偶数
            int minOdd = -1, minEven = -1;
            int end = cards.Length - cnt;
            for (int i = cards.Length - 1; i >= end; i--)
            {
                curSum += cards[i];
                if ((cards[i] & 1) == 0)
                {
                    minEven = cards[i];
                }
                else
                {
                    minOdd = cards[i];
                }
            }

            if ((curSum & 1) == 0)
            {
                return curSum;
            }

            //取出一个最小的奇数 再找最大的奇数 已排序下一个奇数即所求
            for (int i = cards.Length - cnt - 1; i >= 0; i--)
            {
                if ((cards[i] & 1) != 0)
                {
                    if (minEven != -1)
                    {
                        r = Math.Max(r, curSum - minEven + cards[i]);
                        break;
                    }
                }
            }
            //取出一个最小的偶数 再找最大的偶数 已排序下一个偶数即所求
            for (int i = cards.Length - cnt - 1; i >= 0; i--)
            {
                if ((cards[i] & 1) == 0)
                {
                    if (minOdd != -1)
                    {
                        r = Math.Max(r, curSum - minOdd + cards[i]);
                        break;
                    }
                }
            }

            return r;
        }

        public int MaxmiumScore(int[] cards, int cnt)
        {
            var r = 0;
            var reArr = cards.OrderBy(x => x).ToArray();
            //从大到小

            var sum = 0;
            for (int i = reArr.Length - 1; i >= reArr.Length - cnt; i--)
            {
                sum += reArr[i];
            }
            if (sum % 2 == 0)
            {
                r = sum;
            }

            return r;
        }
    }
}