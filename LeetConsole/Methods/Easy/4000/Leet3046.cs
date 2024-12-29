using System.Collections.Generic;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3046
    /// </summary>
    public class Leet3046
    {
        public bool IsPossibleToSplit(int[] nums)
        {
            var res = true;
            //记录数字出现次数
            var dict = new Dictionary<int, int>();
            foreach (var i in nums)
            {
                if (dict.ContainsKey(i))
                {
                    if (dict[i] == 2)
                    {
                        res = false;
                        break;
                    }
                    dict[i]++;
                }
                else
                {
                    dict[i] = 1;
                }
            }
            return res;
        }

        /// <summary>
        /// 题目num的范围是0-100
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        public bool IsPossibleToSplit_V2(int[] nums)
        {
            var res = true;
            //记录数字出现次数
            var dict = new int[101];
            foreach (var i in nums)
            {   
                if (++dict[i] == 3)
                {
                    res = false;
                    break;
                }
            }
            return res;
        }
    }
}