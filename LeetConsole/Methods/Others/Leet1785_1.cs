using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1785
    /// </summary>
    public class Leet1785_1
    {
        public bool Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";

            //string s = "zbax";
            var nums = new int[][] { new int[] { 0, 1 }, new int[] { 0, 2 }, new int[] { 3, 5 }, new int[] { 5, 4 }, new int[] { 4, 3 } };
            //var nums = new int[][] { new int[] { 0, 1 }, new int[] { 1, 2 }, new int[] { 2,0 }};
            return Function1(nums.Length, nums, 0, 5);
        }

        public bool Function1(int n, int[][] nums, int source, int destination)
        {
            return Func(nums, new List<int>(), new List<int>() { source }, destination);
        }

        public bool Func(int[][] nums, List<int> inedxs, List<int> sources, int destination)
        {
            if (sources.Count == 0) return false;
            var lineS = new List<int>();
            foreach (var s in sources)
            {
                for (int i = 0; i < nums.Length; i++)
                {
                    if (inedxs.Contains(i)) continue;
                    if (nums[i][0] == s)
                    {
                        lineS.Add(nums[i][1]);
                        inedxs.Add(i);
                    }
                    else if (nums[i][1] == s)
                    {
                        lineS.Add(nums[i][0]);
                        inedxs.Add(i);
                    }
                }
            }
            if (lineS.Contains(destination)) return true;
            return Func(nums, inedxs, lineS, destination);
        }

        public bool Function2(int n, int[][] nums, int source, int destination)
        {
            var ways = new List<List<int>>();
            HashSet<int> useLine = new HashSet<int>();
            List<int> head = new List<int>();
            List<int> tail = new List<int>();
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i][0] == source)
                {
                    head.Add(nums[i][0]);
                    tail.Add(nums[i][1]);
                    useLine.Add(i);
                    break;
                }
            }
            int w = 0;
            while (w < n)
            {
                for (int i = 0; i < nums.Length; i++)
                {
                    if (!useLine.Add(i)) continue;
                    if (head[head.Count - 1] == nums[i][0])
                    {
                        head.Add(nums[i][1]);
                    }
                    else if (head[head.Count - 1] == nums[i][1])
                    {
                        head.Add(nums[i][0]);
                    }
                }
                w++;
            }
            head.Reverse();
            w = 0;
            while (w < n)
            {
                for (int i = 0; i < nums.Length; i++)
                {
                    if (!useLine.Add(i)) continue;
                    if (tail[tail.Count - 1] == nums[i][0])
                    {
                        tail.Add(nums[i][1]);
                    }
                    else if (tail[tail.Count - 1] == nums[i][1])
                    {
                        tail.Add(nums[i][0]);
                    }
                }
                w++;
            }
            return false;
        }
    }
}