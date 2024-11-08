using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3259
    /// </summary>
    public class Leet3259
    {
        /// <summary>
        /// 优化掉数组
        /// </summary>
        /// <param name="energyDrinkA"></param>
        /// <param name="energyDrinkB"></param>
        /// <returns></returns>
        public long MaxEnergyBoost2(int[] energyDrinkA, int[] energyDrinkB)
        {
            var n = energyDrinkA.Length;
            //记录当i时选A或B时的最大值
            long dp1 = 0;
            long dp2 = 0;
            long tmp = 0;
            for (int i = 0; i < n; i++, tmp = dp1)
            {
                //第i次选A的情况
                //假设上次选A 当前值为原来的A值加i值
                //假设上次选B 当前值不能加i值
                //最大值会在 上次选A+当前Ai值 和 上次选B的最大值 中出现
                dp1 = Math.Max(dp1 + energyDrinkA[i], dp2);
                //选B的情况同理，dp[2]记录上一次计算的选A最大值
                dp2 = Math.Max(dp2 + energyDrinkB[i], tmp);
            }
            ////可以优化内存
            //if (energyDrinkA.Length > 10000) GC.Collect();
            //最后返回最大值
            return Math.Max(dp1, dp2);
        }

        public long MaxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB)
        {
            var n = energyDrinkA.Length;
            //记录当i时选A或B时的最大值
            long[] dp = new long[3];
            for (int i = 0; i < n; i++, dp[2] = dp[0])
            {
                //第i次选A的情况
                //假设上次选A 当前值为原来的A值加i值
                //假设上次选B 当前值不能加i值
                //最大值会在 上次选A+当前Ai值 和 上次选B的最大值 中出现
                dp[0] = Math.Max(dp[0] + energyDrinkA[i], dp[1]);
                //选B的情况同理，dp[2]记录上一次计算的选A最大值
                dp[1] = Math.Max(dp[1] + energyDrinkB[i], dp[2]);
            }
            //最后返回最大值
            return Math.Max(dp[0], dp[1]);
        }
    }
}