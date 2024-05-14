using System;
using System.Collections;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    public class Leet856
    {
        public int Action()
        {
            //var tasks = new int[] { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };
            //var tasks = new int[] { 66, 66, 63, 61, 63, 63, 64, 66, 66, 65, 66, 65, 61, 67, 68, 66, 62, 67, 61, 64, 66, 60, 69, 66, 65, 68, 63, 60, 67, 62, 68, 60, 66, 64, 60, 60, 60, 62, 66, 64, 63, 65, 60, 69, 63, 68, 68, 69, 68, 61 };
            var r = Function1("");
            return r;
        }

        /// <summary>
        /// 856
        /// </summary>
        /// <returns></returns>
        public int Function1(string str)
        {
            int mun = 0;
            List<int> lefts = new List<int>();
            List<int> rights = new List<int>();
            List<int> parentheses = new List<int>();
            Hashtable surplus = new Hashtable();
            int surIndex = 0;
            var chars = str.ToCharArray();
            for (int i = 0; i < chars.Length; i++)
            {
                if (chars[i] == '（')
                    lefts.Add(i);
                else
                    rights.Add(i);
            }
            for (int i = 0; i < lefts.Count; i++)
            {
                for (int j = 0; j < rights.Count; j++)
                {
                    if (rights[j] - lefts[i] == 1)
                    {
                        parentheses.Add(i);
                        parentheses.Add(j);
                    }
                    else
                    {
                        surplus.Add(surIndex++, i);
                    }
                }
            }

            return mun;
        }

        public int Function2(string str)
        {
            int mun = 0;
            List<int> lefts = new List<int>();
            List<int> rights = new List<int>();
            List<int> parentheses = new List<int>();
            Hashtable surplus = new Hashtable();
            int lIndex = 0;
            int rIndex = 0;
            var chars = str.ToCharArray();
            bool flag = true;
            for (int i = 0; i < chars.Length; i++)
            {
                if (chars[i] == '(')
                    lefts.Add(i);
                else
                    rights.Add(i);
            }
            while (flag)
            {
                lIndex = 0;
                rIndex = 0;
                for (int i = 0; i < lefts.Count; i++)
                {
                    if (parentheses.Contains(lefts[i])) continue;
                    for (int j = 0; j < rights.Count; j++)
                    {
                        if (parentheses.Contains(lefts[i]) || parentheses.Contains(rights[j])) continue;
                        if (rIndex - lIndex == 1)
                        {
                            parentheses.Add(lefts[i]);
                            parentheses.Add(rights[j]);
                        }
                        rIndex++;
                    }
                    lIndex++;
                }
                if (parentheses.Count == chars.Length)
                    flag = false;
            }

            return mun;
        }

        public int Function3(string str)
        {
            if (str.Length == 2)
            {
                return 1;
            }
            int bal = 0, n = str.Length, len = 0;
            for (int i = 0; i < n; i++)
            {
                bal += (str[i] == '(' ? 1 : -1);
                if (bal == 0)
                {
                    len = i + 1;
                    break;
                }
            }
            if (len == n)
            {
                return 2 * Function3(str.Substring(1, n - 2));
            }
            else
            {
                return Function3(str.Substring(0, len)) + Function3(str.Substring(len));
            }
        }

        public int Function4(string str)
        {
            Stack<int> st = new Stack<int>();
            st.Push(0);
            foreach (var c in str)
            {
                if (c == '(')
                {
                    st.Push(0);
                }
                else
                {
                    int v = st.Pop();
                    int top = st.Pop() + Math.Max(2 * v, 1);
                    st.Push(top);
                }
            }
            return st.Pop();
        }

        public int Function5(string str)
        {
            int result = 0, d = 0;
            for (int i = 0; i < str.Length; i++)
            {
                if (str[i] == '(')
                {
                    ++d;
                }
                else
                {
                    --d;
                    if (str[i - 1] == '(')
                    {
                        result += 1 << d;
                    }
                }
            }
            return result;
        }
    }
}