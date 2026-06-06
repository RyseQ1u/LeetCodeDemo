namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2283
    /// </summary>
    public class Leet2283
    {
        public bool Action()
        {
            var n = "1210";
            return Function1(n);
        }

        public bool Function1(string num)
        {
            int count = 0;
            var arr = new int[num.Length];
            var arr2 = new int[10];
            for (int i = 0; i < num.Length; i++)
            {
                int.TryParse(num[i] + "", out int n);
                arr[i] = n;
                arr2[n] += 1;
            }
            for (int i = 0; i < num.Length; i++)
            {
                if (arr2[i] == arr[i])
                {
                }
                else
                {
                    return false;
                }
            }

            return true;
        }
    }
}