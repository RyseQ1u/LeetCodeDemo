using System;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1087
    /// </summary>
    public class Leet1087
    {
        public int MinSpeedOnTime2(int[] dist, double hour)
        {
            //判断是否有解
            if (dist.Length - 1 > hour) return -1;
            //找距离最大值
            var max = 0;
            foreach (var d in dist)
            {
                max = Math.Max(max, d);
            }
            if (max - 1 > hour) return -1;

            //最后一趟车的时间
            var lastHour = Math.Round(hour - (dist.Length - 1), 2);
            if (lastHour < 0) return -1;
            return (int)Math.Ceiling(dist.Last() / lastHour);
        }

        public int MinSpeedOnTime(int[] dist, double hour)
        {
            int n = dist.Length;
            // 将 hour 乘 100 以转为整数
            long hr = (long)Math.Round(hour * 100);
            // 时间必须要大于路程段数减 1
            if (hr <= (n - 1) * 100)
            {
                return -1;
            }
            // 二分
            int l = 1;
            int r = 10000000;
            while (l < r)
            {
                int mid = l + (r - l) / 2;
                // 判断当前时速是否满足时限
                long t = 0;
                // 前 n-1 段中第 i 段贡献的时间： ceil(dist[i] / mid)
                for (int i = 0; i < n - 1; ++i)
                {
                    t += (dist[i] - 1) / mid + 1;
                }
                // 最后一段贡献的时间： dist[n-1] / mid
                t *= mid;
                t += dist[n - 1];
                if (t * 100 <= hr * mid)
                { // 通分以转化为整数比较
                    r = mid;
                }
                else
                {
                    l = mid + 1;
                }
            }
            return l; // 满足条件的最小时速
        }
    }
}