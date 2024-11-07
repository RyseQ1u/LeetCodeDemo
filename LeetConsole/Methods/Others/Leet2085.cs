using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method2085
    /// </summary>
    public class Leet2085
    {
        public int Action()
        {
            var s1 = new string[] { "leetcode", "is", "amazing", "as", "is" };
            var s2 = new string[] { "amazing", "leetcode", "is" };
            return CountWords(s1, s2);
        }

        public int CountWords(string[] words1, string[] words2)
        {
            var d1 = new Dictionary<string, int>();
            var d2 = new Dictionary<string, int>();
            foreach (var w in words1)
            {
                if (d1.ContainsKey(w))
                {
                    d1[w] += 1;
                    continue;
                }
                d1.Add(w, 1);
            }
            foreach (var w in words2)
            {
                if (d2.ContainsKey(w))
                {
                    d2[w] += 1;
                    continue;
                }
                d2.Add(w, 1);
            }
            var d12 = d1.Where(p => p.Value == 1).Select(p => p.Key).ToList();
            var d22 = d2.Where(p => p.Value == 1).Select(p => p.Key).ToList();

            return d12.Intersect(d22).Count();
        }
    }
}