using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 822
    /// </summary>
    public class Leet822
    {
        public int Action()
        {
            var fronts = new int[] { 1, 2, 4, 4, 7 };
            var backs = new int[] { 1, 3, 4, 1, 3 };

            return Function1(fronts, backs);
        }

        public int Function1(int[] fronts, int[] backs)
        {
            var same = new HashSet<int>();
            int res = 3000;
            foreach (var x in fronts)
            {
                if (x < res && !same.Contains(x))
                {
                    res = x;
                }
            }
            foreach (var x in backs)
            {
                if (x < res && !same.Contains(x))
                {
                    res = x;
                }
            }
            return res % 3000;
        }
    }
}