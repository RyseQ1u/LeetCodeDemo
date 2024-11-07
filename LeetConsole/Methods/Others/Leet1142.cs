namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1142
    /// </summary>
    public class Leet1142
    {
        public int Action()
        {
            var hours = new int[] { 9, 9, 6, 0, 6, 6, 9 };

            return Function1(hours);
        }

        public int Function1(int[] hours)
        {
            int s = 0, e = 0;
            var flag = false;
            int[] newArr = new int[hours.Length];
            for (int i = 0; i < hours.Length - 1; i++)
            {
                if (hours[i] > 8)
                {
                    s++;
                }
                else
                {
                    if (s - 1 == e)
                    {
                    }
                    e++;
                }
            }

            return 0;
        }
    }
}