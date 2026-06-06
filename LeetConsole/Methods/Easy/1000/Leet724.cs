namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// Leet724
    /// </summary>
    public class Leet724
    {
        public int Action()
        {
            //var input1 = new int[] { 1, 7, 3, 6, 5, 6 };
            var input1 = new int[] { 2, 1, -1 };

            return PivotIndex(input1);
        }

        public int PivotIndex(int[] nums)
        {
            //计算前缀和
            var l = nums.Length;
            var sum = new int[l + 1];
            for (int i = 0; i < l; i++)
            {
                sum[i + 1] = sum[i] + nums[i];
            }
            for (int i = 0; i < nums.Length; i++)
            {
                if (sum[i] == sum[l] - sum[i] - nums[i])
                {
                    return i;
                }
            }
            return -1;
        }
    }
}