namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2414
    /// </summary>
    public class Leet2414
    {
        public int LongestContinuousSubstring(string s)
        {
            var r = 1;
            var n = 1;
            for (int i = 1; i < s.Length; i++)
            {
                if (s[i] - s[i - 1] == 1)
                {
                    n++;
                    //r = Math.Max(n, r);
                    if (n > r) r = n;
                }
                else
                {
                    n = 1;
                }
            }

            return r;
        }
    }
}