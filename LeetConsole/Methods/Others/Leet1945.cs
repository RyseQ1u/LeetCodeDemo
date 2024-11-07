using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1945
    /// </summary>
    public class Leet1945
    {
        public int Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";

            string s = "zbax";
            //string s = "aabcbaaaaaaaaaaaaaabdsbdsbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbsdddddddddddddddddddddddddddddddddddddddddddddbbbbbbbbbbbbbbbweeeeeeeeeeeeeeeeeeeeennnnnnnnnnnnnnnxczhpolipugytjnheqwoudinzxlvkmnoeqwthohwphaosanhxzvzxbfhayhtgpasbfaaaaaaaaaaaa";
            //var nums = new int[] { 2, 7, 4, 1, 8, 1 };
            return Function1(s, 2);
        }

        public int Function1(string s, int k)
        {
            string str = string.Empty;
            foreach (var c in s)
            {
                var n = c - 'a' + 1;
                str += n;
            }
            int count = 0;
            for (int i = 1; i <= k; i++)
            {
                count = Count(str);
                str = count.ToString();
            }
            return count;
        }

        public int Count(string s)
        {
            int count = 0;
            foreach (var c in s)
            {
                int.TryParse(c + "", out int i);
                count += i;
            }
            return count;
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