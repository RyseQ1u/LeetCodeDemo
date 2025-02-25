using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1753
    /// </summary>
    public class Leet1753
    {
        public int Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";

            //string s = "zbax";
            //return Function1(4, 4, 6);
            return Function1(1, 8, 8);
        }

        public int Function1(int a, int b, int c)
        {
            int count = 0;
            int[] arr = new int[] { a, b, c };
            Array.Sort(arr);
            int d = arr[0] + arr[1];
            if (d == arr[2])
            {
                count = d;
            }
            else if (d < arr[2])
            {
                count = d;
            }
            else if (d > arr[2])
            {
                count = arr[2] + (d - arr[2]) / 2;
            }
            return count;
        }
    }
}