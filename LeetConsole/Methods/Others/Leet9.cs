namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 9
    /// </summary>
    public class Leet9
    {
        public bool Action()
        {
            //string s = "4w31am0ets6sl5go5ufytjtjpb7b0sxqbee2blg9ss";
            string s = "a1";
            return Function1(s);
        }

        public bool Function1(string s)
        {
            return ((s[0] + s[1]) & 1) == 1 ? true : false;
        }
    }
}