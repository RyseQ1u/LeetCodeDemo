using System;

namespace Leet.Methods
{
    public class Leet1686
    {
        public int Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var value = new int[] { 5, 3, 4, 1, 1 };
            //var value = new int[] { 6, 5, 3, 9, 2, 7 };
            var value1 = new int[] { 1, 2 };
            var value2 = new int[] { 3, 1 };

            return StoneGameVI2(value1, value2);
        }

        public int StoneGameVI(int[] aliceValues, int[] bobValues)
        {
            int n = aliceValues.Length;
            int[][] values = new int[n][];
            for (int i = 0; i < n; i++)
            {
                values[i] = new int[3];
                values[i][0] = aliceValues[i] + bobValues[i];
                values[i][1] = aliceValues[i];
                values[i][2] = bobValues[i];
            }
            Array.Sort(values, (a, b) => b[0] - a[0]);
            int aliceSum = 0, bobSum = 0;
            for (int i = 0; i < n; i++)
            {
                if (i % 2 == 0)
                {
                    aliceSum += values[i][1];
                }
                else
                {
                    bobSum += values[i][2];
                }
            }
            if (aliceSum > bobSum)
            {
                return 1;
            }
            else if (aliceSum == bobSum)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }

        public int StoneGameVI2(int[] aliceValues, int[] bobValues)
        {
            int n = aliceValues.Length;
            int[] ids = new int[n];
            for (int i = 0; i < n; i++)
            {
                ids[i] = i;
            }
            Array.Sort(ids, (i, j) => aliceValues[j] + bobValues[j] - aliceValues[i] - bobValues[i]);
            int diff = 0;
            for (int i = 0; i < n; i++)
            {
                diff += i % 2 == 0 ? aliceValues[ids[i]] : -bobValues[ids[i]];
            }
            return diff.CompareTo(0);
        }
    }
}