namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2789
    {
        public long Action()
        {
            var nums = new int[] { 2, 3, 7, 9, 3 };
            var r = MaxArrayValue(nums);
            return r;
        }

        public long MaxArrayValue(int[] nums)
        {
            for (int i = nums.Length - 1; i >= 1; i--)
            {
                if (nums[i] >= nums[i - 1])
                {
                    nums[i - 1] = nums[i - 1] + nums[i];
                }
            }
            return nums[0];
        }
    }
}