namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// Leet600
    /// </summary>
    public class Leet600
    {
        public int Action()
        {
            int data = 5;
            return FindIntegers(data);
        }

        /// <summary>
        /// 1000000000 输入超时
        /// </summary>
        /// <param name="n"></param>
        /// <returns></returns>
        public int FindIntegers(int n)
        {
            var r = 0;
            for (int i = 0; i <= n; i++)
            {
                var f = false;
                var cur = i;
                while (true)
                {
                    if (cur == 0)
                    {
                        r++;
                        break;
                    }
                    if ((cur & 1) == 1)
                    {
                        if (f)
                        {
                            break;
                        }
                        f = true;
                    }
                    else
                    {
                        f = false;
                    }
                    cur = cur >> 1;
                }
            }

            return r;
        }
    }
}