using System.Collections.Generic;
using System.Linq.Expressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 731
    /// </summary>
    public class Leet731
    {
        public bool Action()
        {
            var mc = new MyCalendarTwo();
            mc.Book(10, 20);
            mc.Book(10, 40);

            return true;
        }
    }

    public class MyCalendarTwo
    {
        /// <summary>
        /// 记录起终点 和 预定次数
        /// </summary>
        private List<(int s, int e, int[] n)> DateList { get; set; } = new List<(int, int, int[])>();

        public MyCalendarTwo()
        {
        }

        public bool Book(int startTime, int endTime)
        {
            bool f = true;
            int n = 1;
            //查询日期是否有冲突
            for (int i = 0; i < DateList.Count; i++)
            {
                //判断两个数组是否相交
                //区间1的起点小于或等于区间2的终点 且 区间2的起点小于或等于区间1的终点

                if (DateList[i].s < endTime && startTime < DateList[i].e)
                {
                    if (DateList[i].n[0] == 2)
                    {
                        f = false;
                        break;
                    }
                    else
                    {
                        n++;
                        DateList[i].n[0]++;
                    }
                }
            }
            if (f)
            {
                DateList.Add((startTime, endTime, new int[1] { n }));
            }

            return f;
        }
    }
}