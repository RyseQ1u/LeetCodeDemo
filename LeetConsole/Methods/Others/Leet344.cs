using System;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 344
    /// </summary>
    public class Leet344
    {
        public char[] Action()
        {
            //var source = new string[] { '/*Test program */', 'int main()', '{ ', '  // variable declaration ', 'int a, b, c;', '/* This is a test', '   multiline  ', '   comment for ', '   testing */', 'a = b + c;', '}' };
            //var source = new string[] { 'a/*comment', 'line', 'more_comment*/b' };
            var source = new char[] { 'h', 'e', 'l', 'l', 'o' };

            return ReverseString(source);
        }

        public char[] ReverseString(char[] s)
        {
            s = s.Reverse().ToArray();
            //for (int i = 0, j = s.Length-1; i < s.Length; i++,j--)
            //{
            //    if (j<=i) break;
            //    char tmp = s[i];
            //    s[i] = s[j];
            //    s[j] = tmp;

            //}
            return s;
        }
    }
}