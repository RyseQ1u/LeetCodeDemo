using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 729
    /// </summary>
    public class Leet729
    {
        public void Action()
        {
        }
    }

    public class MyCalendar
    {
        private List<(int s, int e)> DateList { get; set; } = new List<(int, int)>();

        public MyCalendar()
        {
        }

        public bool Book(int startTime, int endTime)
        {
            bool f = true;

            //查询日期是否有冲突
            for (int i = 0; i < DateList.Count; i++)
            {
                //判断两个数组是否相交
                //区间1的起点小于或等于区间2的终点 且 区间2的起点小于或等于区间1的终点

                if (DateList[i].s < endTime && startTime < DateList[i].e)
                {
                    f = false;
                    break;
                }
            }
            if (f)
                DateList.Add((startTime, endTime));

            return f;
        }
    }
}