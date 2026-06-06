using System;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3280
    /// </summary>
    public class Leet3280
    {
        public string ConvertDateToBinary(string date)
        {
            //切割字符串
            var sp = date.Split('-');
            for (var i = 0; i < sp.Length; i++)
            {
                //转换为int
                var n = int.Parse(sp[i]);
                //转换为二进制字符串
                sp[i] = Convert.ToString(n, 2);
            }
            return string.Join("-", sp);
        }
    }
}