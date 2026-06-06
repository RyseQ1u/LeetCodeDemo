using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 40
    /// </summary>
    public class Leet40
    {
        public IList<IList<int>> CombinationSum2(int[] candidates, int target)
        {
            //结果子集
            var res = new List<IList<int>>();
            //临时子集
            var temp = new List<int>();
            //排序
            Array.Sort(candidates);
            //起点
            int left = 0;
            FindSubset(candidates, target, res, temp, left);

            return res;
        }

        private void FindSubset(IList<int> candidates, int target, List<IList<int>> res, List<int> temp, int left)
        {
            //如果当前目标等于0 代表已经找到满足条件的子集
            //将临时子集加入到结果集中
            if (target == 0)
            {
                //复制一份加入结果
                res.Add(new List<int>(temp));
                return;
            }
            //遍历数组 从left开始
            for (int i = left; i < candidates.Count; i++)
            {
                //剪枝一：当前临时子集 temp 和 已经大于目标 target
                //由于数组已排序，所以直接跳出循环
                if (target < candidates[i])
                {
                    break;
                }
                //剪枝二：如果当前元素和左边相等，说明该分支重复，跳过搜索
                if (i > left && candidates[i] == candidates[i - 1])
                {
                    continue;
                }
                //选择当前元素
                temp.Add(candidates[i]);
                //进行下一轮选择 更新 target left
                FindSubset(candidates, target - candidates[i], res, temp, i + 1);
                //还原选择
                temp.RemoveAt(temp.Count - 1);
            }
        }
    }
}