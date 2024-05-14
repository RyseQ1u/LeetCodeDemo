namespace ConsoleApp3.Methods
{
    /// <summary>
    ///1349参加考试的最大学生数
    /// </summary>
    public class Leet2660
    {
        public int Action()
        {
            //int[] p1 = new int[] { 4, 10, 7, 9 };
            //int[] p2 = new int[] { 6, 5, 2, 3 };
            int[] p1 = new int[] { 5, 6, 1, 10 };
            int[] p2 = new int[] { 5, 1, 10, 5 };
            //char[][] s = new char[][] { new char[] { '#', '.', '.', '.', '#' }, new char[] { '.', '#', '.', '#', '.' }, new char[] { '.', '.', '#', '.', '.' }, new char[] { '.', '#', '.', '#', '.' }, new char[] { '#', '.', '.', '.', '#' } };
            return IsWinner(p1, p2);
        }

        public int IsWinner(int[] player1, int[] player2)
        {
            int r = 0;
            bool f1 = false;
            bool f2 = false;
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < player1.Length; i++)
            {
                if (f1) c1 += player1[i] * 2;
                else c1 += player1[i];
                if (f2) c2 += player2[i] * 2;
                else c2 += player2[i];
                if (i < 2 && player1[i] == 10) f1 = true;
                if (i < 2 && player2[i] == 10) f2 = true;
            }
            if (c1 > c2)
            {
                r = 1;
            }
            else if (c1 < c2)
            {
                r = 2;
            }
            return r;
        }
    }
}