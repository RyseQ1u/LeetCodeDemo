using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method670
    /// </summary>
    public class Leet670
    {
        public int Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            var n = 2736;
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
            //var head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
            return MaximumSwap2(n);
        }

        public int MaximumSwap(int num)
        {
            var ls = new List<int>();
            var str = string.Empty;
            while (num > 10)
            {
                ls.Add(num % 10);
                num = num / 10;
            }
            ls.Add(num);
            ls.Sort();
            for (int i = ls.Count - 1; i >= 0; i--)
            {
                str += ls[i];
            }
            return int.Parse(str);
        }

        public int MaximumSwap2(int num)
        {
            char[] charArray = num.ToString().ToCharArray();
            int n = charArray.Length;
            int maxIdx = n - 1;
            int idx1 = -1, idx2 = -1;
            for (int i = n - 1; i >= 0; i--)
            {
                if (charArray[i] > charArray[maxIdx])
                {
                    maxIdx = i;
                }
                else if (charArray[i] < charArray[maxIdx])
                {
                    idx1 = i;
                    idx2 = maxIdx;
                }
            }
            if (idx1 >= 0)
            {
                Swap(charArray, idx1, idx2);
                return int.Parse(new string(charArray));
            }
            else
            {
                return num;
            }
        }

        public void Swap(char[] charArray, int i, int j)
        {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
    }
}