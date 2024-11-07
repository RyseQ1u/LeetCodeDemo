using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1832
    /// </summary>
    public class Leet1832
    {
        public bool Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";

            //string s = "aabcbaaaaaaaaaaaaaabdsbdsbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbsdddddddddddddddddddddddddddddddddddddddddddddbbbbbbbbbbbbbbbweeeeeeeeeeeeeeeeeeeeennnnnnnnnnnnnnnxczhpolipugytjnheqwoudinzxlvkmnoeqwthohwphaosanhxzvzxbfhayhtgpasbfaaaaaaaaaaaa";
            string s = "leetcode";
            return Function1(s);
        }

        public bool Function1(string s)
        {
            if (s.Length < 26)
            {
                return false;
            }
            HashSet<char> ts = new HashSet<char>();
            foreach (var c in s)
            {
                ts.Add(c);
                if (ts.Count == 26) return true;
            }
            return false;
        }

        public bool Function2(string sentence)
        {
            bool[] exist = new bool[26];
            foreach (char c in sentence)
            {
                exist[c - 'a'] = true;
            }
            foreach (bool x in exist)
            {
                if (!x)
                {
                    return false;
                }
            }
            return true;
        }
    }
}