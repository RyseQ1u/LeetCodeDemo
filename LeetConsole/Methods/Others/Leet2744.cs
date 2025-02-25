using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method2744
    /// </summary>
    public class Leet2744
    {
        public int Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8,new ListNode(15))))));
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
            //var head = new string[] { "cd", "ac", "dc", "ca", "zz" };
            var head = new string[] { "ab", "ba", "cc" };
            return MaximumNumberOfStringPairs(head);
        }

        public int MaximumNumberOfStringPairs(string[] words)
        {
            var count = 0;
            HashSet<int> re = new HashSet<int>();
            for (int i = 0; i < words.Length; i++)
            {
                var s = words[i];
                var sr = string.Empty;

                for (int j = s.Length - 1; j >= 0; j--)
                {
                    sr += s[j];
                }
                for (int j = 0; j < words.Length; j++)
                {
                    if (i == j) continue;
                    if (re.Contains(i)) continue;
                    if (words[j] == sr)
                    {
                        count++;
                        re.Add(j);
                    }
                }
            }
            return count;
        }
    }
}