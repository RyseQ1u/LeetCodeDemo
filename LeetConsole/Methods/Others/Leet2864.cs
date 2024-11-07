using System.Text;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2864
    {
        public string Action()
        {
            var str = "010";
            //var str = "1010";
            //var m = 10;

            var r = MaximumOddBinaryNumber(str);
            return r;
        }

        public string MaximumOddBinaryNumber(string s)
        {
            StringBuilder sb = new StringBuilder();
            int n = 0;
            int m = 0;
            foreach (var c in s)
            {
                if (c == '1')
                {
                    n++;
                }
            }
            while (s.Length > m)
            {
                if (n > 1)
                {
                    sb.Append('1');
                }
                else
                {
                    sb.Append('0');
                }
                m++;
            }
            sb.Append('1');
            return sb.ToString();
        }
    }
}