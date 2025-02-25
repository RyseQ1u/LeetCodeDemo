namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 997
    /// </summary>
    public class Leet997
    {
        public int FindJudge(int n, int[][] trust)
        {
            //镇民投出的票
            int[] civilians = new int[n + 1];
            //警长收到的票
            int[] polices = new int[n + 1];
            foreach (var t in trust)
            {
                ++civilians[t[0]];
                ++polices[t[1]];
            }
            for (int i = 1; i <= n; ++i)
            {
                //其他人的票 n-1 投出的票 0
                if (polices[i] == n - 1 && civilians[i] == 0)
                {
                    return i;
                }
            }
            return -1;
        }
    }
}