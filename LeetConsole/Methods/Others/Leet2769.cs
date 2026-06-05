namespace ConsoleApp3.Methods
{
    /// <summary>
    /// Leet2769
    /// </summary>
    public class Leet2769
    {
        public long Action()
        {
            int n = 0;
            int t = 0;

            return TheMaximumAchievableX(n, t);
        }

        /// <summary>
        /// 数学题
        /// </summary>
        public int TheMaximumAchievableX(int num, int t)
        {
            return num + 2 * t;
        }
    }
}