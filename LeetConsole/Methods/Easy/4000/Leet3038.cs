namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3038
    /// </summary>
    public class Leet3038
    {
        public int Action()
        {
            //var input = "0111";
            var input = new int[] { 3, 2, 1, 4, 5 };

            return MaxOperations(input);
        }

        public int MaxOperations(int[] nums)
        {
            var count = 1;
            var sum = nums[0] + nums[1];
            for (int i = 2; i < nums.Length; i += 2)
            {
                if (i + 1 == nums.Length) break;
                if (nums[i] + nums[i + 1] == sum)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }

            return count;
        }
    }
}