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
        public int Action()
        {
            ////3
            //var input1 = new int[] { 1, 2, 8, 9 };

            //1
            var input1 = new int[] { 3, 3, 1 };

            return MaxmiumScore(input1, 1);
        }

        public int MaxmiumScore2(int[] cards, int cnt)
        {
            Array.Sort(cards);

            int r = 0;
            int curSum = 0;
            int odd = -1, even = -1;
            int end = cards.Length - cnt;
            for (int i = cards.Length - 1; i >= end; i--)
            {
                curSum += cards[i];
                if ((cards[i] & 1) != 0)
                {
                    odd = cards[i];
                }
                else
                {
                    even = cards[i];
                }
            }

            if ((curSum % 2) == 0)
            {
                return curSum;
            }

            //找最大的奇数
            for (int i = cards.Length - cnt - 1; i >= 0; i--)
            {
                if ((cards[i] & 1) != 0)
                {
                    if (even != -1)
                    {
                        r = Math.Max(r, curSum - even + cards[i]);
                        break;
                    }
                }
            }
            //找最大的偶数
            for (int i = cards.Length - cnt - 1; i >= 0; i--)
            {
                if ((cards[i] & 1) == 0)
                {
                    if (odd != -1)
                    {
                        r = Math.Max(r, curSum - odd + cards[i]);
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