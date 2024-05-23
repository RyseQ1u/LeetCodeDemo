using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2831
    /// </summary>
    public class Leet2831
    {
        public long Action()
        {
            //var tasks = new int[] { 1, 2, 3 };
            //var tasks = new int[] { 5, 9, 4, 4, 8, 9, 9, 8, 7, 3 };
            //var tasks = new int[] { 5, 1, 5 };
            //var tasks = new int[] { 5,2,1 };
            //var tasks = new int[] { 5, 7, 5, 7, 9, 7 };
            //var tasks = new int[] { 5, 7, 5, 7, 9, 7 };
            //var tasks = new int[] { 8, 8, 2, 6 };
            //var tasks = new List<int>() { 1, 3, 2, 3, 1, 3 };
            //0
            var tasks = new List<int>() { 1, 2, 1 };
            //var tasks = new List<int>() { 5, 4, 4, 2, 4, 8, 9, 1, 3, 4, 7, 5, 7, 4 };
            //0
            //var tasks = new List<int>() { 3, 1, 5, 3, 1, 1 };

            return LongestEqualSubarray3(tasks, 0);
        }

        /// <summary>
        /// 会超时 暴力
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int LongestEqualSubarray(IList<int> nums, int k)
        {
            var r = 1;
            if (nums.Count == 0) return 0;
            for (int i = 0; i < nums.Count; i++)
            {
                int jump = 0;
                var c = 1;
                for (int j = i + 1; j < nums.Count; j++)
                {
                    if (nums[i] == nums[j])
                    {
                        c++;
                    }
                    else if (jump < k)
                    {
                        jump++;
                    }
                    else
                    {
                        break;
                    }
                    r = Math.Max(r, c);
                }
            }
            return r;
        }

        /// <summary>
        /// 滑动窗口
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int LongestEqualSubarray2(IList<int> nums, int k)
        {
            var r = 0;
            //记录每个数的index
            var dict = new Dictionary<int, List<int>>();
            for (int i = 0; i < nums.Count; i++)
            {
                if (!dict.ContainsKey(nums[i]))
                {
                    //记录第一次出现的位置
                    dict.Add(nums[i], new List<int> { i });
                }
                else
                {
                    dict[nums[i]].Add(i);
                }
            }

            //计算间隔
            //按出现次数排序
            var indexs = dict.Values.OrderByDescending(p => p.Count).ToList();
            for (int i = 0; i < indexs.Count; i++)
            {
                //如果总数不大于当前结果跳出
                if (indexs[i].Count <= r) break;
                int left = 0;
                for (int right = 0; right < indexs[i].Count; right++)
                {
                    //原长度
                    var olength = indexs[i][right] - indexs[i][left] + 1;
                    var sampleCount = (right - left + 1);
                    while (olength - sampleCount > k)
                    {
                        left++;
                        //原长度
                        olength = indexs[i][right] - indexs[i][left] + 1;
                        //相同的数量
                        sampleCount = (right - left + 1);
                        //用原长度减去相同的个数 得到需要跳过的数量
                        //如果需要跳过的数量大于K将l增加
                    }
                    r = Math.Max(r, right - left + 1);
                }
            }

            return r;
        }

        /// <summary>
        /// 滑动窗口 优化计算过程
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int LongestEqualSubarray3(IList<int> nums, int k)
        {
            var r = 0;
            //记录每个数的index
            var dict = new Dictionary<int, List<int>>();
            for (int i = 0; i < nums.Count; i++)
            {
                if (!dict.ContainsKey(nums[i]))
                {
                    //记录第一次出现的位置
                    dict.Add(nums[i], new List<int> { i });
                }
                else
                {
                    //优化计算
                    //原长度
                    //olength = indexs[i][right] - indexs[i][left] + 1;
                    //相同的数量
                    //sampleCount = (right - left + 1);
                    //差 indexs[i][right] - indexs[i][left] + 1 - (right - left + 1)
                    // indexs[i][right] - indexs[i][left] - (right - left)
                    //indexs[i][right]- right - (indexs[i][left] - left)
                    //所以可以记录indexs[i][j]- j
                    dict[nums[i]].Add(i - dict[nums[i]].Count);
                }
            }

            //计算间隔
            //按出现次数排序
            for (int i = 0; i < indexs.Count; i++)
            {
                //如果总数不大于当前结果跳出
                if (dict[i].Count <= r) break;
                int left = 0;
                for (int right = 0; right < dict[i].Count; right++)
                {
                    //原长度
                    while (dict[i][right] - dict[i][left] > k)
                    {
                        left++;
                    }
                    r = Math.Max(r, right - left + 1);
                }
            }

            return r;
        }
    }
}