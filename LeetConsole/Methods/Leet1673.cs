using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1673
    /// </summary>
    public class Leet1673
    {
        public int[] Action()
        {
            //4
            var tasks = new int[] { 2, 4, 3, 3, 5, 4, 9, 6 };
            //2
            //var tasks = new int[] { 3, 5, 2, 6 };

            return MostCompetitive(tasks, 4);
        }

        /// <summary>
        /// 最小字典序列
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int[] MostCompetitive(int[] nums, int k)
        {
            var stack = new Stack<int>();
            var l = nums.Length;
            stack.Push(nums[0]);
            for (int i = 1; i < l; i++)
            {
                var ramin = l - i - 1;

                int peek = stack.Peek();

                while (peek > nums[i] && stack.Count + ramin >= k)
                {
                    stack.Pop();
                    if (!stack.TryPeek(out peek))
                    {
                        break;
                    }
                }
                if (stack.Count < k)
                    stack.Push(nums[i]);
            }

            return stack.Reverse().ToArray();
        }
    }
}