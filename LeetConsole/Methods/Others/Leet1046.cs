using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1046
    /// </summary>
    public class Leet1046
    {
        public int Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";

            //string s = "aabcbaaaaaaaaaaaaaabdsbdsbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbsdddddddddddddddddddddddddddddddddddddddddddddbbbbbbbbbbbbbbbweeeeeeeeeeeeeeeeeeeeennnnnnnnnnnnnnnxczhpolipugytjnheqwoudinzxlvkmnoeqwthohwphaosanhxzvzxbfhayhtgpasbfaaaaaaaaaaaa";
            var nums = new int[] { 2, 7, 4, 1, 8, 1 };
            return Function2(nums);
        }

        public int Function1(int[] nums)
        {
            if (nums.Length == 1) return nums[0];
            if (nums.Length == 2) return Math.Abs(nums[0] - nums[1]);
            Array.Sort(nums);
            if (nums[nums.Length - 3] == 0) return nums[nums.Length - 1] - nums[nums.Length - 2];
            nums[nums.Length - 1] = nums[nums.Length - 2];
            nums[nums.Length - 2] = 0;
            return Function1(nums);
        }

        public int Function2(int[] nums)
        {
            if (nums.Length == 1) return nums[0];
            if (nums.Length == 2) return Math.Abs(nums[0] - nums[1]);
            for (int i = nums.Length - 1; i >= 1; i--)
            {
                Array.Sort(nums);
                nums[i - 1] = nums[i] - nums[i - 1];
            }
            return nums[0];
        }
    }
}