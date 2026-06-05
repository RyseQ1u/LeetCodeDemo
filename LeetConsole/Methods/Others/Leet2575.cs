namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2575
    {
        public int[] Action()
        {
            var str = "998244353";
            //var str = "1010";
            var m = 3;
            //var m = 10;

            var r = DivisibilityArray2(str, m);
            return r;
        }

        public int[] DivisibilityArray2(string word, int m)
        {
            int[] res = new int[word.Length];
            long cur = 0;
            for (int i = 0; i < word.Length; i++)
            {
                char c = word[i];
                cur = (cur * 10 + (c - '0')) % m;
                res[i] = (cur == 0) ? 1 : 0;
            }
            return res;
        }

        public int[] DivisibilityArray(string word, int m)
        {
            var r = new int[word.Length];
            var ca = word.ToCharArray();
            var rem = 0;
            var w = m / 10;
            for (int i = 0; i < ca.Length; i++, i += w)
            {
                var curStr = string.Empty;
                for (int j = i; j < i + w + 1; j++)
                {
                    curStr += ca[j];
                }
                var curRem = (int)int.Parse(curStr) % m;
                if (curRem == 0)
                {
                    if (rem == 0)
                    {
                        r[i + w] = 1;
                    }
                    else
                    {
                        if (rem % 3 == 0)
                        {
                            r[i + w] = 1;
                            rem = 0;
                        }
                    }
                }
                else
                {
                    rem += curRem;
                    if (rem % m == 0)
                    {
                        r[i + w] = 1;
                        rem = 0;
                    }
                }
            }

            return r;
        }
    }
}