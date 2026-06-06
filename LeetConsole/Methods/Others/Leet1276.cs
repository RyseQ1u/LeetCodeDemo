using System.Collections.Generic;

namespace Leet.Methods
{
    /// <summary>
    /// 1276
    /// </summary>
    public class Leet1276
    {
        public List<int> Action()
        {
            //return NumOfBurgers(17,4);
            return NumOfBurgers(3962, 1205); //[776,429]
        }

        /// <summary>
        /// 硬解
        /// </summary>
        /// <param name="tomatoSlices"></param>
        /// <param name="cheeseSlices"></param>
        /// <returns></returns>
        public List<int> NumOfBurgers(int tomatoSlices, int cheeseSlices)
        {
            var result = new List<int>();
            double r = (double)tomatoSlices / (double)cheeseSlices;
            int big = 0;
            int small = cheeseSlices;
            while (r > 2)
            {
                big++;
                tomatoSlices -= 4;
                cheeseSlices--;
                r = (double)tomatoSlices / (double)cheeseSlices;
            }
            if (r < 2)
            {
                return result;
            }
            result.Add(big);
            result.Add(small - big);
            return result;
        }

        /// <summary>
        /// 解方程
        /// </summary>
        /// <param name="tomatoSlices"></param>
        /// <param name="cheeseSlices"></param>
        /// <returns></returns>
        public List<int> NumOfBurgers2(int tomatoSlices, int cheeseSlices)
        {
            var result = new List<int>();
            if (tomatoSlices % 2 != 0 || tomatoSlices < tomatoSlices * 2 || cheeseSlices * 4 < tomatoSlices)
            {
                return result;
            }
            result.Add(tomatoSlices / 2 - cheeseSlices);
            result.Add(cheeseSlices * 2 - tomatoSlices / 2);
            return result;
        }
    }
}