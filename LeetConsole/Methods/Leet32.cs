using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2180
    /// </summary>
    public class Leet32
    {
        public int Action()
        {
            int n = 6;
            return Function1(n);
        }

        public int Function1(int n)
        {
            int count = 0;

            var perm = new int[n];
            for (int i = 0; i < perm.Length; i++)
            {
                perm[i] = i;
            }
            bool flag = true;
            while (flag)
            {
                var arr = new int[n];
                for (int i = 0; i < arr.Length; i++)
                {
                    if (i % 2 == 0)
                    {
                        arr[i] = perm[i / 2];
                    }
                    else if (i % 2 == 1)
                    {
                        arr[i] = perm[n / 2 + (i - 1) / 2];
                    }
                }
                count++;
                perm = arr;
                for (int i = 0; i < arr.Length; i++)
                {
                    if (i > 0)
                    {
                        if (arr[i - 1] > arr[i])
                        {
                            flag = true;
                            break;
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            return count;
        }

        public int Function2(int n)
        {
            int[] perm = new int[n];
            int[] target = new int[n];
            for (int i = 0; i < n; i++)
            {
                perm[i] = i;
                target[i] = i;
            }
            int step = 0;
            while (true)
            {
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                {
                    if ((i & 1) != 0)
                    {
                        arr[i] = perm[n / 2 + (i - 1) / 2];
                    }
                    else
                    {
                        arr[i] = perm[i / 2];
                    }
                }
                perm = arr;
                step++;
                if (Enumerable.SequenceEqual(perm, target))
                {
                    break;
                }
            }
            return step;
        }
    }
}