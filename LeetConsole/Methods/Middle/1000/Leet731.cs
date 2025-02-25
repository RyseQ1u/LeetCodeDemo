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

        public MyCalendarTwo()
        {
        }

        private List<int[]> DateList { get; set; } = new List<int[]>();

        public bool Book(int startTime, int endTime)
        {
            bool f = true;
            int n = 1;
            //查询日期是否有冲突
            for (int i = 0; i < DateList.Count; i++)
            {
                //判断两个数组是否相交
                //区间1的起点小于或等于区间2的终点 且 区间2的起点小于或等于区间1的终点

                if (DateList[i][0] < endTime && startTime < DateList[i][1])
                {
                    if (DateList[i][2] == 2)
                    {
                        f = false;
                        break;
                    }
                    else
                    {
                        n++;
                        DateList[i][2]++;
                    }
                }
            }
            if (f)
            {
                DateList.Add(new int[3] { startTime, endTime, 1 });
            }

            return f;
        }
    }
}