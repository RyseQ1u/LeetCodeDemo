using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 779
    /// </summary>
    public class Leet799
    {
        public int Action()
        {
            int n = 30;
            int k = 434991989;
            return Function2(n, k);
        }

        public int Function1(int n, int k)
        {
            List<int> result = new List<int>();
            for (int i = 0; i < n; i++)
            {
                List<int> curResult = new List<int>();
                if (result.Count == 0)
                {
                    curResult.Add(0);
                    result = curResult;
                }
                else
                {
                    foreach (var num in result)
                    {
                        if (num == 0)
                        {
                            curResult.Add(0);
                            curResult.Add(1);
                        }
                        else
                        {
                            curResult.Add(1);
                            curResult.Add(0);
                        }
                    }
                    result = curResult;
                }
            }
            return result[k - 1];
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="sandwiches"></param>
        /// <param name="student"></param>
        /// <returns></returns>
        public int Function2(int n, int k)
        {
            if (n == 1)
            {
                return 0;
            }
            return (k & 1) ^ 1 ^ Function2(n - 1, (k + 1) / 2);
        }
    }
}