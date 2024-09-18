using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.Methods
{
    public class Leet2390
    {
        public string RemoveStars(string s)
        {
            var stack = new Stack<char>();
            foreach (char c in s)
            {
                if (c == '*')
                {
                    stack.Pop();
                }
                else
                {
                    stack.Push(c);
                }
            }
            var r = stack.Reverse();
            return string.Join("", r);
        }

        /// <summary>
        /// 使用stringbuilder
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public string RemoveStars2(string s)
        {
            StringBuilder res = new StringBuilder();
            foreach (char c in s)
            {
                if (c != '*')
                {
                    res.Append(c);
                }
                else
                {
                    res.Length--;
                }
            }
            return res.ToString();
        }
    }
}