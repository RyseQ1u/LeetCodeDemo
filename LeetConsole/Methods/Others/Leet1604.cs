using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1604
    /// </summary>
    public class Leet1604
    {
        public List<string> Action()
        {
            //int n = 3;
            //var r = new int[2][] { new int[]{ 0, 1 }, new int[]{ 1, 2 } };
            //var b = new int[0][];
            //var keyName = new string[] {"d", "d", "d","l", "l", "l" };
            //var keyTime = new string[] {"10:00", "10:40", "11:00","9:00", "13:00", "15:00" };

            var keyName = new string[] { "a", "a", "a", "b", "b", "b", "b" };
            var keyTime = new string[] { "12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00" };

            return Function1(keyName, keyTime);
        }

        public List<string> Function1(string[] kn, string[] kt)
        {
            var breakName = new HashSet<string>();
            var result = new List<string>();
            for (int i = 0; i < kn.Length - 1; i++)
            {
                if (breakName.Contains(kn[i])) continue;
                var ts1 = kt[i].Split(':');
                var ts2 = kt[i + 1].Split(':');
                if (int.Parse(ts1[0]) - int.Parse(ts2[0]) > 2)
                {
                    breakName.Add(kn[i]);
                    continue;
                }
                else if (int.Parse(ts2[1]) < int.Parse(ts1[1]))
                {
                    result.Add(kn[i]);
                }
            }
            return result;
        }
    }
}