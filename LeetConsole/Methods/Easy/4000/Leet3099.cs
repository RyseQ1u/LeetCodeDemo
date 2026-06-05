namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3099
    /// </summary>
    public class Leet3099
    {
        public int Action()
        {
            int num = 10;
            return SumOfTheDigitsOfHarshadNumber(num);
        }

        public int SumOfTheDigitsOfHarshadNumber(int x)
        {
            var r = 0;
            var sum = 0;
            int i = x;
            var mod = i % 10;
            while (i != 0 || mod > 0)
            {
                sum += mod;
                i = i / 10;
                mod = i % 10;
            }
            if (sum != 0 && x % sum == 0)
            {
                r = sum;
            }
            else
            {
                r = -1;
            }
            return r;
        }
    }
}