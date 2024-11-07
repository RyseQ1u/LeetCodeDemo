using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2288
    /// </summary>
    public class Leet2288
    {
        public string Action()
        {
            //var input = new string[] { "aba", "cdc", "eae" };
            //var input = "there are $1 $2 and 5$ candies in the shop";
            var input = "$1e9";
            return DiscountPrices(input, 50);
        }

        #region 方法一

        public string DiscountPrices(string sentence, int discount)
        {
            string result = string.Empty;
            var sp = sentence.Split(' ');
            for (int i = 0; i < sp.Length; i++)
            {
                var item = sp[i];
                if (item.StartsWith('$'))
                {
                    var number = item.Substring(1);
                    if (!IsNumericString(number)) continue;
                    var f = double.TryParse(item.Substring(1), out var d);
                    if (f)
                    {
                        sp[i] = $"${Math.Round(d * (100 - discount) / 100, 2).ToString("0.00")}";
                    }
                }
            }
            result = string.Join(" ", sp);
            return result;
        }

        /// <summary>
        /// 数字判断
        /// </summary>
        /// <param name="input"></param>
        /// <returns></returns>
        public bool IsNumericString(string input)
        {
            // 正则表达式，用于匹配只包含数字和最多一个小数点的字符串
            Regex regex = new Regex(@"^-?\d+(\.\d+)?$");

            // 如果输入字符串匹配该正则表达式，则返回true，否则返回false
            return regex.IsMatch(input);
        }

        /// <summary>
        /// 数字判断
        /// </summary>
        /// <param name="input"></param>
        /// <returns></returns>
        public bool IsNumericStringWithoutRegex(string input)
        {
            bool hasDecimalPoint = false; // 用于标记是否已经遇到过小数点
            foreach (char c in input)
            {
                if (c >= '0' && c <= '9') // 字符是数字
                {
                    continue; // 继续检查下一个字符
                }
                else if (c == '.' && !hasDecimalPoint) // 第一次遇到小数点
                {
                    hasDecimalPoint = true; // 标记已遇到小数点
                    continue; // 继续检查下一个字符
                }
                else // 遇到了非数字或额外的小数点
                {
                    return false; // 不是纯数字和小数点组成的字符串
                }
            }

            // 如果遍历完所有字符，没有遇到非法字符，则是合法的
            return true;
        }

        #endregion 方法一
    }
}