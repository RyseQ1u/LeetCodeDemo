using System.Collections;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1671
    /// </summary>
    public class Leet1671
    {
        public int Action()
        {
            //var root1 = new TreeNode(1,new TreeNode(3,new TreeNode(5)),new TreeNode(2));
            //var root2 = new TreeNode(2,new TreeNode(1,null,new TreeNode(4)),new TreeNode(3,null,new TreeNode(7)));
            return MinimumMountainRemovals(new int[0]);
        }

        public int MinimumMountainRemovals(int[] nums)
        {
            Stack stack = new Stack();
            bool falg = false;
            stack.Push(nums[0]);
            for (int i = 1; i < nums.Length; i++)
            {
                if (falg)
                {
                }
                else
                {
                    if ((int)stack.Peek() < nums[i])
                    {
                        stack.Push(nums[i]);
                    }
                }
            }
            return 0;
        }

        public int MinimumMountainRemovals2(int[] nums)
        {
            //最大的数字
            int maxNmuber = nums[0];
            int lastNmuber = 0;
            bool flag = false;
            //递增索引集合
            List<int> ii = new List<int>();
            //递减索引集合
            List<int> di = new List<int>();
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] > maxNmuber)
                {
                    maxNmuber = nums[i];
                }
                else
                {
                    if (lastNmuber > nums[i])
                    {
                        di.Add(nums[i]);
                    }
                }
                lastNmuber = nums[i];
            }
            return 0;
        }
    }
}