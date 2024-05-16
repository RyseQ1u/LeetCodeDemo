using ConsoleApp3.Methods;
using LeetCode.Methods;
using System;

namespace LeetCode
{
    class Program
    {
        private static void Main(string[] args)
        {
            var leet = new Leet1953();
            var result = leet.Action();

            Console.WriteLine(result);
        }
    }
}