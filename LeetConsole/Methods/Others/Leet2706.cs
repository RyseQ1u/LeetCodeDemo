namespace ConsoleApp3.Methods
{
    /// <summary>
    ///2706
    /// </summary>
    public class Leet2706
    {
        public int Action()
        {
            //int[] p1 = new int[] { 4, 10, 7, 9 };
            //int[] p2 = new int[] { 6, 5, 2, 3 };
            int[] p1 = new int[] { 1, 2, 2 };

            //char[][] s = new char[][] { new char[] { '#', '.', '.', '.', '#' }, new char[] { '.', '#', '.', '#', '.' }, new char[] { '.', '.', '#', '.', '.' }, new char[] { '.', '#', '.', '#', '.' }, new char[] { '#', '.', '.', '.', '#' } };
            return BuyChoco(p1, 3);
        }

        public int BuyChoco(int[] prices, int money)
        {
            int min1 = 9999;
            int mi = 0;
            int min2 = 9999;
            for (int i = 0; i < prices.Length; i++)
            {
                if (prices[i] < min1)
                {
                    min1 = prices[i];
                    mi = i;
                }
            }
            for (int i = 0; i < prices.Length; i++)
            {
                if (i == mi) continue;
                if (prices[i] < min2)
                {
                    min2 = prices[i];
                }
            }
            return (money - (min1 + min2)) >= 0 ? (money - (min1 + min2)) : money;
        }
    }
}