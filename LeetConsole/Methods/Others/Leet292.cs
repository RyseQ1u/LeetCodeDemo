namespace Leet.Methods
{
    public class Leet292
    {
        public bool Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var value = new int[] { 5, 3, 4, 1, 1 };
            //var value = new int[] { 6, 5, 3, 9, 2, 7 };
            var value1 = 4;

            return CanWinNim2(value1);
        }

        public bool CanWinNim(int n)
        {
            var r = false;
            var quotient = n / 3;
            if (quotient % 2 > 0)
            {
                r = false;
            }
            else
            {
                r = true;
            }
            return r;
        }

        public bool CanWinNim2(int n)
        {
            return n % 4 != 0;
        }
    }
}