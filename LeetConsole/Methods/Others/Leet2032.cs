using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2032
    /// </summary>
    public class Leet2032
    {
        public List<int> Action()
        {
            int[] nums1 = { 1, 1, 3, 2 }, nums2 = { 2, 3 }, nums3 = { 3 };
            return Function1(nums1, nums2, nums3);
        }

        public List<int> Function1(int[] nums1, int[] nums2, int[] nums3)
        {
            IDictionary<int, int> dictionary = new Dictionary<int, int>();
            foreach (int i in nums1)
            {
                dictionary.TryAdd(i, 1);
            }
            foreach (int i in nums2)
            {
                dictionary.TryAdd(i, 0);
                dictionary[i] |= 2;
            }
            foreach (int i in nums3)
            {
                dictionary.TryAdd(i, 0);
                dictionary[i] |= 4;
            }
            List<int> res = new List<int>();
            foreach (KeyValuePair<int, int> pair in dictionary)
            {
                int k = pair.Key, v = pair.Value;
                if ((v & (v - 1)) != 0)
                {
                    res.Add(k);
                }
            }
            return res;
        }
    }
}