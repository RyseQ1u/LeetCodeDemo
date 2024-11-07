namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 901
    /// </summary>
    public class Leet901
    {
        public int[] Action()
        {
            int[] spanner = new int[] { 100, 80, 60, 70, 80, 75, 85 };
            int k = 434991989;
            return Function1(spanner);
        }

        public int[] Function1(int[] spanner)
        {
            int[] result = null;

            return result;
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="sandwiches"></param>
        /// <param name="student"></param>
        /// <returns></returns>
        public int Function2(int n, int k)
        {
            if (n == 1)
            {
                return 0;
            }
            return (k & 1) ^ 1 ^ Function2(n - 1, (k + 1) / 2);
        }
    }
}