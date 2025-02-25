using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    public class Leet1790
    {
        public bool Action()
        {
            //var tasks = new int[] { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };
            //var tasks = new int[] { 66, 66, 63, 61, 63, 63, 64, 66, 66, 65, 66, 65, 61, 67, 68, 66, 62, 67, 61, 64, 66, 60, 69, 66, 65, 68, 63, 60, 67, 62, 68, 60, 66, 64, 60, 60, 60, 62, 66, 64, 63, 65, 60, 69, 63, 68, 68, 69, 68, 61 };
            var r = Function1("", "");
            return r;
        }

        /// <summary>
        /// 1790
        /// </summary>
        /// <returns></returns>
        public bool Function1(string str1, string str2)
        {
            //bool result = false;

            List<char> cList = new List<char>();
            for (int i = 0; i < str1.Length; i++)
            {
                if (str1[i] != str2[i])
                {
                    if (cList.Count == 2)
                    {
                        if (cList[0] == str2[i] && cList[1] == str1[i])
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else if (cList.Count > 2)
                    {
                        return false;
                    }
                    cList.Add(str1[i]);
                    cList.Add(str2[i]);
                }
            }

            return true;
        }
    }
}