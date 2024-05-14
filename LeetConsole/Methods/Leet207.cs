using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 207
    /// </summary>
    public class Leet207
    {
        public bool Action()
        {
            int numCourses = 2;
            var prerequisites = new int[][] { new int[] { 1, 0 } };

            return Function1(numCourses, prerequisites);
        }

        public bool Function1(int numCourses, int[][] prerequisites)
        {
            //全部课程
            var courses = new List<int>();
            for (int i = 0; i < numCourses - 1; i++)
            {
                courses.Add(i);
            }
            //需要先修课程集合为0直接返回true
            if (prerequisites.Length == 0) return true;

            //判断先修课程是否无法成立
            for (int i = 0; i < prerequisites.Length - 1; i++)
            {
                for (int j = 0; j < prerequisites.Length - 1; j++)
                {
                    if (i == j) continue;
                    if (prerequisites[i][0] == prerequisites[j][1]
                        && prerequisites[i][1] == prerequisites[j][0])
                        return false;
                }
            }

            //不能直接学习的课程
            List<int> cantLearnCourses = new List<int>();
            Dictionary<int, List<int>> keys = new Dictionary<int, List<int>>();
            foreach (var p in prerequisites)
            {
                if (keys.ContainsKey(p[1]))
                {
                    keys[p[1]].Add(p[0]);
                }
                else
                {
                    keys.Add(p[1], new List<int>() { p[0] });
                }
                if (cantLearnCourses.Contains(p[0])) continue; cantLearnCourses.Add(p[0]);
            }
            if (cantLearnCourses.Count == numCourses) return false;

            //可以直接学习的课程
            var canLearnCourses = courses.Except(cantLearnCourses);
            HashSet<int> set = new HashSet<int>();
            foreach (var clc in canLearnCourses)
            {
                set.Add(clc);
                //学完当前课程可以学其他

                if (set.Count == numCourses) { return true; }
            }
            if (set.Count == numCourses) { return true; } else { return false; }
            return true;
        }
    }
}