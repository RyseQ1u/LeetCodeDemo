using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// 503
    /// </summary>
    public class Leet503
    {
        public int[] Action()
        {
            //2
            int[] data = new int[] { 1, 2, 1 };

            return NextGreaterElements2(data);
        }

        /// <summary>
        /// 暴力遍历
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        public int[] NextGreaterElements(int[] nums)
        {
            var r = new int[nums.Length];
            for (int i = 0; i < nums.Length; i++)
            {
                int max = -1;
                int j = i + 1;
                var f = false;
                while (true)
                {
                    if (j == nums.Length)
                    {
                        j = 0;
                    }
                    if (j == i) break;
                    if (nums[i] < nums[j])
                    {
                        max = nums[j];
                        f = true;
                        break;
                    }
                    j++;
                }
                if (f)
                {
                    r[i] = max;
                }
                else
                {
                    r[i] = -1;
                }
            }
            return r;
        }

        /// <summary>
        /// 单调栈
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        public int[] NextGreaterElements2(int[] nums)
        {
            int n = nums.Length;
            int[] ans = new int[n];
            Stack<int> st = new Stack<int>();
            for (int i = 2 * n - 1; i >= 0; i--)
            {
                int x = nums[i % n];
                while (st.Any() && x >= st.Peek())
                {
                    // 由于 x 的出现，栈顶元素永远不会是左边元素的「下一个更大元素」
                    st.Pop();
                }
                if (i < n)
                {
                    if (st.Any())
                    {
                        ans[i] = st.Peek();
                    }
                    else { ans[i] = -1; }
                }

                st.Push(x);
            }
            return ans;
        }
    }
}