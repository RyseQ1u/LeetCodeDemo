using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 676
    /// </summary>
    public class Leet676
    {
        public int Action()
        {
            //var input = new string[] { "aba", "cdc", "eae" };
            MagicDictionary magicDictionary = new MagicDictionary();
            magicDictionary.BuildDict(new string[] { "hello", "leetcode" });
            magicDictionary.Search("hello"); // 返回 False
            magicDictionary.Search("hhllo"); // 将第二个 'h' 替换为 'e' 可以匹配 "hello" ，所以返回 True
            magicDictionary.Search("hell"); // 返回 False
            magicDictionary.Search("leetcoded"); // 返回 False
            return 0;
        }
    }

    public class MagicDictionary
    {
        public MagicDictionary()
        {
        }

        private Dictionary<int, List<string>> lengthValue = new Dictionary<int, List<string>>();

        public void BuildDict(string[] dictionary)
        {
            //根据长度分组
            foreach (string key in dictionary)
            {
                if (!lengthValue.ContainsKey(key.Length))
                {
                    lengthValue[key.Length] = new List<string>() { key };
                }
                else
                {
                    lengthValue[key.Length].Add(key);
                }
            }
        }

        public bool Search(string searchWord)
        {
            foreach (var key in lengthValue.Keys)
            {
                //找到符合长度的分组
                if (searchWord.Length == key)
                {
                    //遍历分组全部字符串
                    var strs = lengthValue[key];
                    foreach (var s in strs)
                    {
                        var f = false;

                        for (int i = 0; i < key; i++)
                        {
                            //比较不同
                            if (searchWord[i] != s[i])
                            {
                                if (f) { f = false; break; }
                                f = true; continue;
                            }
                        }
                        if (f) { return true; }
                    }
                }
            }

            return false;
        }
    }
}