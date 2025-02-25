namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1289
    /// </summary>
    public class Leet1289
    {
        public int Action()
        {
            //var source = 234;
            //var source = new int[][] { new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }, new int[] { 7, 8, 9 } };
            //var source = new int[][] { new int[] { 9 } };
            //var source = new int[][]
            //{
            //    new int[] { 2, 2, 1, 2, 2 },
            //    new int[] { 2, 2, 1, 2, 2 },
            //    new int[] { 2, 2, 1, 2, 2 },
            //    new int[] { 2, 2, 1, 2, 2 },
            //    new int[] { 2, 2, 1, 2, 2 }
            //};
            var source = new int[][]
            {
                            new int[] { -37,51,-36,34,-22 },
                            new int[] { 82,4,30,14,38 },
                            new int[] { -68,-52,-92,65,-85 },
                            new int[] { -49,-3,-77,8,-19 },
                            new int[] { -60, -71, -21, -62, -73 }
            };//-268

            return MinFallingPathSum(source);
        }

        public int MinFallingPathSum(int[][] g)
        {
            int t = 0;
            int r = 0;
            int ui = -1;
            while (t < g.Length - 1)
            {
                //寻找当前层最小的值
                int c = int.MaxValue;
                int mi = -1;
                for (int i = 0; i < g[t].Length; i++)
                {
                    if (c > g[t][i])
                    {
                        if (ui == i) continue;
                        c = g[t][i];
                        mi = i;
                    }
                }
                r += c;
                ui = mi;
                t++;
            }
            return r;
        }
    }
}