namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2923
    {
        public int Action()
        {
            var nums = new int[][] { new int[] { 0, 0, 1 }, new int[] { 1, 0, 1 }, new int[] { 0, 0, 0 } };

            var r = FindChampion(nums);
            return r;
        }

        public int FindChampion(int[][] grid)
        {
            var r = 0;
            for (int i = 0; i < grid.Length; i++)
            {
                var c = 0;
                foreach (var x in grid[i])
                {
                    if (x == 1)
                    {
                        c++;
                    }
                }
                if (c == grid[i].Length - 1)
                {
                    r = i;
                    break;
                }
            }
            return r;
        }
    }
}