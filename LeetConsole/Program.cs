﻿using ConsoleApp3.Methods;
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
            var leet = new Leet3132();
            var result = leet.Action();

            Console.WriteLine(result);
        }
    }
}