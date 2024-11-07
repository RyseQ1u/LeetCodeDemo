namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2315
    /// </summary>
    public class Leet2315
    {
        public int Action()
        {
            //var s = "l|*e*et|c**o|*de|";
            var s = "yo|uar|e**|b|e***au|tifu|l";
            //var target = "code";
            return Function1(s);
        }

        public int Function1(string s)
        {
            bool check = true;
            int count = 0;
            foreach (var c in s)
            {
                if (check)
                {
                    if (c == '|')
                    {
                        check = false;
                        continue;
                    }
                    if (c == '*') count++;
                }
                else
                {
                    if (c == '|') check = true;
                    continue;
                }
            }
            return count;
        }
    }
}