using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method2696
    /// </summary>
    public class Leet2696
    {
        public int Action()
        {
            var value = "ABFCACDB";
            return MinLength2(value);
        }

        public int MinLength(string s)
        {
            var r = 0;
            string ns = string.Empty;
            while (s.Contains("AB") || s.Contains("CD"))
            {
                s = s.Replace("AB", string.Empty);
                s = s.Replace("CD", string.Empty);
            }
            return s.Length;
        }

        public int MinLength2(string s)
        {
            var r = 0;
            Stack<char> stack = new Stack<char>();
            foreach (char c in s)
            {
                if (stack.Count >= 1)
                {
                    if (stack.Peek() == 'A')
                    {
                        if (c == 'B')
                        {
                            stack.Pop();
                            continue;
                        }
                    }
                    else if (stack.Peek() == 'C')
                    {
                        if (c == 'D')
                        {
                            stack.Pop();
                            continue;
                        }
                    }
                }
                stack.Push(c);
            }
            return stack.Count;
        }
    }
}