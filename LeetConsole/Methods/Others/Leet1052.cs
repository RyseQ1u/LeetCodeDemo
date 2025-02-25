using System;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet1052
    {
        public int Action()
        {
            int[] customers = new int[] { 1, 0, 1, 2, 1, 1, 7, 5 };
            int[] grumpy = new int[] { 0, 1, 0, 1, 0, 1, 0, 1 };
            int minutes = 3;
            var r = MaxSatisfied(customers, grumpy, minutes);

            return r;
        }

        public int MaxSatisfied(int[] customers, int[] grumpy, int minutes)
        {
            int count = 0;
            int max = 0;
            for (int i = 0; i < customers.Length; i++)
            {
                if (grumpy[i] == 0)
                {
                    count += customers[i];
                }
                else
                {
                    int curM = customers[i];
                    for (int j = 1; j < minutes; j++)
                    {
                        if (i + j > customers.Length - 1) break;
                        if (grumpy[i + j] == 1)
                        {
                            curM += customers[i + j];
                        }
                    }
                    max = Math.Max(max, curM);
                }
            }

            return count + max;
        }
    }
}