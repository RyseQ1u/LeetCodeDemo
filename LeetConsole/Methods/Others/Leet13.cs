namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 13
    /// </summary>
    public class Leet13
    {
        public int Action()
        {
            string s = "III";
            return Function1(s);
        }

        public int Function1(string s)
        {
            int count = 0;
            for (int i = 0; i < s.Length; i++)
            {
                switch (s[i])
                {
                    case 'I':

                        break;

                    default:
                        break;
                }
            }
            return 0;
        }
    }
}