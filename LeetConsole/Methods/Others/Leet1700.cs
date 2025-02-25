using System.Collections;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1700
    /// </summary>
    public class Leet1700
    {
        public int Action()
        {
            int[] student = new int[] { 1, 1, 1, 0, 0, 1 };
            int[] sandwiches = new int[] { 1, 0, 0, 0, 1, 1 };
            student = new int[] { 1, 1, 0, 0 };
            sandwiches = new int[] { 0, 1, 0, 1 };
            //student = new int[] { 0,0,0,1,1,1,1,0,0,0 };
            //sandwiches = new int[] { 1,0,1,0,0,1,1,0,0,0 };
            return Function2(sandwiches, student);
        }

        public int Function1(int[] sandwiches, int[] student)
        {
            int j = 0, i = 0, c = 0;
            Queue queue = new Queue();
            foreach (var s in student)
            {
                queue.Enqueue(s);
            }
            bool flag = true;
            while (flag)
            {
                int s = (int)queue.Dequeue();
                if (sandwiches[i] == s)
                {
                    i++;
                }
                else
                {
                    queue.Enqueue(s);
                }
                if (queue.Count == 0) flag = false;
                //if ( i == sandwiches.Length) flag = false;
                if (!(queue.Contains(0) && queue.Contains(1)))
                {
                    if (c == 0) c = queue.Count + 1;
                    if (j > c) flag = false;
                    j++;
                }
            }
            return queue.Count;
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="sandwiches"></param>
        /// <param name="student"></param>
        /// <returns></returns>
        public int Function2(int[] sandwiches, int[] student)
        {
            //1的个数
            int s1 = 0;
            foreach (var s in student)
            {
                s1 += s;
            }
            //0的个数
            int s0 = student.Length - s1;
            foreach (var s in sandwiches)
            {
                if (s == 1 && s1 > 0)
                {
                    s1--;
                }
                else if (s == 0 && s0 > 0)
                {
                    s0--;
                }
                else
                {
                    break;
                }
            }

            return s1 + s0;
        }
    }
}