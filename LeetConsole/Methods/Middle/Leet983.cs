using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 983
    /// </summary>
    public class Leet983
    {
        public int MincostTickets(int[] days, int[] costs)
        {
            var lastDay = days[days.Length - 1];
            var isTravel = new bool[lastDay + 1];
            foreach (var day in days)
            {
                isTravel[day] = true;
            }

            var memo = new int[lastDay + 1];
            return Dfs(lastDay, isTravel, costs, memo);
        }

        private int Dfs(int i, bool[] isTravel, int[] costs, int[] memo)
        {
            if (i <= 0)
            {
                return 0;
            }
            if (memo[i] > 0)
            { // 之前计算过
                return memo[i];
            }
            if (!isTravel[i])
            {
                return memo[i] = Dfs(i - 1, isTravel, costs, memo);
            }
            return memo[i] = Math.Min(Dfs(i - 1, isTravel, costs, memo) + costs[0],
                             Math.Min(Dfs(i - 7, isTravel, costs, memo) + costs[1],
                                      Dfs(i - 30, isTravel, costs, memo) + costs[2]));
        }
    }
}