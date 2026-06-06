using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2332
    /// </summary>
    public class Leet2332
    {
        public int LatestTimeCatchTheBus(int[] buses, int[] passengers, int capacity)
        {
            //排序
            Array.Sort(buses);
            Array.Sort(passengers);

            // 模拟乘客上车
            int j = 0;
            int c = 0;
            foreach (var t in buses)
            {
                for (c = capacity; c > 0 && j < passengers.Length && passengers[j] <= t; c--)
                {
                    j++;
                }
            }

            // 寻找插队时机
            j--;
            int ans = c > 0 ? buses[buses.Length - 1] : passengers[j];
            while (j >= 0 && ans == passengers[j])
            {
                ans--; // 往前找没人到达的时刻
                j--;
            }
            return ans;
        }
    }
}