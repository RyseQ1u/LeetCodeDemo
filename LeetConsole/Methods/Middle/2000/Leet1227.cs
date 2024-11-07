using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1227
    /// </summary>
    public class Leet1227
    {
        public double NthPersonGetsNthSeat2(int n)
        {
            if (n == 1) return 1;
            if (n == 2) return 0.5;
            var t = (double)1 / n;
            var r = t + t * NthPersonGetsNthSeat(n - 1) * (n - 2);
            return r;
        }

        public double NthPersonGetsNthSeat(int n)
        {
            return n > 1 ? 0.5 : 1;
        }
    }
}