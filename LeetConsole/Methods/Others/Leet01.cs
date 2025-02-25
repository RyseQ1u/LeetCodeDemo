namespace ConsoleApp3.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet01
    {
        /// <summary>
        ///
        /// </summary>
        /// <returns></returns>
        public int Function1(int[,] array)
        {
            //int[,] array = new int[5, 5] { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 1 } };
            int mun = 0;
            for (int i = 0; i < array.GetLength(0); i++)
            {
                if (i == 0 || i == array.GetLength(0) - 1) continue;
                for (int j = 0; j < array.GetLength(1); j++)
                {
                    if (j == 0 || j == array.GetLength(0) - 1 || array[i, j] != 1) continue;
                    if (array[i - 1, j] != 0 || array[i + 1, j] != 0 || array[i, j - 1] != 0 || array[i, j + 1] != 0) continue;
                    mun++;
                }
            }
            return mun;
        }
    }
}