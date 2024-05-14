using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 809
    /// </summary>
    public class Leet809
    {
        public int Action()
        {
            //string s = "zzzzzyyyyy";
            //var words = new string[] { "zzyy", "zy", "zyy" };
            string s = "heeellooo";
            var words = new string[] { "heello", "hi", "helo" };
            return Function3(s, words);
        }

        public int Function1(string s, string[] words)
        {
            string word = string.Empty;
            for (int i = 0; i < s.Length - 1; i++)
            {
                if (s[i].CompareTo(s[i + 1]) == 0)
                {
                    if (i + 2 < s.Length && s[i].CompareTo(s[i + 2]) == 0)
                    {
                        if (string.IsNullOrEmpty(word) || word[word.Length - 1].CompareTo(s[i + 2]) != 0)
                        {
                            word += s[i + 2];
                            i = i + 1;
                        }
                        else
                        {
                            i = i + 2;
                        }
                        continue;
                    }
                }
                word += (s[i]);
            }
            for (int i = 0; i < words.Length; i++)
            {
                if (words[i].CompareTo(word) == 0) return i + 1;
            }
            return 0;
        }

        public int Function2(string s, string[] words)
        {
            var cList = new List<char>();
            var cCount = new List<int>();
            foreach (var c in s)
            {
                if (cList.Count == 0)
                {
                    cList.Add(c);
                    cCount.Add(1);
                    continue;
                }

                if (cList[cList.Count - 1] == c)
                {
                    cCount[cList.Count - 1] += 1;
                }
                else
                {
                    cList.Add(c);
                    cCount.Add(1);
                }
            }
            int count = 0;
            foreach (var w in words)
            {
                bool stretchy = true;

                for (int i = 0; i < cCount.Count; i++)
                {
                    int num = 0;
                    switch (cCount[i])
                    {
                        case 1:
                            foreach (var c in w)
                            {
                                if (c == cList[i])
                                {
                                    if (num > 0)
                                    {
                                        stretchy = false;
                                        break;
                                    }
                                    num++;
                                }
                            }
                            break;

                        case 2:
                            foreach (var c in w)
                            {
                                if (c == cList[i])
                                {
                                    if (num > 1)
                                    {
                                        stretchy = false;
                                        break;
                                    }
                                    num++;
                                }
                            }
                            break;

                        case 3:
                            foreach (var c in w)
                            {
                                if (c == cList[i])
                                {
                                    if (num > 0)
                                    {
                                        stretchy = false;
                                        break;
                                    }
                                    num++;
                                }
                            }
                            break;

                        default:
                            break;
                    }
                    if (!stretchy) break;
                }
                if (stretchy)
                    count++;
            }
            return count;
        }

        public int Function3(string s, string[] words)
        {
            int ans = 0;
            foreach (string word in words)
            {
                if (Expand(s, word))
                {
                    ++ans;
                }
            }

            return ans;
        }

        private bool Expand(string s, string t)
        {
            int i = 0, j = 0;
            while (i < s.Length && j < t.Length)
            {
                if (s[i] != t[j])
                {
                    return false;
                }
                char ch = s[i];
                int cnti = 0;
                while (i < s.Length && s[i] == ch)
                {
                    ++cnti;
                    ++i;
                }
                int cntj = 0;
                while (j < t.Length && t[j] == ch)
                {
                    ++cntj;
                    ++j;
                }
                if (cnti < cntj)
                {
                    return false;
                }
                if (cnti != cntj && cnti < 3)
                {
                    return false;
                }
            }
            return i == s.Length && j == t.Length;
        }
    }
}