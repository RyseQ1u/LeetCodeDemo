using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.WebSockets;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3284
    /// </summary>
    public class Leet3284
    {
        public int FinalPositionOfSnake(int n, IList<string> commands)
        {
            int res = 0;
            foreach (string command in commands)
            {
                switch (command[0])
                {
                    case 'U':
                        res -= n;
                        break;

                    case 'D':
                        res += n;
                        break;

                    case 'L':
                        res--;
                        break;

                    case 'R':
                        res++;
                        break;

                    default:
                        break;
                }
            }
            return res;
        }

        public int FinalPositionOfSnake2(int n, IList<string> commands)
        {
            int x = 0, y = 0;
            foreach (string command in commands)
            {
                var c = command[0];
                switch (c)
                {
                    case 'U':
                        x--;
                        break;

                    case 'D':
                        x++;
                        break;

                    case 'L':
                        y--;
                        break;

                    case 'R':
                        y++;
                        break;

                    default:
                        break;
                }
            }
            return x * n + y;
        }
    }
}