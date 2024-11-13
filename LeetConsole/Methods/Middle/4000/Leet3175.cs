using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3175
    /// </summary>
    public class Leet3175
    {
        /// <summary>
        /// 一次遍历
        /// </summary>
        /// <param name="skills"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int FindWinningPlayer(int[] skills, int k)
        {
            //记录最大的index
            var r = 0;
            //记录连胜记录
            var n = 0;
            for (int i = 0; i < skills.Length - 1; i++)
            {
                if (skills[r] > skills[i + 1])
                {
                    n++;
                }
                else
                {
                    r = i + 1;
                    n = 1;
                }
                if (n == k)
                {
                    break;
                }
            }
            return r;
        }

        /// <summary>
        /// 超时
        /// </summary>
        /// <param name="skills"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int FindWinningPlayer2(int[] skills, int k)
        {
            var queue = new Queue<int>();
            var dict = new Dictionary<int, int>();
            for (int i = 0; i < skills.Length; i++)
            {
                var skill = skills[i];
                queue.Enqueue(skill);
                dict.Add(skill, i);
            }
            var n = 0;
            var max = queue.Dequeue();
            while (n < k)
            {
                var b = queue.Dequeue();
                if (max > b)
                {
                    queue.Enqueue(b);
                    n++;
                }
                else
                {
                    n = 1;
                    queue.Enqueue(max);
                    max = b;
                }
            }
            return dict[max];
        }
    }
}