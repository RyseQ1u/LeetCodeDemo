namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 2264
    /// </summary>
    public class Leet2264
    {
        public string LargestGoodInteger(string num)
        {
            var bigC = ' ';
            var lastC = num[0];
            var n = 1;
            for (int i = 1; i < num.Length; i++)
            {
                if (lastC == num[i])
                {
                    n++;
                }
                else
                {
                    lastC = num[i];
                    n = 1;
                }
                if (n == 3)
                {
                    if (bigC < lastC)
                    {
                        bigC = lastC;
                    }
                }
            }
            if (bigC == ' ')
            {
                return "";
            }
            else
            {
                return "" + bigC + bigC + bigC;
            }
        }
    }
}