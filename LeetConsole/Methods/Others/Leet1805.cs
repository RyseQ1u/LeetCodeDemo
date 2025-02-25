using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1805
    /// </summary>
    public class Leet1805
    {
        public int Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";
            string s = "kiwlvsvfi6v7s985r0h6s28p7fnl5oupx7wjwuhchinxobbs3cu9znbzw89tvye05a4fmarpha9653cqp6z5hp1n22ighbi6pedqtgldudc8njufv74x1dctkhkvlf57egb464sqj8pgibiibu7ootcfpi6vgjd733j4ehillylhacru9v02ozjgbcqdqaeb3evvmuibc46szvn5pfgzkxedpapndua36534bzhoxckksbotw5jux1bm2f1clvv7wzwbzdr0nycsmw8tb7v30cty4st6cdbvxi9x65jy5fifulqol0s8ol1n4gz7paqzd1g78osqa9i23suvbgxkphafnxdfyx7588esf36ti1ua48rdecqi4xd24vm4ysd50mhrzl3ji4upely8zdtb47lp3cv7ol0fy3h2";
            return Function2(s);
        }

        public int Function1(string s)
        {
            var ts = new HashSet<string>();
            string str = string.Empty;
            foreach (var c in s)
            {
                try
                {
                    int n = int.Parse(c.ToString());
                    str += n;
                }
                catch
                {
                    str += " ";
                }
            }
            var spList = str.Split(' ');
            foreach (var sp in spList)
            {
                if (string.IsNullOrEmpty(sp)) continue;
                int l = 0;

                while (sp.Length - l > 1 && sp[l] == '0')
                {
                    l++;
                }
                ts.Add(sp.Substring(l, sp.Length - l));
            }
            return ts.Count;
        }

        public int Function2(string word)
        {
            var set = new HashSet<string>();
            int n = word.Length, p1 = 0, p2 = 0;
            while (true)
            {
                if (!char.IsDigit(word[p1]))
                {
                    p1++;
                }
                if (p1 == n) break;
                p2 = p1;
                while (p2 < n && char.IsDigit(word[p2]))
                {
                    p2++;
                }
                while (p2 - p1 > 1 && word[p1] == '0')
                {
                    p1++;
                }
                set.Add(word.Substring(p1, p2 - p1));
                p1 = p2;
            }
            return set.Count;
        }
    }
}