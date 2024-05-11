using ConsoleApp1.Methods;
using System;
using System.Collections;

namespace ConsoleApp1
{
    class Program
    {
        private static void Main(string[] args)
        {
            var leet = new Leet1146();
            var result = leet.Action();

            Console.WriteLine(result);
        }
    }
}