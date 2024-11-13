namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3184
    /// </summary>
    public class Leet3184
    {
        public int CountCompleteDayPairs(int[] hours)
        {
            var r = 0;
            // 模24
            var arr = new int[24];
            foreach (var hour in hours)
            {
                arr[hour % 24]++;
            }
            //计算模是0和12的
            r = arr[0] * (arr[0] - 1) / 2 + arr[12] * (arr[12] - 1) / 2;
            //统计其他
            for (int i = 1; i < 12; i++)
            {
                r += arr[i] * arr[24 - i];
            }
            return r;
        }
    }
}