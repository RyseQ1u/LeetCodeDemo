namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet303
    {
        public long Action()
        {
            var nums = new int[] { -2, 0, 3, -5, 2, -1 };
            int left = 2, right = 5;
            NumArray obj = new NumArray(nums);
            int param_1 = obj.SumRange(left, right);
            return param_1;
        }
    }

    public class NumArray
    {
        private int[] numArr = null;

        public NumArray(int[] nums)
        {
            numArr = nums;
        }

        public int SumRange(int left, int right)
        {
            if (right > numArr.Length)
            {
                right = numArr.Length - 1;
            }
            if (left < 0)
            {
                left = 0;
            }
            int s = 0;
            for (int i = left; i < right + 1; i++)
            {
                s += numArr[i];
            }

            return s;
        }
    }
}