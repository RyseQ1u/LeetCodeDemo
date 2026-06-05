using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.Methods.Easy
{
    public class Leet3174
    {
        public string ClearDigits(string s)
        {
            Stack<char> stack = new Stack<char>();

            for (int i = 0; i < s.Length; i++)
            {
                if (char.IsDigit(s[i]))
                {
                    stack.Pop();
                }
                else
                {
                    stack.Push(s[i]);
                }
            }
            // 使用 StringBuilder 构建字符串
            StringBuilder sb = new StringBuilder();
            foreach (var item in stack.Reverse())
            {
                sb.Append(item);
            }

            return sb.ToString();
        }

        public string ClearDigits2(string s)
        {
            StringBuilder res = new StringBuilder();
            foreach (char c in s.ToCharArray())
            {
                if (Char.IsDigit(c))
                {
                    res.Remove(res.Length - 1, 1);
                }
                else
                {
                    res.Append(c);
                }
            }
            return res.ToString();
        }
    }
}