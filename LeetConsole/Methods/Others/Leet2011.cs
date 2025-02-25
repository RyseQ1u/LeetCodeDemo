namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2011
    /// </summary>
    public class Leet2011
    {
        public int Action()
        {
            string[] s = new string[] { "--X", "++X", "X++" };
            return Function1(s);
        }

        public int Function1(string[] s)
        {
            int count = 0;
            for (int i = 0; i < s.Length; i++)
            {
                switch (s[i])
                {
                    case "--X":
                    case "X--":
                        count--;
                        break;

                    case "++X":
                    case "X++":
                        count++;
                        break;

                    default:
                        break;
                }
            }
            return count;
        }
    }
}