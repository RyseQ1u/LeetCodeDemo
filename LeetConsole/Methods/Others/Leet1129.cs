namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1129
    /// </summary>
    public class Leet1129
    {
        public int[] Action()
        {
            int n = 3;
            //var r = new int[2][] { new int[]{ 0, 1 }, new int[]{ 1, 2 } };
            //var b = new int[0][];
            var r = new int[2][] { new int[] { 0, 1 }, new int[] { 0, 2 } };
            var b = new int[1][] { new int[] { 1, 0 } };
            return Function1(n, r, b);
        }

        public int[] Function1(int n, int[][] r, int[][] b)
        {
            var arr = new int[n];
            arr[0] = 0;
            for (int i = 1; i < arr.Length; i++)
            {
                arr[i] = -1;
            }
            var j = 0;
            var flag = true;
            while (j < arr.Length)
            {
                if (flag)
                {
                    foreach (var rI in r)
                    {
                        if (rI[0] == arr[j])
                        {
                            arr[j + 1] = rI[1];
                            flag = false;
                            break;
                        }
                    }
                    if (flag) break;
                }
                else
                {
                    foreach (var rI in b)
                    {
                        if (rI[0] == arr[j])
                        {
                            arr[j + 1] = rI[1];
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) break;
                }
                j++;
            }

            return arr;
        }
    }
}