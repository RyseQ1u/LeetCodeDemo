using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///2706
    /// </summary>
    public class Leet466
    {
        public int Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            string s1 = "aaa", s2 = "aa";
            int n1 = 3, n2 = 1;

            return GetMaxRepetitions(s1, n1, s2, n2);
        }

        public int GetMaxRepetitions(string s1, int n1, string s2, int n2)
        {
            int r = 0;
            if (Contains(s2, s1))
            {
                r = n1 / n2;
            }
            return r;
        }

        /// <summary>
        /// s1可以从s2中获取
        /// </summary>
        /// <param name="s1"></param>
        /// <param name="s2"></param>
        /// <returns></returns>
        public bool Contains(string s1, string s2)
        {
            var r = true;
            List<bool> rb = new List<bool>();
            for (int i = 0; i < s1.Length; i++)
            {
                rb.Add(false);
                for (int j = i; j < s2.Length; j++)
                {
                    if (rb[i]) break;
                    if (s1[i] == s2[j])
                    {
                        rb[i] = true;
                    }
                }
            }
            rb.ForEach(p => r = r && p);
            return r;
        }
    }
}