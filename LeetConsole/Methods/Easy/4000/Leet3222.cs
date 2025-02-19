﻿using System;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3222
    /// </summary>
    public class Leet3222
    {
        public string LosingPlayer(int x, int y)
        {
            return Math.Min(x, y / 4) % 2 == 0 ? "Alice" : "Bob";
        }
    }
}