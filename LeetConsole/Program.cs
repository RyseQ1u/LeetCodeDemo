using LeetCode.Utilities.Extensions;
using LeetCode.Methods;
using LeetCode.Methods.Easy;
using LeetCode.Methods.Hard;
using LeetCode.Methods.Middle;
using System;

namespace LeetCode
{
    class Program
    {
        private static void Main(string[] args)
        {
            var leet = new Leet3152();
            var result = leet.Action().CustomToString();

            //Console.WriteLine(result);
            Console.WriteLine(result);
        }
    }
}