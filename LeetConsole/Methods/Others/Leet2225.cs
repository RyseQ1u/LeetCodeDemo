using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2225
    /// </summary>
    public class Leet2225
    {
        public IList<IList<int>> Action()
        {
            var s = new int[][] { new int[] { 1, 3 }, new int[] { 2, 3 }, new int[] { 3, 6 }, new int[] { 5, 6 }, new int[] { 5, 7 }, new int[] { 4, 5 }, new int[] { 4, 8 }, new int[] { 4, 9 }, new int[] { 10, 4 }, new int[] { 10, 9 } };

            return FindWinners(s);
        }

        public IList<IList<int>> FindWinners(int[][] matches)
        {
            var one = new List<int>();
            var zero = new List<int>();
            Dictionary<int, int> map = new Dictionary<int, int>();

            for (int i = 0; i < matches.Length; i++)
            {
                map.TryAdd(matches[i][1], 0);
                map.TryAdd(matches[i][0], 0);
                map[matches[i][1]]++;
            }
            foreach (var k in map.Keys.OrderBy(key => key))
            {
                if (map[k] == 0)
                {
                    zero.Add(k);
                }
                else if (map[k] == 1)
                {
                    one.Add(k);
                }
            }
            return new List<IList<int>>() { zero, one };
        }
    }
}