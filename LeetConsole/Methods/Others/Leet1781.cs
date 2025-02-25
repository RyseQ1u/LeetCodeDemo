using System;
using System.Collections;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1781
    /// </summary>
    public class Leet1781
    {
        public int Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";

            //string s = "aabcbaaaaaaaaaaaaaabdsbdsbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbsdddddddddddddddddddddddddddddddddddddddddddddbbbbbbbbbbbbbbbweeeeeeeeeeeeeeeeeeeeennnnnnnnnnnnnnnxczhpolipugytjnheqwoudinzxlvkmnoeqwthohwphaosanhxzvzxbfhayhtgpasbfaaaaaaaaaaaa";
            string s = "2s314";
            s.Substring(3, 1);
            return Function1(s);
        }

        public int Function1(string s)
        {
            Hashtable hashtable = new Hashtable();
            int count = 0;
            for (int i = 0; i < s.Length; i++)
            {
                hashtable.Clear();
                var arr = new int[s.Length];
                hashtable[s[i]] = i;
                for (int j = i; j < s.Length; j++)
                {
                    if (s[i] == s[j])
                    {
                        arr[i]++;
                    }
                    else
                    {
                        if (!hashtable.ContainsKey(s[j]))
                        {
                            hashtable[s[j]] = j;
                            arr[(int)hashtable[s[j]]]++;
                        }
                        else
                        {
                            arr[(int)hashtable[s[j]]]++;
                        }
                    }
                    if (hashtable.Count > 1)
                    {
                        int max = 0, min = 0;
                        foreach (var key in hashtable.Keys)
                        {
                            int num = arr[(int)hashtable[key]];
                            if (max == 0)
                            {
                                max = num;
                                min = num;
                            }
                            max = Math.Max(max, num);
                            min = Math.Min(min, num);
                        }
                        count += max - min;
                    }
                }
            }

            return count;
        }

        public int Function2(string s)
        {
            int res = 0;
            for (int i = 0; i < s.Length; i++)
            {
                int[] cnt = new int[26];
                int maxFreq = 0;
                for (int j = i; j < s.Length; j++)
                {
                    cnt[s[j] - 'a']++;
                    maxFreq = Math.Max(maxFreq, cnt[s[j] - 'a']);
                    int minFreq = s.Length;
                    for (int k = 0; k < 26; k++)
                    {
                        if (cnt[k] > 0)
                        {
                            minFreq = Math.Min(minFreq, cnt[k]);
                        }
                    }
                    res += maxFreq - minFreq;
                }
            }
            return res;
        }
    }
}