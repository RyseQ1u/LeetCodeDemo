using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 1812
    /// </summary>
    public class Leet1812
    {
        public bool SquareIsWhite(string coordinates)
        {
            //判断奇偶
            var x = coordinates[0] - 'a' + 1;
            var y = coordinates[1] - '0';
            return (x + y) % 2 == 1;
        }
    }
}