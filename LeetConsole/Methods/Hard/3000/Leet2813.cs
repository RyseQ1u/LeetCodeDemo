using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// 2813
    /// </summary>
    public class Leet2813
    {
        public long Action()
        {
            //k=3;
            //int[][] data = new int[][]
            //{
            //    new int[] {3, 1},
            //    new int[] {3, 1},
            //    new int[] {2, 2},
            //    new int[] {5, 3}
            //};

            //2
            int[][] data = new int[][]
{
                new int[] {3, 2},
                new int[] {5, 1},
                new int[] {10, 1},
};

            return FindMaximumElegance(data, 2);
        }

        public long FindMaximumElegance(int[][] items, int k)
        {
            long result = 0;
            //按照利润排序
            Array.Sort(items, (a, b) => b[0].CompareTo(a[0]));
            long count = 0;
            HashSet<int> categories = new HashSet<int>();
            Stack<int> st = new Stack<int>();
            //先选取利润最高的
            for (int i = 0; i < items.Length; i++)
            {
                if (i < k)
                {
                    count += items[i][0];
                    //判断是否已存在相同类型的货物
                    if (!categories.Add(items[i][1]))
                    {
                        //记录利润值
                        st.Push(items[i][0]);
                    }
                }
                //判断利润前项是否有重复的类型
                else if (st.Count > 0)
                {
                    //判断是否是新的类型
                    //只有加入新的类型才有可能在总利润和减少的情况下让结果变大
                    if (categories.Add(items[i][1]))
                    {
                        //将利润较小的类型项弹出
                        //总利润减去该利润值
                        count -= st.Pop();
                        //加入新的利润值
                        count += items[i][0];
                    }
                }
                result = Math.Max(result, count + (long)Math.Pow(categories.Count, 2));
                //如果不同类型已经最大值跳出循环
                if (categories.Count == k)
                {
                    break;
                }
            }

            return result;
        }
    }
}