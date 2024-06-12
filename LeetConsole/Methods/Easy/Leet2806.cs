using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 2806
    /// </summary>
    public class Leet2806
    {
        public int Action()
        {
            //var input = "0111";
            var input = 9;

            return AccountBalanceAfterPurchase(input);
        }

        public int AccountBalanceAfterPurchase(int purchaseAmount)
        {
            var result = 0;
            result = 100 - (int)(Math.Round(((double)purchaseAmount / 10)) * 10);
            return result;
        }
    }
}