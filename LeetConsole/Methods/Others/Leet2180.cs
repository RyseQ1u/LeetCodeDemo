namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2180
    /// </summary>
    public class Leet2180
    {
        public int Action()
        {
            int n = 30;
            return Function1(n);
        }

        public int Function1(int n)
        {
            int count = 0;
            for (int i = 1; i <= n; i++)
            {
                int g = 0, s = 0, b = 0, q = 0;
                g = i % 10;
                s = i / 10;
                b = i / 100;
                q = i / 1000;
                if ((g + s + b + q) % 2 == 0)
                {
                    count++;
                }
            }

            return count;
        }

        public bool isEven(int n)
        {
            return n % 2 == 0;
        }
    }
}