using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// 2306
    /// </summary>
    public class Leet2306
    {
        /// <summary>
        /// 按照字母分组
        /// 去掉首字母
        /// </summary>
        /// <param name="ideas"></param>
        /// <returns></returns>
        public long DistinctNames(string[] ideas)
        {
            var r = 0L;
            var dict = new Dictionary<string, List<string>>();
            foreach (var idea in ideas)
            {
                //切割字符串
                var prefix = idea.Substring(0, 1);
                var postfix = idea.Substring(1);
                if (dict.ContainsKey(prefix))
                {
                    dict[prefix].Add(postfix);
                }
                else
                {
                    dict.Add(prefix, new List<string>() { postfix });
                }
            }
            var keys = dict.Keys.ToList();
            for (int i = 0; i < keys.Count; i++)
            {
                for (int j = i; j < keys.Count; j++)
                {
                    var l1 = dict[keys[i]];
                    var l2 = dict[keys[j]];
                    var interCount = l1.Intersect(l2).Count();
                    r += (l1.Count - interCount) * (l2.Count - interCount);
                }
            }
            //最后再*2减少计算
            return r * 2;
        }
    }
}