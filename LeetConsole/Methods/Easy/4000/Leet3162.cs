namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3162
    /// </summary>
    public class Leet3162
    {
        public int NumberOfPairs(int[] nums1, int[] nums2, int k)
        {
            var r = 0;
            var l1 = nums1.Length;
            var l2 = nums2.Length;
            for (int i = 0; i < l2; i++)
            {
                nums2[i] = nums2[i] * k;
            }
            for (int i = 0; i < l1; i++)
            {
                for (int j = 0; j < l2; j++)
                {
                    //if (nums1[i] < nums2[j]) break;
                    if (nums1[i] % nums2[j] == 0)
                    {
                        r++;
                    }
                }
            }
            return r;
        }
    }
}