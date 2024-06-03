using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Runtime.CompilerServices;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1103
    /// </summary>
    public class Leet1103

    {
        public int[] Action()
        {
            //4 2
            var candies = 10;
            var num_people = 3;

            return DistributeCandies(10, 3);
        }

        public int[] DistributeCandies(int candies, int num_people)
        {
            var arr = new int[num_people];
            var count = 0;
            for (int i = 1, j = 0; ; i++, j++)
            {
                var reamin = candies - count;
                if (j == num_people)
                {
                    j = 0;
                }
                if (reamin > i)
                {
                    arr[j] += i;
                }
                else
                {
                    arr[j] += reamin;
                    break;
                }
                count += i;
            }
            return arr;
        }
    }
}