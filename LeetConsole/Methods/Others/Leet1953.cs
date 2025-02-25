using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1953
    /// </summary>
    public class Leet1953
    {
        public long Action()
        {
            //var tasks = new int[] { 1, 2, 3 };
            //var tasks = new int[] { 5, 9, 4, 4, 8, 9, 9, 8, 7, 3 };
            //var tasks = new int[] { 5, 1, 5 };
            //var tasks = new int[] { 5,2,1 };
            //var tasks = new int[] { 5, 7, 5, 7, 9, 7 };
            //var tasks = new int[] { 5, 7, 5, 7, 9, 7 };
            var tasks = new int[] { 8, 8, 2, 6 };

            return NumberOfWeeks(tasks);
        }

        public long NumberOfWeeks(int[] milestones)
        {
            long r = 0;
            //最耗时的工作
            int max = milestones[0];
            long other = 0;
            foreach (int i in milestones)
            {
                max = Math.Max(max, i);
                other += i;
            }
            other -= max;
            if (max > other + 1)
            {
                return other * 2 + 1;
            }
            else
            {
                return max + other;
            }
        }

        public long NumberOfWeeksF(int[] milestones)
        {
            long r = 0;
            if (milestones.Length == 1) return 1;
            Array.Sort(milestones);
            int[] sum = new int[milestones.Length + 1];
            //计算前缀和
            for (int i = 1; i < milestones.Length + 1; i++)
            {
                sum[i] = sum[i - 1] + milestones[i - 1];
            }
            //从后往前
            int last = 0;
            for (int i = milestones.Length - 1; i > 0; i--)
            {
                last = 0;
                if (sum[i] >= milestones[i])
                {
                    if (sum[i] == milestones[i] + 1)
                    {
                        last = sum[i + 1];
                        break;
                    }
                    last = milestones[i];
                }
                else
                {
                    if (sum[i] + 1 == milestones[i])
                    {
                        last = sum[i + 1];
                        break;
                    }
                    last = sum[i] + 1;
                }
                r += last;
            }
            r += last;
            return r;
        }
    }
}