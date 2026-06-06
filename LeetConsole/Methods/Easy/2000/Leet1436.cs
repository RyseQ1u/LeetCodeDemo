using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 1436
    /// </summary>
    public class Leet1436
    {
        public string DestCity(List<List<string>> paths)
        {
            var head = new HashSet<string>();
            var tail = new HashSet<string>();
            foreach (var path in paths)
            {
                head.Add(path.First());
                tail.Add(path.Last());
            }
            return tail.Except(head).First();
        }
    }
}