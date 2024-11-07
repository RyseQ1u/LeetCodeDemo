using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2319
    /// </summary>
    public class Leet2319
    {
        public string Action()
        {
            var k = "eljuxhpwnyrdgtqkviszcfmabo";
            var m = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
            //var target = "code";
            return Function1(k, m);
        }

        public string Function1(string k, string m)
        {
            string res = "";
            IDictionary<char, char> keys = new Dictionary<char, char>();
            int n = 0;
            foreach (var c in k)
            {
                if (c == ' ')
                {
                    continue;
                }
                if (!keys.ContainsKey(c))
                {
                    keys.Add(c, (char)(97 + n));
                    n++;
                }
            }
            foreach (var c in m)
            {
                if (c == ' ') { res += ' '; continue; }
                res += keys[c];
            }
            return res;
        }
    }
}