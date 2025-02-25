using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3159
    /// </summary>
    public class Leet3159
    {
        public int[] OccurrencesOfElement(int[] nums, int[] queries, int x)
        {
            var res = new int[queries.Length];
            //遍历 nums 记录x出现的下标
            //记录 num index
            var dict = new Dictionary<int, int>();
            //记录 出现次数
            int n = 1;
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] == x) dict.Add(n++, i);
            }
            //遍历 queries 构建返回结果
            for (int i = 0; i < queries.Length; i++)
            {
                int q = queries[i];
                //判断 次数是否存在
                if (dict.ContainsKey(q))
                {
                    res[i] = dict[q];
                }
                //否 返回-1
                else
                {
                    res[i] = -1;
                }
            }
            return res;
        }

        /// <summary>
        /// 优化：使用list替换dictionary
        /// 1.使用list记录x出现的下标
        /// 2.若querise 的值大于list的长度 res=-1 否则 res = querise-1
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="queries"></param>
        /// <param name="x"></param>
        /// <returns></returns>
        public int[] OccurrencesOfElement_V2(int[] nums, int[] queries, int x)
        {
            var res = new int[queries.Length];
            //遍历 nums 记录x出现的下标
            //记录 num index
            var list = new List<int>();
            //记录 出现次数
            int n = 1;
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] == x) list.Add(i);
            }
            //遍历 queries 构建返回结果
            for (int i = 0; i < queries.Length; i++)
            {
                int q = queries[i];
                if (q > list.Count)
                {
                    res[i] = -1;
                }
                else
                {
                    res[i] = list[q - 1];
                }
            }
            return res;
        }
    }
}