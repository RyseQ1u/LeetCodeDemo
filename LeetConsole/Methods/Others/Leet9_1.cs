using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 9
    /// </summary>
    public class Leet9_1
    {
        public bool Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";
            string s = "1000030001";
            return Function1(s);
        }

        public bool Function1(string s)
        {
            int p1 = 0, p2 = s.Length - 1;
            if (s.Length == 1) return true;
            while (true)
            {
                if (s[p1] != s[p2])
                {
                    return false;
                }
                if (p2 == p1 || Math.Abs(p2 - p1) == 1) return true;
                p1++;
                p2--;
            }
        }
    }
}