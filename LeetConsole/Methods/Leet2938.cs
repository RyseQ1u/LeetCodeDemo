using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2938
    /// </summary>
    public class Leet2938
    {
        public long Action()
        {
            //var input = "0111";
            var input = "1100100";

            return MinimumSteps(input);
        }

        public long MinimumSteps(string s)
        {
            long result = 0;
            //最右边
            var right = s.Length - 1;
            for (int i = s.Length - 1; i >= 0; i--)
            {
                if (s[i] == '1')
                {
                    result += right - i;
                    right--;
                }
            }

            return result;
        }
    }
}