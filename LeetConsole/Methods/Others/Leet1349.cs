using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///1349参加考试的最大学生数
    /// </summary>
    public class Leet1349
    {
        public int Action()
        {
            char[][] s = new char[][] { new char[] { '#', '.', '#', '#', '.', '#' }, new char[] { '.', '#', '#', '#', '#', '.' }, new char[] { '#', '.', '#', '#', '.', '#' } };
            //char[][] s = new char[][] { new char[] { '#', '.', '.', '.', '#' }, new char[] { '.', '#', '.', '#', '.' }, new char[] { '.', '.', '#', '.', '.' }, new char[] { '.', '#', '.', '#', '.' }, new char[] { '#', '.', '.', '.', '#' } };
            return MaxStudents2(s);
        }

        /// <summary>
        /// X
        /// </summary>
        /// <returns></returns>
        public int MaxStudents2(char[][] seats)
        {
            int count = 0;
            //上一行的状态
            int[] ints = new int[seats[0].Length];
            bool f = true;
            for (int i = 0; i < seats.Length; i++)
            {
                for (int j = 0; j < seats[i].Length; j++)
                {
                    if (seats[i][j] == '.')
                    {
                        count++;
                        if (true)
                            ints[i] = 1;
                    }
                }
                ints[i] = count;
            }

            return count;
        }

        /// <summary>
        /// X
        /// </summary>
        /// <returns></returns>
        public int MaxStudents(char[][] seats)
        {
            //统计每列的人数
            int[] ints = new int[seats[0].Length];
            for (int i = 0; i < seats[0].Length; i++)
            {
                int cout = 0;
                for (int j = 0; j < seats.Length; j++)
                {
                    if (seats[j][i] == '.')
                    {
                        cout++;
                    }
                }
                ints[i] = cout;
            }

            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < ints.Length; i++)
            {
                if (i % 2 == 0)
                {
                    c2 += ints[i];
                }
                else
                {
                    c1 += ints[i];
                }
            }

            return Math.Max(c1, c2);
        }
    }
}