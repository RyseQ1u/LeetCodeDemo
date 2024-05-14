using System.Collections.Generic;

namespace LeetCode.Methods
{
    public class Leet2244
    {
        public int Action()
        {
            //var tasks = new int[] { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };
            var tasks = new int[] { 66, 66, 63, 61, 63, 63, 64, 66, 66, 65, 66, 65, 61, 67, 68, 66, 62, 67, 61, 64, 66, 60, 69, 66, 65, 68, 63, 60, 67, 62, 68, 60, 66, 64, 60, 60, 60, 62, 66, 64, 63, 65, 60, 69, 63, 68, 68, 69, 68, 61 };
            var r = MinimumRounds2(tasks);
            return r;
        }

        /// <summary>
        /// 方法一
        /// </summary>
        /// <param name="tasks"></param>
        /// <returns></returns>
        public int MinimumRounds(int[] tasks)
        {
            var r = 0;
            Dictionary<int, int> keys = new Dictionary<int, int>();
            foreach (var task in tasks)
            {
                if (keys.ContainsKey(task))
                {
                    keys[task]++;
                }
                else
                {
                    keys.Add(task, 1);
                }
            }

            //判断是否存在<2的
            foreach (var k in keys.Keys)
            {
                if (keys[k] < 2)
                {
                    return -1;
                }
                //先判断是否能被3整除

                var re = keys[k] % 3;

                //能被3整除
                if (re == 0)
                {
                    r += keys[k] / 3;
                }

                //余数能被2整除
                else if (re == 2)
                {
                    r += keys[k] / 3;
                    r++;
                }
                else
                {
                    var n = 1;
                    var c = keys[k];
                    var quotient = keys[k] / 3;
                    var re3 = keys[k] % 3;
                    while (quotient >= n)
                    {
                        re3 = re3 + 3 * n;
                        re = re3 % 2;
                        if (re == 0)
                        {
                            r += quotient - n + re3 / 2;
                            break;
                        }
                        else
                        {
                            n++;
                        }
                    }
                }
            }

            return r;
        }

        /// <summary>
        /// 方法二
        /// </summary>
        /// <param name="tasks"></param>
        /// <returns></returns>
        public int MinimumRounds2(int[] tasks)
        {
            var r = 0;
            Dictionary<int, int> keys = new Dictionary<int, int>();
            foreach (var task in tasks)
            {
                if (keys.ContainsKey(task))
                {
                    keys[task]++;
                }
                else
                {
                    keys.Add(task, 1);
                }
            }

            //判断是否存在<2的
            foreach (var k in keys.Keys)
            {
                if (keys[k] < 2)
                {
                    return -1;
                }
                //先判断是否能被3整除

                var re = keys[k] % 3;

                //能被3整除
                if (re == 0)
                {
                    r += keys[k] / 3;
                }
                else
                {
                    r += keys[k] / 3 + 1;
                }
            }

            return r;
        }
    }
}