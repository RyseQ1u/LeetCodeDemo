using System.Collections.Generic;

namespace Leet.Methods
{
    public class Leet2828
    {
        public bool IsAcronym(IList<string> words, string s)
        {
            if (words.Count != s.Length) return false;
            for (int i = 0; i < words.Count; i++)
            {
                if (words[i][0].Equals(s[i]))
                {
                    return false;
                }
            }
            return true;
        }
    }
}