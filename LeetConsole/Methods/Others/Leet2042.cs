namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2042
    /// </summary>
    public class Leet2042
    {
        public bool Action()
        {
            string s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
            return Function1(s);
        }

        public bool Function1(string s)
        {
            var split = s.Split(" ");
            int i = 0, j = 0;
            foreach (var item in split)
            {
                if (int.TryParse(item, out i))
                {
                    if (i > j)
                    {
                        j = i;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}